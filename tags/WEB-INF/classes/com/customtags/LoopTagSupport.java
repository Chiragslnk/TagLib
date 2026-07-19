package com.customtags;
import jakarta.servlet.jsp.*;
import jakarta.servlet.jsp.tagext.*;
public class LoopTagSupport extends BodyTagSupport
{
private int startAt;
private int endAt;
public void setStartAt(int startAt)
{
this.startAt=startAt;
}
private int value;
public int getStartAt()
{
return this.startAt;
}
public void setEndAt(int endAt)
{
this.endAt=endAt;
}
public int getEndAt()
{
return this.endAt;
}
public int doStartTag()
{
if(this.startAt>this.endAt) return SKIP_BODY;
this.value=this.startAt;
pageContext.setAttribute("value",value);//set value agnest the scripting variable
return EVAL_BODY_INCLUDE;
}
public int doAfterBody()
{
this.value++;
if(this.value>this.endAt) return SKIP_BODY;
pageContext.setAttribute("value",value);//set value agnest the scripting variable
return EVAL_BODY_AGAIN;
}
public int doEndTag()
{
return EVAL_PAGE;
}
}