package com.beans;
import com.customtags.*; 
public class EmployeeViewBean implements Comparable<EmployeeViewBean>,PageRow
{
private int serialNumber;
private String employeeId;
private String firstName;
private String lastName;
private String gender;
private String isIndian;
private String panNumber;
private String address;
private String contactNumber;
public EmployeeViewBean()
{
this.serialNumber=0;
this.employeeId="";
this.firstName="";
this.lastName="";
this.gender="";
this.isIndian="";
this.panNumber="";
this.address="";
this.contactNumber="";
}
public EmployeeViewBean(int serialNumber,java.lang.String employeeId,java.lang.String firstName,java .lang.String lastName,java.lang.String gender,String isIndian,java.lang.String panNumber,java.lang.String address,java.lang.String contactNumber)
{
this.serialNumber=serialNumber;
this.employeeId=employeeId;
this.firstName=firstName;
this.lastName=lastName;
this.gender=gender;
this.isIndian=isIndian;
this.panNumber=panNumber;
this.address=address;
this.contactNumber=contactNumber;
}
public void setSerialNumber(int serialNumber)
{
this.serialNumber=serialNumber;
}
public int getSerialNumber()
{
return this.serialNumber;
}
public void setEmployeeId(java.lang.String employeeId)
{
this.employeeId=employeeId;
}
public java.lang.String getEmployeeId()
{
return this.employeeId;
}
public void setFirstName(java.lang.String firstName)
{
this.firstName=firstName;
}
public java.lang.String getFirstName()
{
return this.firstName;
}
public void setLastName(java.lang.String lastName)
{
this.lastName=lastName;
}
public java.lang.String getLastName()
{
return this.lastName;
}
public void setGender(java.lang.String gender)
{
this.gender=gender;
}
public java.lang.String getGender()
{
return this.gender;
}
public void setIsIndian(String isIndian)
{
this.isIndian=isIndian;
}
public String getIsIndian()
{
return this.isIndian;
}
public void setPanNumber(java.lang.String panNumber)
{
this.panNumber=panNumber;
}
public java.lang.String getPanNumber()
{
return this.panNumber;
}
public void setAddress(java.lang.String address)
{
this.address=address;
}
public java.lang.String getAddress()
{
return this.address;
}
public void setContactNumber(java.lang.String contactNumber)
{
this.contactNumber=contactNumber;
}
public java.lang.String getContactNumber()
{
return this.contactNumber;
}
public boolean equals(Object object)
{
if(!(object instanceof EmployeeViewBean)) return false; 
EmployeeViewBean other=(EmployeeViewBean)object;
return this.employeeId.equals(other.employeeId);
}
public int hashCode()
{
return this.employeeId.hashCode();
}
public int compareTo(EmployeeViewBean other)
{
return this.employeeId.compareTo(other.employeeId);
}
}