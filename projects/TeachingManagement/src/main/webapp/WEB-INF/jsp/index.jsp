<%--
  Created by IntelliJ IDEA.
  User: lws
  Date: 2017/3/30
  Time: 15:01
  教学管理平台首页
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    final String path = request.getContextPath();
    final String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <title>教学管理平台</title>
    <base href="<%=basePath%>">
</head>
<body>
<h2>教学管理</h2>
<a href="/EvaluationOnline">在线评教</a>
</body>
</html>
