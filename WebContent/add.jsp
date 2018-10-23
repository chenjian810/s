<%@page import="test20181016.Student"%>
<%@page import="test20181015.web.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>my jsp</title>
<style>
h1, h2 {
	text-align: center;
}

table {
	border: 1px solid #ccc;
	font-family: "Cursive";
	font-size: 30px;
	color: blue;
	margin: 0 auto;
	text-align: center;
}

button {
	background-color: orange;
	color: white;
	border: 0px;
}
</style>
<script type="text/javascript">
function back(){
	history.go(-1);
}
</script>
</head>
<body>
	<%-- <%String s=(String)request.getAttribute("111"); %> --%>
	<h2>${stu.name}的信息</h2>
	<form method="post" action="/s/addstu">
	<table cellspacing="0" cellpadding="0">
		<tr>
			<td>编号</td>
			<td><input type="text" name="id" value=""/></td>
		</tr>
		<tr>
			<td>班级</td>
			<td><input type="text" name="classname" value=""/></td>
		</tr>
		<tr>
			<td>姓名</td>
			<td><input type="text" name="name" value=""/></td>
		</tr>
		<tr>
			<td>学号</td>
			<td><input type="text" name="xuehao" value=""/></td>
		</tr>
		<tr>
			<td>年龄</td>
			<td><input type="text" name="age" value=""/></td>
		</tr>
		<tr>
			<td>分数</td>
			<td><input type="text" name="score" value=""/></td>
		</tr>
		<tr>
			<td>操作</td>
			<td><button type="submit">保存</button><button type="button" onclick="back()">取消</button></td>
		</tr>
	</table>
	</form>
</body>
</html>