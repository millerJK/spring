<%--
  Created by IntelliJ IDEA.
  User: tangzy
  Date: 2018/11/26
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>form表单提交数据</title>
</head>
<body>
<form action="/formDeal" method="post">
    username:<input type="text" name="username" value="46515458"/><br><br>
    password:<input type="text" name="password" value="mima"/><br><br>
    dog name:<input type="text" name="dog.name" value="xiaoheihei"/><br><br>
    dog age :<input type="text" name="dog.age" value="2"/><br><br>
    <input type="submit" value="提交"></form>
</form>
</body>
</html>
