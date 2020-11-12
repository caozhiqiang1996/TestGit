<%--
  Created by IntelliJ IDEA.
  User: ASUS-pc
  Date: 2018/6/14
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String err= "";%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>forgetpassword</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="js/resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="js/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="css/style.css" type="text/css" rel="stylesheet"/>
    <link href="css/style.css" type="text/css" rel="stylesheet"/>
    <script src="js/resources/scripts/jquery-1.7.1.min.js"></script>
    <script src="js/resources/scripts/jquery-ui-1.8.10.custom.min.js"></script>
    <script src="js/resources/scripts/axure/axQuery.js"></script>
    <script src="js/resources/scripts/axure/globals.js"></script>
    <script src="js/resources/scripts/axutils.js"></script>
    <script src="js/resources/scripts/axure/annotation.js"></script>
    <script src="js/resources/scripts/axure/axQuery.std.js"></script>
    <script src="js/resources/scripts/axure/doc.js"></script>
    <script src="js/Document.js"></script>
    <script src="js/resources/scripts/messagecenter.js"></script>
    <script src="js/resources/scripts/axure/events.js"></script>
    <script src="js/resources/scripts/axure/recording.js"></script>
    <script src="js/resources/scripts/axure/action.js"></script>
    <script src="js/resources/scripts/axure/expr.js"></script>
    <script src="js/resources/scripts/axure/geometry.js"></script>
    <script src="js/resources/scripts/axure/flyout.js"></script>
    <script src="js/resources/scripts/axure/ie.js"></script>
    <script src="js/resources/scripts/axure/model.js"></script>
    <script src="js/resources/scripts/axure/repeater.js"></script>
    <script src="js/resources/scripts/axure/sto.js"></script>
    <script src="js/resources/scripts/axure/utils.temp.js"></script>
    <script src="js/resources/scripts/axure/variables.js"></script>
    <script src="js/resources/scripts/axure/drag.js"></script>
    <script src="js/resources/scripts/axure/move.js"></script>
    <script src="js/resources/scripts/axure/visibility.js"></script>
    <script src="js/resources/scripts/axure/style.js"></script>
    <script src="js/resources/scripts/axure/adaptive.js"></script>
    <script src="js/resources/scripts/axure/tree.js"></script>
    <script src="js/resources/scripts/axure/init.temp.js"></script>
    <script src="js/accountinfo.js"></script>
    <script src="js/resources/scripts/axure/legacy.js"></script>
    <script src="js/resources/scripts/axure/viewer.js"></script>
    <script src="js/resources/scripts/axure/math.js"></script>
    <script type="text/javascript">
        $axure.utils.getTransparentGifPath = function() { return 'js/resources/images/transparent.gif'; };
        $axure.utils.getOtherPath = function() { return 'js/resources/Other.html'; };
        $axure.utils.getReloadPath = function() { return 'js/resources/reload.html'; };
    </script>
    <script type="text/javascript">
//        var can = document.getElementById("u2004_input");
        //        can.onclick=function () {
        //            alert("111");
        //             window.location.href="forgetpassword.action";
        //            err=request.getAttribute("error");
        //            alert(err);
//        }

    </script>
</head>
<body>
<style>
    body{
        background: url("/img/homepage/u19.jpg");
        background-size: cover;
    }
</style>
<!--<div id="base" class="">
    <div id="u900" class="ax_default box_1">
        <div id="u900_div" class="" style="visibility: hidden"></div>
        &lt;!&ndash; Unnamed () &ndash;&gt;
        <div id="u901" class="text" style="display: none; visibility: hidden">
            <p><span></span></p>
        </div>
    </div>-->
<!--</div>-->
<form action="/modify.action" method="post" onsubmit="return forget();" name="showDataForm">

    <div id="u2006" class="ax_default text_field">
        <input id="u2006_input" type="text" name="user_password" value=""/>
    </div>
    <div id="u2008" class="ax_default text_field">
        <input id="u2008_input" type="text" name="user_name" value=""/>
    </div>

    <div id="u2002" class="ax_default label">

        <div id="u2002_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u2003" class="text" style="visibility: visible;">
            <p><span>新密码：</span></p>
        </div>

        <div id="u2007" class="text" style="visibility: visible;">
            <p><span>用户名：</span></p>
        </div>
        <div id="u2010" class="text" style="visibility: visible;">
            <p><span>验证方式：</span></p>
        </div>
        <div id="u2011" class="ax_default droplist">
            <select id="u2011_input" name="verification_mode">
                <option value="微信">微信</option>
                <option selected value="手机">手机</option>
                <option value="QQ">QQ</option>
            </select>
        </div>
        <div id="u2012" class="text" style="visibility: visible;">
            <p><span>请输入验证码：</span></p>
        </div>
        <div id="u2013" class="ax_default text_field">
            <input id="u2013_input" type="text" name="code" value=""/>
        </div>
        <div id="u2014" class="ax_default html_button">
            <input id="u2014_input"  type="submit" class="button" value="获取验证码"/>
        </div>
        <div id="u2004" class="ax_default html_button">
            <input id="u2004_input"  type="submit" class="button" value="提交"/>

        </div>
        <div id="u2009" class="ax_default html_button">
            <a href="homepage.action"> <input id="u2009_input" type="button" class="button" value="返回" /></a>
        </div>

    </div>
</form>
</body>
</html>
