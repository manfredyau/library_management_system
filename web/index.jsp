<%--
  Created by IntelliJ IDEA.
  User: Yau
  Date: 2020/3/1
  Time: 07:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>歡迎</title>
  <style>
    a {
      text-decoration: none;
      color: black;
      font-size: 20px;
    }

    h3 {
      width: 180px;
      height: 38px;
      margin: 100px auto;
      text-align: center;
      line-height: 38px;
      background: deepskyblue;
      border-radius: 5px;
    }
  </style>
</head>
<body>
<h3>
  <a href="${pageContext.request.contextPath}/book/allBooks">進入書籍頁面</a>
</h3>
</body>
</html>
