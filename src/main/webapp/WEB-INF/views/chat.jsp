<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>对话</title>
</head>
<body>
	<h1>Chat with <span>${toUserName}</span></h1>
	<p>
		<span>You: ${message}</span>
	</p>
</body>
</html>