<%@ taglib uri="abcd" prefix="mytags"%>
<!DOCTYPE HTML>
<html lang='en'>
<head>
<title>Learning about tags</title>
</head>
<body>
<mytags:loop startAt='1' endAt='10'>
<%=value%><br/>
</mytags:loop>
</body>
</html>