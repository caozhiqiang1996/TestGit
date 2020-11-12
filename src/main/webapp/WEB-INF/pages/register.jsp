<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <link href="bootstrap\css\bootstrap.css" rel="stylesheet">
    <script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
    <script src="bootstrap\js\bootstrap.js"></script>
    <link href="css\register.css" rel="stylesheet">
</head>
<style>
    body{
        background: url("/img/homepage/u19.jpg");
        background-size: cover;
    }
</style>
<body>
<form action="reguser.action" method="get">
    <div class="form-group">
        <label for="name" class="col-sm-2 control-label">用户名</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="name" name="user_name" placeholder="请输入用户名">
        </div>
    </div>
    <div class="form-group">
        <label for="pwd" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="pwd" name="user_password" placeholder="请输入密码">
        </div>
    </div>
    <div class="form-group">
        <label for="email" class="col-sm-2 control-label">邮箱</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="email" name="user_email" placeholder="请输入邮箱">
        </div>
    </div>
    <div class="form-group">
        <label for="address" class="col-sm-2 control-label">手机号</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" id="address" name="user_phone" placeholder="请输入手机号">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="form-control">注册</button>
        </div>
    </div>
</form>
</body>
</html>