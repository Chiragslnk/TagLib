package com.listeners;
import jakarta.servlet.*;
import com.db.*;
import java.sql.*; 
public class ServletContextEventListener implements ServletContextListener
{
public void contextInitialized(ServletContextEvent ev)
{
System.out.println("context initialized"); 
Connection connection=DAOConnection.getConnection();
ServletContext sc=ev.getServletContext();
sc.setAttribute("connection",connection);
}
public void contextDestroyed(ServletContextEvent ev)
{
System.out.println("context destroyed");
}
}