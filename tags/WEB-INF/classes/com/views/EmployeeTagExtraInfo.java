package com.views;
import jakarta.servlet.jsp.tagext.*; 
public class EmployeeTagExtraInfo extends TagExtraInfo
{
public VariableInfo[] getVariableInfo(TagData data)
{
VariableInfo v[]=new VariableInfo[2]; 
v[0]=new VariableInfo("serialNumber","java.lang.Integer",true,VariableInfo.NESTED); 
v[1]=new VariableInfo("employee","com.beans.EmployeeViewBean",true,VariableInfo.NESTED);
return v;
}
}