<%@ taglib uri="abcd" prefix="mytags"%>
<mytags:UID/>
<!DOCTYPE HTML>
<html lang='en'>
<head>
<title>Learning about tags</title>
</head>
<body>
<h1>Employees</h1>
<mytags:employee name="empView"> <mytags:page name='pg' pageSize='5' pageNumber='${param.pageNumber}' for='empView'>
${pageNumber}/${numberOfPages}<br/><br/>
S.No.
Id.
Name
Gender
Indian
Contact no.
<mytags:pageRow of='pg' beanName='employee'>
${employee.serialNumber}
${employee.employeeId}
${employee.firstName} ${employee.lastName}
${employee.gender}
${employee.isIndian}
${employee.contactNumber}<br/>
</mytags:pageRow>
</mytags:page>
</mytags:employee>
</body>
</html>