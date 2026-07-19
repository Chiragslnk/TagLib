<%@ taglib uri="abcd" prefix="mytags"%>
<mytags:UID/>
<!DOCTYPE HTML>
<html lang='en'>
<head>
<title>Learning about tags</title> 
<link rel='stylesheet' href='css/style.css?version=${uid}'> 
<script src='js/StudentAddForm.js?version=${uid}'></script>
</head>
<body>
<h1>Add Student</h1> 
<span class='error'>${messageBean.message}</span> 
<form action='AddStudent.jsp' onsubmit='return validateForm(this)' method='post'> Roll number <input type='text' id='rollNumber' name='rollNumber'> 
<span class='error' id='rollNumberErrorSection'></span><br/>
Name <input type='text' id='name' name='name'> 
<span class='error' id='nameErrorSection'></span><br/>
<button type='submit'>Add</button>
</form>
</body>
</html>