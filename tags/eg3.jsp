<%@ taglib uri="abcd" prefix="mytags"%>
<mytags:sessionDoesNotContain key="user">
<jsp:forward page='/somePage.jsp' />
</mytags:sessionDoesNotContain>
<!DOCTYPE HTML>
<html lang='en'>
<head>
<title>Learning about tags</title>
</head>
<body>
This page should be visible to logged in users only
</body>
</html>