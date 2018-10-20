<?xml version="1.0" encoding="UTF-8" ?>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<style type="text/css">
.error{ color: #FF0000;}

</style>
<title>Database Sample</title>
</head>
<body>
<h1>従業員一覧</h1>
<hr />
<p>${message}</p>
<hr />
<form:form modelAttribute="employeesModel">
<table>
	<tr>
	  <td>ID検索：</td>
	  <td><form:input path="employee_id" /></td>
	  <td>&nbsp;</td>
	</tr>

	<tr>
	  <td>名前検索：</td>
	  <td><form:input path="employee_name" /></td>
	  <td><input type="submit"  value="検索" /></td>
	</tr>
</table>

<form:errors path="*" element="div" cssClass="error" />
</form:form>
<hr />
 
<c:if test="${employeesSelectList.size() > 0}">
	<table border="1">
	<tr><th>従業員 ID</th><th>従業員名</th><th>携帯番号</th><th>メールアドレス</th><th>所属id</th><th>所属</th></tr>
		<c:forEach var="emp" items="${employeesSelectList}">
		<tr>
			<td><c:out value="${emp.employee_id}" /></td>
			<td><c:out value="${emp.employee_name}" /></td>
			<td><c:out value="${emp.employee_phone}" /></td>
			<td><c:out value="${emp.employee_email}" /></td>
 			<td><c:out value="${emp.department_id}" /></td>
			<td><c:out value="${(emp.dept).department_name}" /></td>
		</tr>
		</c:forEach>
	</table>
</c:if> 
<c:if test="${employeesSelectList.size() == 0}">
	<p>no data...</p>
</c:if> 

</body>
</html>