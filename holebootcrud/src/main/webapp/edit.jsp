<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>We can edit data here</title>
</head>
<body>

<form action="update">
<pre>
<input type="hidden"name="id" value="${s.id }">
   name:<input type="text" name="name" value="${s.name }">
 username;<input type="text" name="username" value="${s.username }">
 password:<input type="text" name="password" value="${s.password }">
  <input type="submit" value="update">

</pre>




</form>



</body>
</html>