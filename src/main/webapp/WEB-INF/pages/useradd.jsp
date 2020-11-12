
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>useradd</title>
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
    </script>
    <style>
        a{text-decoration:none}
    </style>
</head>
<body>
<div id="base" class="">

    <!-- Unnamed (backend) -->

    <!-- Unnamed (矩形) -->
    <div id="u716" class="ax_default box_1">
        <div id="u716_div" class="" style="visibility: hidden">></div>
        <!-- Unnamed () -->
        <div id="u717" class="text" style="display: none; visibility: hidden">
            <p><span></span></p>
        </div>
    </div>

    <!-- Unnamed (矩形) -->
    <div id="u718" class="ax_default box_1">
        <div id="u718_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u719" class="text" style="visibility: visible;">
            <p id="u811"><span><i>后台管理&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; Administrator</i></span></p>
        </div>
    </div>

    <!-- Unnamed (矩形) -->
    <div id="u720" class="ax_default box_1">
        <div id="u720_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u721" class="text" style="display: none; visibility: hidden">
            <p><span></span></p>
        </div>
    </div>

    <!-- Unnamed (菜单) -->
    <div id="u722" class="ax_default">

        <!-- Unnamed (表格) -->
        <div id="u723" class="ax_default">
            <div id="u2016" class="ax_default _图片">
                <img id="u2033_img" class="img" src="img/timg5.jpg"/>
                <div id="u2017" class="text" style="visibility: hidden">
                    <p><span></span></p>
                </div>
            </div>

            <!-- Unnamed (Menu Item) -->
            <div id="u724" class="ax_default menu_item">
                <img id="u724_img" class="img " src="img/userlist/u724.png"/>
                <!-- Unnamed () -->
                <div id="u725" class="text" style="visibility: visible;">
                    <a href="userlist.action"> <b><span>用户管理</span></b></a>
                </div>
            </div>

            <!-- Unnamed (Menu Item) -->
            <div id="u726" class="ax_default menu_item">
                <img id="u726_img" class="img " src="img/userlist/u724.png"/>
                <!-- Unnamed () -->
                <div id="u727" class="text" style="visibility: visible;">
                    <a href="income.action"> <b><span>营收管理</span></b></a>
                </div>
            </div>

            <!-- Unnamed (Menu Item) -->
            <div id="u728" class="ax_default menu_item">
                <img id="u728_img" class="img " src="img/userlist/u728.png"/>
                <!-- Unnamed () -->
                <div id="u729" class="text" style="visibility: visible;">
                    <b><span>报表</span></b>
                </div>
            </div>
        </div>
    </div>

    <!--Unnamed (矩形)-->
    <div id="u730" class="ax_default box_1">
        <div id="u730_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u731" class="text" style="display: none; visibility: hidden">
            <p><span></span></p>
        </div>
    </div>

    <!-- Unnamed (菜单) -->
    <div id="u732" class="ax_default">
        <img id="u732_menu" class="img " src="img/userlist/u732_menu.png" alt="u732_menu"/>

        <!-- Unnamed (表格) -->
        <div id="u733" class="ax_default">

            <!-- Unnamed (Menu Item) -->
            <div id="u734" class="ax_default menu_item">
                <img id="u734_img" class="img " src="img/userlist/u736.png"/>
                <!-- Unnamed () -->
                <div id="u735" class="text" style="visibility: visible;">
                    <a href="userlist.action"> <p><span>查看</span></p></a>
                </div>
            </div>

            <!-- Unnamed (Menu Item) -->
            <div id="u736" class="ax_default menu_item">
                <img id="u736_img" class="img " src="img/userlist/u736.png"/>
                <!-- Unnamed () -->
                <div id="u737" class="text" style="visibility: visible;">
                    <a href="useradd.action"><p><span>增加用户</span></p></a>
                </div>
            </div>

            <!-- Unnamed (Menu Item) -->
            <div id="u738" class="ax_default menu_item">
                <img id="u738_img" class="img " src="img/userlist/u728.png"/>
                <!-- Unnamed () -->
                <div id="u739" class="text" style="visibility: visible;">
                    <p><span>View</span></p>
                </div>
            </div>
        </div>
        <!-- Unnamed (矩形) -->
        <div id="u819" class="ax_default box_1">
            <div id="u819_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u820" class="text" style="display: none; visibility: hidden">
                <p><span></span></p>
            </div>
        </div>



        <form action="/add_user.action" method="get">
            <div id="u1007" class="table-responsive">
                <table cellspacing="0" cellpadding="6"  style="width: 530px; text-align: center">
                    <tr style="background: #cdecf9">
                        <td><p><span>用户名</span></p></td>
                        <td><p><span><input type="text" name="user_name" value=""></span></p></td>
                    </tr>
                    <tr style="background: #F4F4F4">

                        <td><p><span>手机</span></p></td>
                        <td><p><span><input type="text" name="user_phone" value=""></span></p></td>
                    </tr>
                    <tr style="background: #cdecf9">
                        <td><p><span>微信</span></p></td>
                        <td><p><span><input type="text" name="user_wechat" value=""></span></p></td>
                    <tr style="background: #F4F4F4">
                        <td><p><span>QQ号</span></p></td>
                        <td><p><span><input type="text" name="user_tecent" value=""></span></p></td>
                    </tr>
                    <tr style="background: #cdecf9">

                        <td><p><span>邮箱</span></p></td>
                        <td><p><span><input type="text" name="user_email" value=""></span></p></td>
                    </tr>
                    <tr style="background: #F4F4F4">
                        <td><p><span>职业</span></p></td>
                        <td><p><span>
                        <select name="user_job" style="width: 175px">

                            <option value="员工">员工</option>
                            <option value="主管">主管</option>
                            <option value="经理">经理</option>
                            <option value="总监">总监</option>
                            <option value="总经理">总经理</option>
                        </select>
                    </span></p></td>
                    </tr>
                    <tr style="background: #cdecf9">
                        <td><p><span>充值</span></p></td>
                        <td><p><span></span></p></td>
                    </tr>
                    <tr style="background: #F4F4F4">
                        <td><p><span>后台充值</span></p></td>
                        <td><p><span>试用截止日期</span></p></td>
                    </tr>
                </table>
            </div> <!-- Unnamed (提交按钮) -->
            <div id="u862" class="ax_default html_button">
                <input id="u862_input" type="submit" value="创建用户"/>
            </div>
        </form>
    </div>
</div>


</body>
</html>