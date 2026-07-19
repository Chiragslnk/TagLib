package com.customtags;
import java.util.*;
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*; 
public class PaginationTagSupport extends TagSupport
{
private String name;
private int pageSize;
private int pageNumber;
public PaginationTagSupport()
{
this.name="";
this.pageSize=10;
this.pageNumber=1;
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
public int doStartTag() // will get called at start of the tag
{
return EVAL_BODY_INCLUDE;
}
public int doEndTag() // will get called when tag ends
{
return EVAL_PAGE;
}
}