<%--
Created by IntelliJ IDEA.
User: 10978
Date: 2020/12/8
Time: 19:47
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="head.jsp"%>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<title>登录</title>
		<link rel="stylesheet" href="../plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="../css/login.css" />
	</head>

	<body class="beg-login-bg">
		<div class="beg-login-box">
			<header>
				<h1>作业管理系统</h1>
			</header>
			<div class="beg-login-main">
				<form action="<%=basePath%>admin.do" class="layui-form" method="post">
					<input name="action" type="hidden" value="login"/>
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe612;</i>
                    </label>
						<input type="text" name="username" lay-verify="username" autocomplete="off" placeholder="这里输入登录名" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
						<input type="password" name="password" lay-verify="password" autocomplete="off" placeholder="这里输入密码" class="layui-input">
					</div>
					<div class="layui-form-item">
						<label class="beg-login-icon">
							<i class="layui-icon">&#xe643;</i>
						</label>
						<input type="text" name="code" lay-verify="code" autocomplete="off" placeholder="这里输入验证码" style="width: 140px;height: 35px">
						<span onclick="refreshimage()"><img src="/xpyProject/kaptcha.jpg" style="width: 100px;height: 35px" id="codeimg"/></span>
					</div>


					<div style="float: left">
						<div class="beg-pull-right">
							<button class="layui-btn layui-btn-primary" type="submit">
                            <i class="layui-icon">&#xe650;</i> 登录
                        </button>
						</div>
						<div class="beg-clear"></div>
					</div>
					<div style="float: right">
						<div class="beg-pull-right">
							<button class="layui-btn layui-btn-primary" type="button" onclick="forget()">
								<i class="layui-icon">&#xe642;</i> 找回密码
							</button>
						</div>
						<div class="beg-clear"></div>
					</div>
				</form>
			</div>
			<footer>
				<p>Beginxpy © </p>
			</footer>
		</div>
		<script type="text/javascript" src="../plugins/layui/layui.js"></script>
		<script>
            function refreshimage() {
                var cap = document.getElementById('codeimg');
                cap.src = "/xpyProject/kaptcha.jpg";
            }
            function forget() {
                // window.location.href="register.jsp";
            }
		</script>
	</body>

</html>