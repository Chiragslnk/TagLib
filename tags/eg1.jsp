<%@ taglib uri="abcd" prefix="mytags" %>
<mytags:UID />
<!DOCTYPE HTML>
<html>
<head>
<title>Learning about tags</title>
<script src='eg1.js?version=${uid}'></script>
</head>
<body>
Generated ID is: ${uid}
<br>  
<button type='submit' onclick='doSomething()'>Click Me</button>
</body>
</html>