<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>課題④  BookStore あいまい検索</title>
</head>
<body>
<h1>BookStoreあいまい検索画面</h1>
<hr />
<table>
	<tr>
	  <form:input path="vagueList" value="vagueList"/>
	  <td><input type="submit" value="検索" /></td>
	</tr>
</table>
<hr />
 <p><a href="index">MENUへ</a></p>
<hr />
<%--  <c:if test="${employeeList != null}" >
 <h1>検索結果</h1>
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


</body>
</html>