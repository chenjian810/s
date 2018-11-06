<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>学生信息页面</title>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>班级</td>
			<td>姓名</td>
			<td>学号</td>
			<td>性别</td>
			<td>年纪</td>
			<td>成绩</td>
		</tr>
		<c:forEach items="${stud}" var="s">
			<tr>
				<td>${s.id }</td>
				<td>${s.classname }</td>
				<td>${s.name }</td>
				<td>${s.xuehao }</td>
				<td>${s.sex }</td>
				<td>${s.age }</td>
				<td>${s.score }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>