package com.beans;
public class MessageBean
{
private String message;
public MessageBean()
{
this.message="";
}
public MessageBean(java.lang.String message)
{
this.message=message;
}
public void setMessage(java.lang.String message)
{
this.message=message;
}
public java.lang.String getMessage()
{
return this.message;
}
public boolean equals(Object object)
{
if(!(object instanceof MessageBean)) return false;
MessageBean other=(MessageBean)object;
return this.message.equals(other.message);
}
public int hashCode()
{
return this.message.hashCode();
}
public int compareTo(MessageBean other)
{
return this.message.compareTo(other.message);
}
}