<%@page import="web.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
	<h2>员工列表</h2>
	<table cellspacing="0" cellpadding="0"> 
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>薪水</td>
			<td>操作</td>
		</tr>
		<%List<Emp> emp=(List<Emp>)request.getAttribute("emplist"); %>
		<%for(int i=0;i<emp.size();i++){
			Emp e=emp.get(i);
			%>
		<tr>
			<td><%=e.getId() %></td>
			<td><%=e.getName()%></td>
			<td><%=e.getAge() %></td>
			<td><%=e.getSalary() %></td>
			<td colspan="2"><button>修改</button>&nbsp;<button>删除</button></td>
		</tr>
		<%} %>
	</table>
</body>
</html>