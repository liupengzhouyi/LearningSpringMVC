<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2019-06-19
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>提交表单数据</title></title>
</head>
<body>
    <form action="product/showProduct" method="post">
        产品名称：<input type="text" name="name" value=""><br />
        产品价格：<input type="number" name="price" value=""><br />
        <input type="submit" value="增加商品">
    </form>
</body>
</html>
