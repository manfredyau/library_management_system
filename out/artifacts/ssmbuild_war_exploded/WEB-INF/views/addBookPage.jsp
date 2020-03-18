<%--
  Created by IntelliJ IDEA.
  User: Yau
  Date: 2020/3/1
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a book</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column-drag-header">
            <div class="page-header">
                <h1>
                    <small>新增書籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label for="bookName">書籍名稱：</label>
            <input type="text" class="form-control" id="bookName" name="bookName" required>
        </div>
        <div class="form-group">
            <label for="bookCount">書籍數量：</label>
            <input type="text" class="form-control" id="bookCount" name="bookCounts" required>
        </div>
        <div class="form-group">
            <label for="bookDetail">書籍詳情：</label>
            <input type="text" class="form-control" id="bookDetail" name="detail" required>
        </div>
        <div class="form-group">
            <input type="submit" class="form-control btn-primary" value="添加">
        </div>
    </form>
</div>
</body>
</html>
