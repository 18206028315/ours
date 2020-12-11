<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>DouPHP 管理中心 - 单页面列表 </title>
    <meta name="Copyright" content="Douco Design."/>
    <link href="../css/public.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="../js/jquery.min.js"></script>
    <script type="text/javascript" src="../js/global.js"></script>
    <!--下面三行是美化警告弹窗-->
    <script src="https://cdn.bootcss.com/sweetalert/1.1.3/sweetalert.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://www.huangwx.cn/css/sweetalert.css">
    <script type="text/javascript" src="https://www.huangwx.cn/js/sweetalert-dev.js"></script>
</head>
<body>
<div id="dcWrap">
    <div id="dcHead">
        <div id="head">
            <div class="logo"><a href="system_message.jsp"><img src="../images/dclogo.gif" alt="logo"></a></div>
            <div class="nav">
                <ul>
                    <li class="M"><a href="JavaScript:void(0);" class="topAdd">新建</a>
                        <div class="drop mTopad"><a href="product.php?rec=add">商品</a> <a
                                href="article.php?rec=add">文章</a> <a href="nav.php?rec=add">自定义导航</a> <a
                                href="show.html">首页幻灯</a> <a href="page.php?rec=add">单页面</a> <a
                                href="manager.php?rec=add">管理员</a> <a href="link.html"></a></div>
                    </li>
                    <li><a href="../index.php" target="_blank">查看站点</a></li>
                    <li><a href="index.php?rec=clear_cache">清除缓存</a></li>
                    <li><a href="http://www.mycodes.net" target="_blank">帮助</a></li>
                    <li class="noRight"><a href="module.html">DouPHP+</a></li>
                </ul>
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
    <!-- dcHead 结束 -->
    <div id="dcLeft">
        <div id="menu">
            <ul class="top">
                <li><a href="system_message.jsp"><i class="home"></i><em>管理首页</em></a></li>
            </ul>
            <ul>
                <li><a href="system.html"><i class="system"></i><em>系统信息管理</em></a></li>
                <li><a href="nav.html"><i class="nav"></i><em>自定义导航栏</em></a></li>
                <li><a href="show.html"><i class="show"></i><em>首页幻灯广告</em></a></li>
                <li><a href="page.jsp"><i class="page"></i><em>单页面管理</em></a></li>
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
        </div>
    </div>
    <div id="dcMain">
        <!-- 当前位置 -->
        <div id="urHere">DouPHP 管理中心<b>></b><strong>系统信息管理</strong></div>
        <div class="mainBox" style="height:auto!important;height:550px;min-height:550px;">
            <h3><a href="add_product_category.html" class="actionBtn add">添加管理员</a>管理员列表</h3>
            <table width="100%" border="0" cellpadding="8" cellspacing="0" class="tableBasic">

                <tr>
                    <th width="120" align="center">序号</th>
                    <th align="center">账号</th>
                    <th width="160" align="center">密码</th>
                    <th width="160" align="center">手机号码</th>
                    <th width="160" align="center">操作</th>
                </tr>
                <tbody id="tbody1">

                </tbody>
            </table>
        </div>
    </div>
    <div class="clear"></div>
    <div id="dcFooter">
        <div id="footer">
            <div class="line"></div>
            <ul>
                版权所有 © 2013-2015 漳州豆壳网络科技有限公司，并保留所有权利。
            </ul>
        </div>
    </div><!-- dcFooter 结束 -->
    <div class="clear"></div>
</div>
<script src="http://www.mycodes.net/js/tongji.js"></script>
<%--<script src="http://www.mycodes.net/js/youxia.js" type="text/javascript"></script>--%>
<script type="text/javascript">
    $(function () {
        function load(pageNo) {
            $.ajax({
                url: "http://localhost:8080/xpyProject/admin.do",
                data: {action: "queryAdminPage", pageNo: pageNo},
                type: "GET",
                dataType: "text",
                success: function (data) {
                    // data代表服务器回传的数据
                    initData(data);
                }
            });
        }
        load(1);

        // function page(jsonObj) {
        //     //前端分页
        //     $("#pageButton").empty();
        //     $("#totalPageCount").html("共" + jsonObj.pageTotal + "页");
        //     for (let i = 1; i <= jsonObj.pageTotal; i++) {
        //         if (i == jsonObj.pageNo) {
        //             $("#pageButton").append('<button class="page-btn btn btn-primary">' + i + '</button>\n');
        //         } else {
        //             $("#pageButton").append('<button class="page-btn btn btn-default">' + i + '</button>\n');
        //         }
        //     }
        //     $(".page-btn").on("click", function () {
        //         load($(this).text());
        //     })
        // }
        function initData(data) {

            let jsonObj = JSON.parse(data);

                let buttons = "<td align=\"center\">\n" +
                "<button type=\"button\" class=\"delbtn btn btn-danger btn-sm\">删除</button>\n" +
                "</td>";
            // page(jsonObj);
             $("#tbody1").empty();
            //数据回填
            for (let i = 0; i < jsonObj.items.length; i++) {
                var trNode = $("<tr></tr>");
                trNode.append("<td width=\"120\">" + jsonObj.items[i].a_id + "</td>");
                trNode.append("<td width=\"220\">" + jsonObj.items[i].a_username + "</td>");
                trNode.append("<td width=\"160\">" + jsonObj.items[i].a_password + "</td>");
                trNode.append("<td width=\"160\">" + jsonObj.items[i].a_phone + "</td>");
                trNode.append(buttons);
                $("#tbody1").append(trNode);
            }

            //删除按钮绑定点击事件
            $(".delbtn").on("click", function () {
                let id = $($(this).parents("tr").children("td")[0]).html().trim();
                //询问是否确认删除
                sweetAlert({
                    title: "是否确认删除?",
                    text: "",
                    type: "warning",
                    showCancelButton: true,
                    confirmButtonColor: "#DD6B55",
                    confirmButtonText: "删除",
                    closeOnConfirm: false
                }, function () {
                    $.ajax({
                        url: "http://localhost:8080/xpyProject/admin.do",
                        data: {action: "delete", userId: id},
                        type: "GET",
                        dataType: "text",
                        success: function (data) {
                            if (data > 0) {
                                //其一: swal("恭喜","添加成功" ,"success");
                                // 第一个参数是title，第二个参数是text，
                                // 第三个参数是提醒类型(success,error,warning,input)

                                swal("删除成功!", "", "success");
                                load(jsonObj.pageNo);
                            } else {
                                swal("删除失败!", "", "error");
                            }
                        }
                    });
                });
            });

            //修改按钮绑定点击事件
            // $(".update-btn").on("click", function () {
            //     $("#myModalLabel").html("编辑用户");
            //     let id = $($(this).parents("tr").children("td")[0]).html().trim();
            //     let username = $($(this).parents("tr").children("td")[1]).html().trim();
            //     let image = $($(this).parents("tr").children("td")[2]).html().trim();
            //     let type = $($(this).parents("tr").children("td")[3]).html().trim();
            //     let status = $($(this).parents("tr").children("td")[4]).html().trim();
            //     $("#id").val(id);
            //     $("#username").val(username);
            //     // $("#password").val(password);
            //     // $("#image").val(image);
            //     $("#type").val(type);
            //     $("#status").val(status);
            // });
        }
    })
</script>
</body>
</html>