<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>

<head>
</head>
<body>
<table border="1">
    <tr>
        <th>名称</th>
        <th>讲师</th>
        <th>开课日期</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${courses}" var="course">
        <tr>
            <td>${course.name}</td>
            <td>${course.teachName}</td>
            <td>
                <fmt:formatDate value="${course.startTime}" pattern="yyyy-MM-dd"/>
            </td>
            <td>
                <a href="editCourse?iid=${course.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>