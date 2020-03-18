<%--
  Created by IntelliJ IDEA.
  User: Yau
  Date: 2020/3/1
  Time: 08:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>These ares all books</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column-drag-header">
            <div class="page-header">
                <h1>
                    <small>書籍列表 —————— 所有書籍</small>
                </h1>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/addBookPage">新增书籍</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBooks">顯示全部書籍</a>
            </div>
            <div class="col-md-4 column" style="float: right">
                <form action="${pageContext.request.contextPath}/book/searchBookByName" method="post">
                    <label for="searchBook">Search book(s):
                        <input id="searchBook" type="text" class="form-control" name="bookName" placeholder="請輸入要查詢的書籍名稱(忽略大小寫)">
                    </label>
                    <input type="submit" class="btn" value="查詢" style="float: right">
                </form>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>書籍編號</th>
                    <th>書籍名稱</th>
                    <th>書籍數量</th>
                    <th>書籍詳情</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="book" items="${books}">  <%--不這麼簡寫的話 42行那是不會有提示的--%>
                    <tr>
                        <td>${book.bookId}</td>
                        <td>${book.bookName}</td>
                        <td>${book.bookCounts}</td>
                        <td>${book.detail}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/updateBookPage/${book.bookId}">修改</a>
                            &nbsp;|&nbsp;
                            <a href="${pageContext.request.contextPath}/book/deleteBook/${book.bookId}">刪除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
