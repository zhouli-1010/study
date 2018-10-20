<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style type="text/css" >
	td {width=300px;}
</style>
<title>課題④  BookStore 全件検索</title>
</head>
<body>
<h1>BookStore  全件検索</h1>
<hr />
<div>
	<table>
		<tr>
		  <form:input path="allList" value="allList"/>
		  <td><input type="submit" value="検索" /></td>
		</tr>
	</table>
</div>
<hr />
<div>
	 <p><a href="index">MENUへ</a></p>
</div>
<hr />
<div>
<%--  <c:if test="${employeeList != null}" >
 <h1>作者一覧</h1>
	<table border="1">
	<tr><th>作者名</th><th>出版年</th><th>作品名</th> </tr>
		<c:forEach var="emp" items="${employeeList}">
		<tr>
			<td><c:out value="${emp.employee_id}" /></td>
			<td><c:out value="${emp.employee_name}" /></td>
			<td><c:out value="${emp.employee_phone}" /></td>
		</tr>
		</c:forEach>
	</table>
</c:if>
 <c:if test="${employeeList != null}" >
 <h1>作品一覧</h1>
	<table border="1">
	<tr><th>作品名</th><th>出版年</th><th>作者名</th> </tr>
		<c:forEach var="emp" items="${employeeList}">
		<tr>
			<td><c:out value="${emp.employee_id}" /></td>
			<td><c:out value="${emp.employee_name}" /></td>
			<td><c:out value="${emp.employee_phone}" /></td>
		</tr>
		</c:forEach>
	</table>
</c:if>

<c:if test="${employeeList == null} }">
	<p>no data...</p>
</c:if>  --%>
</div>
</body>
</html>