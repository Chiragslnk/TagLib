package com.customtags;
import java.util.*;
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*;
public class PageTagSupport extends TagSupport
{
private PageProvider pageProvider;
private List<PageRow> rows;
private String name;
private int pageSize;
private int pageNumber;
private String _for;
public PageTagSupport()
{
this._for="";
this.name="";
this.pageSize=10;
this.pageNumber=1;
}
public void setFor(String _for)
{
this._for=_for;
if(this._for!=null) this._for=this._for.trim();
}
public String getFor()
{
return this._for;
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return this.name;
}
public void setPageSize(int pageSize)
{
if(pageSize>0) this.pageSize=pageSize;
else this.pageSize=10;
}
public int getPageSize()
{
return this.pageSize;
}
public void setPageNumber(int pageNumber)
{
if(pageNumber>0) this.pageNumber=pageNumber;
else this.pageNumber=1;
}
public int getPageNumber()
{
return this.pageNumber;
}
public int doStartTag()
{
if(this._for==null) return SKIP_BODY;
Tag childTag=this;
Tag parentTag;
PageProvider pageProvider;
while(true)
{
parentTag=childTag.getParent();
if(parentTag instanceof PageProvider)
{
pageProvider=(PageProvider)parentTag;
if(pageProvider.getName().equals(this._for))
{
break;
}
}
pageProvider=null;
if(parentTag==null) break;
childTag=parentTag;
}
if(pageProvider==null) return SKIP_BODY; 
pageContext.setAttribute("pageNumber",this.pageNumber);
pageContext.setAttribute("numberOfPages",pageProvider.getNumberOfPages(this.pageSize)); 
this.rows=pageProvider.getPage(this.pageSize,this.pageNumber);
if(this.rows==null) return SKIP_BODY;
return EVAL_BODY_INCLUDE;
}
public PageRow getPageRow(int index)
{
if(index>=0 && index<this.rows.size()) return this.rows.get(index);
return null;
}
public int doEndTag() // will get called when tag ends
{
return EVAL_PAGE;
}
}