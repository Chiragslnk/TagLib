package com.customtags;
import jakarta.servlet.jsp.tagext.*; 
public class PageNumbersTagExtraInfo extends TagExtraInfo
{
public VariableInfo[] getVariableInfo(TagData data)
{
VariableInfo v[]=new VariableInfo[1]; v[0]=new VariableInfo("pageNumber","java.lang.Integer",true,VariableInfo.NESTED);
return v;
}
}