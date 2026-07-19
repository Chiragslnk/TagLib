package com.customtags;
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*;
public class RequestDoesNotContainTagSupport extends TagSupport
{
private String key;
private boolean processPage;
public RequestDoesNotContainTagSupport()
{
this.key="";
}
public void setKey(String key)
{
this.key=key;
}
public String getKey()
{
return this.key;
}
public int doStartTag()
{
try
{
processPage=(pageContext.getAttribute(key,pageContext.REQUEST_SCOPE)!=null);
System.out.println("key = " + key);
System.out.println("value = " + processPage);
if(!processPage) return EVAL_BODY_INCLUDE;
}catch(Exception e)
{
}
return SKIP_BODY;
}
public int doEndTag()
{
return (processPage)?EVAL_PAGE:SKIP_PAGE;
}
}