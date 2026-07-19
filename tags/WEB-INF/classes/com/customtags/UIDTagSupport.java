package com.customtags;
import jakarta.servlet.jsp.tagext.*;
import java.util.*;
import jakarta.servlet.jsp.*;
public class UIDTagSupport extends TagSupport
{
public int doStartTag()
{
System.out.println("in doStartTag");
String uniqueId=UUID.randomUUID().toString();
System.out.println(uniqueId);
pageContext.setAttribute("uid",uniqueId,pageContext.REQUEST_SCOPE);
return SKIP_BODY;
}
public int doEndTag()
{
System.out.println("in doEndTag");
return EVAL_PAGE;
}


}