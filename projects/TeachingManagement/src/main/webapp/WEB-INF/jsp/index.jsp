<%--
  Created by IntelliJ IDEA.
  User: lws
  Date: 2017/3/30
  Time: 16:38
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
<h2>教学管理平台</h2>
<h3><a href="/Evaluation">在线评教</a></h3>
<h3><a href="/Examination">在线考试</a></h3>
<h3><a href="/Education">教务管理</a></h3>
<h3><a href="/System">系统管理</a></h3>
</body>
</html>
