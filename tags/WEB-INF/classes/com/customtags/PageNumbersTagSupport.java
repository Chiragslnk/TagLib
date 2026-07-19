package com.customtags;
import java.util.*;
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*; 
public class PageNumbersTagSupport extends BodyTagSupport
{
private PaginationTagSupport paginationTagSupport;
private String paginator;
private int numberOfPages;
private int pageNumber;
public PageNumbersTagSupport()
{
this.paginator="";
this.paginationTagSupport=null;
}
public void setPaginator(String paginator)
{
this.paginator=paginator;
}
public String getPaginator()
{
return this.paginator;
}
public int doStartTag()
{
if(this.paginator!=null && this.paginator.trim().length()>0)
{
Tag childTag=this;
Tag parentTag;
int x=1;
while(true)
{
parentTag=childTag.getParent();
if(parentTag instanceof PaginationTagSupport)
{
this.paginationTagSupport=(PaginationTagSupport)parentTag; if(this.paginationTagSupport.getName().equals(this.paginator))
{
break;
}
}
this.paginationTagSupport=null;
if(parentTag==null) break;
childTag=parentTag;
x++;
}
}
int pageSize=-1;
int pageNumber=-1;
if(this.paginationTagSupport!=null)
{
pageSize=this.paginationTagSupport.getPageSize(); pageNumber=this.paginationTagSupport.getPageNumber();
}
if(pageSize==-1) return SKIP_BODY;
return EVAL_BODY_INCLUDE;
}
public int doAfterBody()
{
return EVAL_BODY_AGAIN;
}
public int doEndTag()
{
return EVAL_PAGE;
}
}