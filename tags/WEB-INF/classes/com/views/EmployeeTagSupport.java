package com.views;
import com.customtags.*;
import java.sql.*;
import com.db.*;
import com.beans.*;
import java.util.*;
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*; 
public class EmployeeTagSupport extends TagSupport implements PageProvider
{
private String name;
public EmployeeTagSupport()
{
this.name="";
}
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return this.name;
}
public int doStartTag()
{
return EVAL_BODY_INCLUDE;
}
public int doEndTag()
{
return EVAL_PAGE;
}
public int getNumberOfPages(int pageSize)
{
int numberOfPages=0;
try
{
Connection connection=(Connection)pageContext.getAttribute("connection",pageContext.APPLICATION_SCOPE);
if(connection==null)
{
System.out.println("DB connection error");//ideally this sholud be in a log file.
return numberOfPages;
}
ResultSet resultSet;
Statement statement=connection.createStatement();
resultSet=statement.executeQuery("Select count(*) as cnt from employee_view");
resultSet.next();
int cnt=resultSet.getInt("cnt");
resultSet.close();
statement.close();
numberOfPages=cnt/pageSize;
if(numberOfPages!=0)numberOfPages++;
}catch(SQLException sqlException)
{
System.out.println(sqlException);
}
return numberOfPages;
}
public List<PageRow> getPage(int pageSize, int pageNumber)
{
ArrayList<PageRow>employees;
employees=new ArrayList<>();
Connection connection=(Connection)pageContext.getAttribute("connection",PageContext.APPLICATION_SCOPE);
if(connection==null)
{
System.out.println("DB connection error");
return employees;
}
try{
ResultSet resultSet;
PreparedStatement preparedStatement; 
preparedStatement=connection.prepareStatement("select * from employee_view limit ?,?"); preparedStatement.setInt(1,pageSize*(pageNumber-1));
preparedStatement.setInt(2,pageSize);
resultSet=preparedStatement.executeQuery();
int serialNumber=pageSize*(pageNumber-1)+1;
EmployeeViewBean employeeViewBean;while(resultSet.next())
{
employeeViewBean=new EmployeeViewBean();
employeeViewBean.setSerialNumber(serialNumber); employeeViewBean.setEmployeeId(resultSet.getString("employee_id").trim()); employeeViewBean.setFirstName(resultSet.getString("first_name").trim()); employeeViewBean.setLastName(resultSet.getString("last_name").trim()); employeeViewBean.setGender(resultSet.getString("gender")); employeeViewBean.setIsIndian(resultSet.getString("is_indian")); employeeViewBean.setPanNumber(resultSet.getString("pan_number").trim()); employeeViewBean.setAddress(resultSet.getString("address").trim()); employeeViewBean.setContactNumber(resultSet.getString("contact_number").trim());
employees.add(employeeViewBean);
serialNumber++;
}
resultSet.close();
preparedStatement.close();
}catch(SQLException sqlException)
{
System.out.println(sqlException);
}
return employees;
}
}
