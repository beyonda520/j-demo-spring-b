<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
<title>登录</title>
</head>
<body>
	<h1>login</h1>
	<form id="loginForm" action="./logon" method="post">
	<p>
		<label>用户名:</label><input type="text" maxlength="30" size="50" id="userName" name="userName" />
	</p>
	<div><a href="#" onclick="javascript:perfLogin();">登录</a></div>
	</form>
</body>
<script>
function perfLogin() {
	var t = document.getElementById("userName");
	if(t.value == null || t.value == '') {
		return false;
	}
	document.getElementById("loginForm").submit();
}
</script>
</html>