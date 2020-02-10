<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head></head>
<form action="updateCourse.action" method="post">
    <input name="id" value="${course.id}" hidden="hidden"/>
    <input name="name" value="${course.name}"/>
    <input name="teachName" value="${course.teachName}"/>
    <%--    <input name="startTime" type="date" value='<fmt:formatDate value="${course.startTime}" pattern="yyyy-MM-dd"/>'/>--%>
    <input name="score" type="number" value="${course.score}"/>
    <input name="hours" type="number" value="${course.hours}"/>
    <input type="submit">
</form>
<body>
</body>
</html>