package com.customtags;
import java.util.*;
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*;
public class FormIdTagSupport extends TagSupport
{
public int doStartTag() // will get called at start of the tag
{
try
{
String uniqueFormId=UUID.randomUUID().toString();
String formId="formId1233923349233ssde3432"; 
pageContext.setAttribute(uniqueFormId,uniqueFormId,PageContext.SESSION_SCOPE);
JspWriter jspWriter;
jspWriter=pageContext.getOut(); 
jspWriter.println("<input type='hidden' id='"+formId+"' name='"+formId+"' value='"+uniqueFormId+"'>"
);
}catch(Exception exception)
{
}
return SKIP_BODY;
}
public int doEndTag() // will get called when tag ends
{
System.out.println("in doEndTag");
return EVAL_PAGE;
/*if value of EVAL_PAGE is returned, the rest of the jsp
on which the tag has been placed will be processed
if value of SKIP_PAGE is returned, the rest of the jsp
on which the tag has been placed will be ignored
*/
}
}