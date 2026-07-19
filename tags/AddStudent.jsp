<jsp:useBean id='studentBean' class='com.beans.StudentBean' scope='request' />
<jsp:setProperty name='studentBean' property='*' />
<jsp:forward page='/addStudent'/>