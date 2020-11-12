<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>主页</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <meta name="apple-mobile-web-app-capable" content="yes"/>
    <link href="js/resources/css/jquery-ui-themes.css" type="text/css" rel="stylesheet"/>
    <link href="js/resources/css/axure_rp_page.css" type="text/css" rel="stylesheet"/>
    <link href="css/style.css" type="text/css" rel="stylesheet"/>
    <link href="css/style.css" type="text/css" rel="stylesheet"/>

    <script type="text/javascript">
        $axure.utils.getTransparentGifPath = function() { return 'js/resources/images/transparent.gif'; };
        $axure.utils.getOtherPath = function() { return 'js/resources/Other.html'; };
        $axure.utils.getReloadPath = function() { return 'js/resources/reload.html'; };

        function change()
        {
            var img=document.getElementById("u16_img");
            //切换验证码的原理是点击就重新将src设置一下，但是浏览器有缓存，所以我们需要在后面添加                     一个参数来让浏览器不断发送请求，后面加的参数为时间，因为时间是不断变化的
            img.src="/verification.action?a="+new Date().getTime();
        }




    </script>
    <style>
        body{
            background: url("/img/homepage/u19.jpg");
            background-size: cover;
        }
        a{text-decoration:none}
        #u1200_div {
            position:absolute;
            left:0px;
            top:0px;
            width:50px;
            height:28px;
            background:inherit;
            background-color:rgba(22, 155, 213, 1);
            border:none;
            border-radius:5px;
            -moz-box-shadow:none;
            -webkit-box-shadow:none;
            box-shadow:none;
        }
        #u1200 {
            position:absolute;
            left:710px;
            top:480px;
            width:50px;
            height:28px;
        }
        #u1201 {
            position:absolute;
            left:2px;
            top:6px;
            width:50px;
            word-wrap:break-word;
        }
    </style>

<body>

<div id="base" class="">



    <!-- Unnamed (矩形) -->
    <div id="u2" class="ax_default box_1">
        <div id="u2_div" class="" style="visibility: inherit">
        </div>
        <!-- Unnamed () -->
        <div id="u3" class="text" style="display: none; visibility: hidden">
            <p><span></span></p>
        </div>

        <!-- Unnamed (矩形) -->
        <!--      <div id="u20" class="ax_default box_1">
                <div id="u20_div" class="" style="visibility: hidden"></div>
                &lt;!&ndash; Unnamed () &ndash;&gt;
                <div id="u21" class="text" style="display: none; visibility: hidden">
                  <p><span></span></p>
                </div>
              </div>-->
    </div>


    <form action="loginUser.action" method="post">

    <!-- Unnamed (矩形) -->
    <div id="u4" class="ax_default button">
        <div id="u4_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u5" class="text" style="visibility: visible;">
            <p><span><a href="forgetpassword.action">忘记密码</a></span></p>
        </div>
    </div>

    <div id="u1200" class="ax_default button">
        <div id="u1200_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u1201" class="text" style="visibility: visible;">
            <p><span><a href="register.action">注册</a></span></p>
        </div>
    </div>

    <!-- Unnamed (矩形) -->
    <div id="u6" class="ax_default primary_button">
        <div id="u6_div" class="">
        </div>
        <!-- Unnamed () -->
        <div id="u7" class="text" style="visibility: visible;">
            <%--<a href="javascript:login();" onclick="login()" target=""><p><span>登录</span></p></a>--%>
            <input type="submit" value="登录" onclick="login()">
        </div>
    </div>

    <!-- Unnamed (文本框) -->
    <div id="u33">
        <p><span>用户登录</span></p>
    </div>
    <div id="u8" class="ax_default text_field">
        <input id="u8_input" type="text" name="user_name" value=""/>
    </div>
    <!-- Unnamed (矩形) -->
    <div id="u9" class="ax_default label">
        <div id="u9_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u10" class="text" style="visibility: visible;">
            <p><span>用户名:</span></p>
        </div>
    </div>

    <!-- Unnamed (矩形) -->
    <div id="u11" class="ax_default label">
        <div id="u11_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u12" class="text" style="visibility: visible;">
            <p><span>密码:</span></p>
        </div>
    </div>

    <!-- Unnamed (文本框) -->
    <div id="u13" class="ax_default text_field">
        <input id="u13_input" type="password" name="user_password" value=""/>
    </div>

    <!-- Unnamed (矩形) -->
    <div id="u14" class="ax_default label">
        <div id="u14_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u15" class="text" style="visibility: visible;">
            <p><span>验证码:</span></p>
        </div>
    </div>

    <!-- Unnamed (图片) -->
    <div id="u16" class="ax_default _图片">
        <img id="u16_img" class="img " src="/verification.action"/>
        <a style="position: relative ;top: 50px;left: 110px;" href="javascript:change()" onclick="change()">看不清，换一张</a>
        <!-- Unnamed () -->
        <div id="u17" class="text" style=" visibility: visible">
            <input id="u17_input" type="text" name="code" value=""/>
        </div>
        <div>

        </div>

    </div>
</form>

    <div id="u80" class="ax_default box_1">
        <div id="u80_div" class=""></div>
        <!-- Unnamed (矩形) -->
        <div id="u22" class="ax_default box_1">
            <div id="u22_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u23" class="text" style="visibility: visible;">
                <p><span>手机快速注册</span></p>
                    <%--<b><span><a href="focusbid.action">管理</a></span></b>--%>
            </div>
        </div>

        <!-- Unnamed (矩形) -->
        <div id="u24" class="ax_default box_1">
            <div id="u24_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u25" class="text" style="visibility: visible;">
              <a href="/register.action" target="_blank">  <p><span>微信扫码注册</span></p></a>
            </div>
        </div>

        <!-- Unnamed (矩形) -->
        <div id="u26" class="ax_default box_1">
            <div id="u26_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u27" class="text" style="visibility: visible;">
                <a href="register.action" target="_blank">  <p><span>QQ扫码注册</span></p></a>
            </div>
        </div>



        <!-- Unnamed (fpageTempl) -->

        <!-- Unnamed (矩形) -->
        <div id="u29" class="ax_default box_1">
            <div id="u29_div" class="" style="visibility: hidden"></div>
            <!-- Unnamed () -->
            <div id="u30" class="text" style="visibility: visible;">
                <p><span>copyright（2018）ICP（）</span></p>
            </div>
        </div>

        <!-- Unnamed (矩形) -->
        <div id="u31" class="ax_default box_1">
            <div id="u31_div" class="" style="visibility: hidden"></div>
            <!-- Unnamed () -->

            <div id="u32" class="text" style="visibility:visible;">
                <p><span><i>Welcome/会员管理系统</i></span></p>
            </div>

        </div>
    </div>
</div>
</body>
</html>
