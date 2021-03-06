<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DouPHP 管理中心 - 单页面列表 </title>
<meta name="Copyright" content="Douco Design." />
<link href="../css/public.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/global.js"></script>
</head>
<body>
<div id="dcWrap">
 <div id="dcHead">
 <div id="head">
  <div class="logo"><a href="system_message.jsp"><img src="../images/dclogo.gif" alt="logo"></a></div>
  <div class="nav">
   <ul class="navRight">
    <li class="M noLeft"><a href="JavaScript:void(0);">您好，admin</a>
     <div class="drop mUser">
      <a href="manager.php?rec=edit&id=1">编辑我的个人资料</a>
      <a href="manager.php?rec=cloud_account">设置云账户</a>
     </div>
    </li>
    <li class="noRight"><a href="login.php?rec=logout">退出</a></li>
   </ul>
  </div>
 </div>
</div>
<!-- dcHead 结束 --> <div id="dcLeft"><div id="menu">
 <ul class="top">
  <li><a href="index.html"><i class="home"></i><em>管理首页</em></a></li>
 </ul>
 <ul>
  <li><a href="system_message.jsp"><i class="system"></i><em>系统信息管理</em></a></li>
  <li><a href="nav.html"><i class="nav"></i><em>自定义导航栏</em></a></li>
  <li><a href="show.html"><i class="show"></i><em>首页幻灯广告</em></a></li>
  <li class="cur"><a href="page.html"><i class="page"></i><em>单页面管理</em></a></li>
 </ul>
   <ul>
  <li><a href="product_category.html"><i class="productCat"></i><em>商品分类</em></a></li>
  <li><a href="product.html"><i class="product"></i><em>商品列表</em></a></li>
 </ul>
  <ul>
  <li><a href="article_category.html"><i class="articleCat"></i><em>文章分类</em></a></li>
  <li><a href="article.html"><i class="article"></i><em>文章列表</em></a></li>
 </ul>
   <ul class="bot">
  <li><a href="backup.html"><i class="backup"></i><em>数据备份</em></a></li>
  <li><a href="mobile.html"><i class="mobile"></i><em>手机版</em></a></li>
  <li><a href="theme.html"><i class="theme"></i><em>设置模板</em></a></li>
  <li><a href="manager.html"><i class="manager"></i><em>网站管理员</em></a></li>
  <li><a href="manager.php?rec=manager_log"><i class="managerLog"></i><em>操作记录</em></a></li>
 </ul>
</div></div>
 <div id="dcMain">
   <!-- 当前位置 -->
<div id="urHere">DouPHP 管理中心<b>></b><strong>单页面列表</strong> </div>   <div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
    <h3><a href="addpage.html" class="actionBtn">添加单页面</a>单页面列表</h3>
        <div class="page">
           <dl>
        <dt><strong>公司简介</strong><p>about</p></dt>
        <dd><a href="page.php?rec=edit&id=1">编辑</a> | <a href="page.php?rec=del&id=1">删除</a></dd>
      </dl>
           <dl class="child1">
        <dt><strong>企业荣誉</strong><p>honor</p></dt>
        <dd><a href="page.php?rec=edit&id=2">编辑</a> | <a href="page.php?rec=del&id=2">删除</a></dd>
      </dl>
           <dl class="child1">
        <dt><strong>发展历程</strong><p>history</p></dt>
        <dd><a href="page.php?rec=edit&id=3">编辑</a> | <a href="page.php?rec=del&id=3">删除</a></dd>
      </dl>
           <dl class="child1">
        <dt><strong>联系我们</strong><p>contact</p></dt>
        <dd><a href="page.php?rec=edit&id=4">编辑</a> | <a href="page.php?rec=del&id=4">删除</a></dd>
      </dl>
           <dl>
        <dt><strong>人才招聘</strong><p>job</p></dt>
        <dd><a href="page.php?rec=edit&id=5">编辑</a> | <a href="page.php?rec=del&id=5">删除</a></dd>
      </dl>
           <dl>
        <dt><strong>营销网络</strong><p>market</p></dt>
        <dd><a href="page.php?rec=edit&id=6">编辑</a> | <a href="page.php?rec=del&id=6">删除</a></dd>
      </dl>
         </div>
           </div>
 </div>
 <div class="clear"></div>
<div id="dcFooter">
 <div id="footer">
  <div class="line"></div>
 </div>
</div><!-- dcFooter 结束 -->
<div class="clear"></div> </div>
</body>
</html>