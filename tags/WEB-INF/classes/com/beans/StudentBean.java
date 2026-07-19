package com.beans;
import java.util.*; 
public class StudentBean implements Comparable<StudentBean>
{
private int rollNumber;
private String name;
private int age;
public StudentBean()
{
this.rollNumber=0;
this.name="";
this.age=0;
}
public StudentBean(int rollNumber,java.lang.String name,int age)
{
this.rollNumber=rollNumber;
this.name=name;
this.age=age;
}
public void setRollNumber(int rollNumber)
{
this.rollNumber=rollNumber;
}
public int getRollNumber()
{
return this.rollNumber;
}
public void setName(java.lang.String name)
{
this.name=name;
}
public java.lang.String getName()
{
return this.name;
}
public void setAge(int age)
{
this.age=age;
}
public int getAge()
{
return this.age;
}
public boolean equals(Object object)
{
if(!(object instanceof StudentBean)) return false;
StudentBean other=(StudentBean)object;
return this.rollNumber==other.rollNumber;
}
public int hashCode()
{
return (int)(this.rollNumber);
}
public int compareTo(StudentBean other)
{
return (int)this.rollNumber-(int)other.rollNumber;
}
}