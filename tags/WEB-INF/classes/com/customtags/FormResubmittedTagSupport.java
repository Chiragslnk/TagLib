package com.customtags;
import java.util.*;
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*; public class FormResubmittedTagSupport extends TagSupport
{
public int doStartTag() // will get called at start of the tag
{
try
{
HttpServletRequest request; 
request=(HttpServletRequest)pageContext.getRequest(); 
String formId=request.getParameter("formId1233923349233ssde3432"); 
if(formId==null || pageContext.getAttribute(formId,PageContext.SESSION_SCOPE)==null)
{
return EVAL_BODY_INCLUDE;
}
pageContext.removeAttribute(formId,PageContext.SESSION_SCOPE);
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