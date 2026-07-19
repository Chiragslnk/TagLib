package com.db;
import java.sql.*;
public class DAOConnection
{
private DAOConnection(){}
public static Connection getConnection()
{
try
{
Class.forName("com.mysql.cj.jdbc.Driver"); return DriverManager.getConnection("jdbc:mysql://localhost:3306/app_two_db","app_two","app_two");
}catch(Exception e)
{
return null;
}
}
}