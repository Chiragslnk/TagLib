package com.customtags;
import java.util.*;
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*; 
public class PageRowTagSupport extends BodyTagSupport
{
private PageTagSupport pageTagSupport;
private String of;
private String beanName;
private int index;
public PageRowTagSupport()
{
this.pageTagSupport=null;
this.of="";
this.beanName="";
}
public void setOf(String of)
{
this.of=of;
if(this.of!=null) this.of=this.of.trim();
}
public String getOf()
{
return this.of;
}
public void setBeanName(String beanName)
{
this.beanName=beanName; 
if(this.beanName!=null) this.beanName=this.beanName.trim();
}
public String getBeanName()
{
return this.beanName;
}
public int doStartTag()
{
if(this.of==null) return SKIP_BODY;
Tag childTag=this;
Tag parentTag;
while(true)
{
parentTag=childTag.getParent();
if(parentTag instanceof PageTagSupport)
{
pageTagSupport=(PageTagSupport)parentTag;
if(this.pageTagSupport.getName().equals(this.of))
{
break;
}
}
this.pageTagSupport=null;
if(parentTag==null) break;
childTag=parentTag;
}
if(pageTagSupport==null) return SKIP_BODY;
this.index=0; 
PageRow pageRow=pageTagSupport.getPageRow(index);
if(pageRow==null) return SKIP_BODY;
pageContext.setAttribute(this.beanName,pageRow);
return EVAL_BODY_INCLUDE;
}
public int doAfterBody()
{
this.index++; 
PageRow pageRow=pageTagSupport.getPageRow(index);
if(pageRow==null) return SKIP_BODY;
pageContext.setAttribute(this.beanName,pageRow);
return EVAL_BODY_AGAIN;
}
public int doEndTag() // will get called when tag ends
{
return EVAL_PAGE;
}
}