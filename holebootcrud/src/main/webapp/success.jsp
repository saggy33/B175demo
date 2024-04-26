<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>data store successfully </h1>

<a href="regi">add more data</a>

<table border="2px">
<tr>
<th>id</th>
<th>name</th>
<th>username</th>
  <th>password</th>
  <th>action
  </th>
</tr>
<c:forEach items="${ data}" var="s">
<tr>
<td>${s.id}</td>
<td>${s.name}</td>
<td>${s.username}</td>
<td>${s.password}</td>
<td> <a href="delete?id=${s.id }">DELETE</a> ||<a href="edit?id=${s.id }">EDIT</a> </td>

</tr>


</c:forEach>
</table>
</body>
</html>
