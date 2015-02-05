<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>首页</title>
</head>
<body>
	<h1>欢迎，<span>${userName}</span></h1>
	<p>
		当前有<span>${onlineUserCount}</span>个用户在线。
		<ul>
			<c:forEach var="name" items="${onlineUserList}">
				<li>
				<c:choose>
					<c:when test="${name == userName}">
						--
					</c:when>
					<c:otherwise>
						<a href="./hello/${name}?message=Hi, this's ${userName}. Nice to meet you.">Hi</a>
					</c:otherwise>
				</c:choose>
				<span style="margin-left:10px;">${name}</span>
				</li>
			</c:forEach>
		</ul>
	</p>
</body>
</html>