<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/17
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>杨萌高志东欢迎您</title>
    <link rel="stylesheet" type="text/css" href="./xing/css/normalize.css"/>
    <link rel="stylesheet" type="text/css" href="./xing/css/demo.css"/>
    <!--必要样式-->
    <link rel="stylesheet" type="text/css" href="./xing/css/component.css"/>
    <script src="./script/jquery-1.8.1.min.js"></script>
    <!--[if IE]>
    <script src="./xing/js/html5.js"></script>
    <![endif]-->
    <script type="text/javascript">
        function denglu() {
            $("#huanyi").submit();
        }
    </script>
</head>
<body>
<div class="container demo-1">
    <div class="content">
        <div id="large-header" class="large-header">
            <canvas id="demo-canvas"></canvas>
            <div class="logo_box">
                <h3>杨萌高志东欢迎您</h3>
                <form action="welcome" method="post" id="huanyi">
                    <div class="input_outer">
                        <span class="u_user"></span>
                        <input name="username" class="text" style="color: #FFFFFF !important" type="text"
                               placeholder="请输入姓名">
                    </div>
                    <div style="color: red;margin-top: -60px;margin-left: 70%;">${msg }</div>
                    <br/><br/>
                    <div class="mb2" style="cursor:pointer;" onclick="denglu()"><a class="act-but submit"
                                                                                   style="color: #FFFFFF">登录</a></div>
                    <button value="登录" style="display:none" type="submit"></button>
                </form>
            </div>
        </div>
    </div>
</div><!-- /container -->
<script src="./xing/js/TweenLite.min.js"></script>
<script src="./xing/js/EasePack.min.js"></script>
<script src="./xing/js/rAF.js"></script>
<script src="./xing/js/demo-1.js"></script>
</body>
</html>
