<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/7
  Time: 17:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.reformer.wt_census.model.*" %>
<%@ page import="com.reformer.wt_census.controller.*" %>
<%@ page import="com.reformer.wt_census.dao.*" %>
<%@ page import="java.util.*" %>
<html>
<head>
    <title>统计</title>
</head>
<body>
<table style="width: 100%">
    <tr>
        <th>姓名</th>
        <th>时间</th>
    </tr>
    <c:forEach items="${userList}" var="us">
        <tr>
            <th>${us.username}</th>
            <th>${us.u_time}</th>
        </tr>
    </c:forEach>
</table>
<div style="text-align: center">
    <a href="/tiaozhuanye">进入</a>
</div>
</body>
</html>
