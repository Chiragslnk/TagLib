<%@ taglib uri="abcd" prefix="mytags"%>
<mytags:UID/>
<!DOCTYPE HTML>
<html lang='en'>
<head>
<title>Learning about tags</title>
</head>
<body>
<form action='/tags/eg2processor.jsp'>
Name <input type='text' id='name' name='name'>
<mytags:formId/>
<br/>
<button type='submit'>Submit</button>
</form>
</body>
</html>