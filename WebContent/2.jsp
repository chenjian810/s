<%@page import="test20181016.Student"%>
<%@page import="test20181015.web.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>my jsp</title>
<style>
h1,h2{
text-align: center;
}
	table{
		border:1px solid #ccc;
		font-family: "Cursive";
		font-size: 30px;
		color:blue;
		margin:0 auto;
		text-align: center;
	}
	button {
	background-color: orange;
	color:white;
	border:0px; 
	}
</style>
</head>
<body>
	<%-- <%String s=(String)request.getAttribute("111"); %> --%>
	<h1>${aaa}你好</h1>
	<h2>学生列表</h2>
	<table cellspacing="0" cellpadding="0"> 
		<tr>
			<td>编号</td>
			<td>班级</td>
			<td>姓名</td>
			<td>学号</td>
			<td>年龄</td>
			<td>分数</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${stulist}" var="s">
		<tr>
		<td>${s.id }</td>
		<td>${s.classname }</td>
		<td>${s.name }</td>
		<td>${s.xuehao }</td>
		<td>${s.age}</td>
		<td>${s.score }</td>
			<td colspan="2"><button>修改</button>&nbsp;<button>删除</button></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>