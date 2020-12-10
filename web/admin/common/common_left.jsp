<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>DouPHP 管理中心 - 单页面列表 </title>
	<meta name="Copyright" content="Douco Design." />
	<link href="../../css/public.css" rel="stylesheet" type="text/css">
	<script type="text/javascript" src="../../js/jquery.min.js"></script>
	<script type="text/javascript" src="../../js/global.js"></script>
</head>
<body>
<div id="dcLeft">
	<div id="menu">
		<ul class="top">
			<li><a href="index.html"><i class="home"></i><em>系统功能菜单</em></a></li>
		</ul>
		<ul>
			<li ${param.type == "class_add" ? " class='cur'":"" }><a href="${contextPath}/Servlet/CategoryServlet?task=add"><i class="page"></i><em>分类添加</em></a></li>
			<li ${param.type == "class_list" ? " class='cur'":"" }><a href="${contextPath}/Servlet/CategoryServlet?task=list"><i class="product"></i><em>分类管理</em></a></li>
		</ul>
		<ul>
			<li ${param.type == "item_add" ? " class='cur'":"" }><a href="${contextPath}/Servlet/ItemServlet?task=add"><i class="productCat"></i><em>商品添加</em></a></li>
			<li ${param.type == "item_list" ? " class='cur'":"" }><a href="${contextPath}/Servlet/ItemServlet?task=list"><i class="product"></i><em>商品管理</em></a></li>
		</ul>
		<ul>
			<li ${param.type == "user_admin" ? " class='cur'":"" }><a href="${contextPath}/Servlet/UserServlet?task=systemList"><i class="manager"></i><em>系统用户管理</em></a></li>
			<li ${param.type == "user_register" ? " class='cur'":"" }><a href="${contextPath}/Servlet/UserServlet?task=registerList"></i><em>注册用户管理</em></a></li>
		</ul>
		<ul>
			<li ${param.type == "order_list" ? " class='cur'":"" }><a href="${contextPath}/Servlet/OrderServlet?task=add"><i class="productCat"></i><em>订单管理</em></a></li>
			<li ${param.type == "order_count" ? " class='cur'":"" }><a href="${contextPath}/Servlet/OrderServlet?task=list"><i class="product"></i><em>订单统计</em></a></li>
		</ul>
		<ul class="bot">
			<li ${param.type == "user_info" ? " class='cur'":"" }><a href="${contextPath}/Servlet/OrderServlet?task=userInfo"><i class="backup"></i><em>用户信息修改</em></a></li>
			<li ${param.type == "user_pwd" ? " class='cur'":"" }><a href="${contextPath}/Servlet/OrderServlet?task=userPwd"><i class="mobile"></i><em>密码修改</em></a></li>
			<li ${param.type == "system_logout" ? " class='cur'":"" }><a href="${contextPath}/Servlet/LogoutServlet?task=list"><i class="managerLog"></i><em>退出系统</em></a></li>
		</ul>
	</div>
</div>
</body>
</html>