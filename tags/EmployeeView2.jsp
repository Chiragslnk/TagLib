<%@ taglib uri="abcd" prefix="mytags"%>
<mytags:UID/>
<DOCTYPE HTML>
<html lang='en'>
<head>
<title>Learning about Tags</title>
</head>
<body>
<h1>Employees</h1>
<mytags:employee name="empView">
<mytags:page name='pg' pageSize='5' pageNumber='${param.pageNumber}' for='empView'>
${pageNumebr}/${numberOfPages}
S.No.
Id.
Name
Gender
Indian
Contact no.
<mytags:pageRow of='pg'>
${serialNumber}
${employee.employeeId}
${employee.firstName} ${employee.lastName}
${employee.gender}
${employee.isIndian}
${employee.contactNumber}<br/>
</mytags:pageRow>
<mytags:pageNumebrs pagination='employeeTable'>
<a href='EmployeeView.jsp?pageNumber=<%=pageNumber%>'><%=pageNumber%></a>&nbsp;&nbsp;
</mytags:pageNumbers>
</mytags:page>
</mytags:employee>
</body>
</html>