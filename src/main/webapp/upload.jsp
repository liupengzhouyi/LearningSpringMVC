<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2019-06-20
  Time: 00:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="upload/uploadImage" method="post" enctype="multipart/form-data">
    选择图片:<input type="file" name="multipartFile" accept="image/*" />
    <br>
    <input type="submit" value="上传">
</form>
</body>
</html>
