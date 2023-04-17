<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Library Page</title>
</head>
<body>
<sf:form method="post" action="/saveBook" modelAttribute="book">
    <sf:input type="hidden" path="library_id"/>
    Library title: <sf:input path="title"/> <br>
    Library pages: <sf:input path="pages"/> <br>
    <input type="submit" value="Save">
</sf:form>
</body>
</html>
