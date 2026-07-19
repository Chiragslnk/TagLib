package com.servlets;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import com.beans.*;
public class AddStudent extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
StudentBean studentBean; 
studentBean=(StudentBean)request.getAttribute("studentBean");
// assume that rollNumber 101 exists
// I am not writing jdbc code
if(studentBean.getRollNumber()==101)
{
MessageBean messageBean=new MessageBean(studentBean.getRollNumber()+" exists");
request.setAttribute("messageBean",messageBean);
RequestDispatcher requestDispatcher; 
requestDispatcher=request.getRequestDispatcher("/StudentAddForm.jsp");
requestDispatcher.forward(request,response);
}
else
{
// code to save data to database 
MessageBean messageBean=new MessageBean("Student added");
request.setAttribute("messageBean",messageBean); 
request.setAttribute("nextAction","StudentAddForm.jsp");
RequestDispatcher requestDispatcher; 
requestDispatcher=request.getRequestDispatcher("/Notification.jsp");
requestDispatcher.forward(request,response);
}
}catch(Exception exception)
{
System.out.println(exception); // for testing
// ideally over here the exception related message
// should go in a log file
}
}
}