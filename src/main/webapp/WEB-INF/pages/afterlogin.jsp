<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
    String name= (String) request.getSession().getAttribute("user_name");
%>
<head>
    <title>afterLogin</title>
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
<div id="base" class="" >

    <!-- Unnamed (aferloginTempl) -->

    <!-- Unnamed (矩形) -->
    <div id="u34" class="ax_default box_1">
        <div id="u34_div" class="" style="visibility: hidden"></div>
        <!-- Unnamed () -->
        <div id="u35" class="text" style="visibility: visible;">
            <p><span>copyright（2018）ICP（）</span></p>
        </div>
    </div>

    <!-- Unnamed (矩形) -->
    <div id="u36" class="ax_default box_1">
        <div id="u36_div" class="" ></div>
        <!-- Unnamed () -->
        <div id="u37" class="text" style="visibility: visible;">
            <img id="u1011" src="img/timg.jpg" >
            <b id="u802"><span>会员管理系统</span></b>
        </div>
    </div>
    <ul id="u2018" class="nav nav-pills">
        <li id="u2019" role="presentation" class="active"><a href="afterlogin.action">首页</a></li>
        <li id="u2020" role="presentation"><a href="userlist.action">后台管理</a></li>
        <li id="u2021" role="presentation"><a href="#">消息设置</a></li>
    </ul>
    <!-- Unnamed (矩形) -->
    <div id="u38" class="ax_default box_1">
        <div id="u38_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u39" class="text" style="display: none; ">
            <p><span></span></p>
        </div>
    </div>
    <!----图片--->
    <div id="u2016" class="ax_default _图片">
        <img id="u2015_img" class="img" src="img/timg5.jpg"/>
        <div id="u2017" class="text" style="visibility: hidden">
            <p><span></span></p>
        </div>
    </div>


    <!-- Unnamed (树状菜单) -->
    <div id="u40" class="ax_default tree_node treeroot">
        <div id="u40_children" class="u40_children">

            <!-- Unnamed (Tree Node) -->
            <div id="u41" class="ax_default button treenode">

                <!-- Unnamed (图片) -->
                <!--<div id="u42" class="ax_default _图片">-->
                    <!--<img id="u42_img" class="img " src="img/afterlogin/u42_selected.png"/>-->
                    <!--&lt;!&ndash; Unnamed () &ndash;&gt;-->
                    <!--<div id="u43" class="text" style="visibility: hidden">-->
                        <!--<p><span></span></p>-->
                    <!--</div>-->
                <!--</div>-->

                <!-- Unnamed (图片) -->
                <div id="u44" class="ax_default _图片">
                    <img id="u44_img" class="img " src="js/resources/images/transparent.gif"/>
                    <!-- Unnamed () -->
                    <div id="u45" class="text" style="display: none; visibility: hidden">
                        <p><span></span></p>
                    </div>
                </div>
                <!-- Unnamed (矩形) -->
                <div id="u46" class="" selectiongroup="u33u40_tree_group">
                    <div id="u46_div" class=""style="visibility: hidden"></div>
                    <!-- Unnamed () -->
                    <div id="u47" class="text" style="visibility: visible;">
                        <b><span>业务信息</span></b>
                    </div>
                </div>
                <div id="u41_children" class="u41_children">

                    <!-- Unnamed (Tree Node) -->
                    <div id="u48" class="ax_default button treenode">

                        <!-- Unnamed (图片) -->
                        <div id="u49" class="ax_default _图片">
                            <img id="u49_img" class="img " src="js/resources/images/transparent.gif"/>
                            <!-- Unnamed () -->
                            <div id="u50" class="text" style="display: none; visibility: hidden">
                                <p><span></span></p>
                            </div>
                        </div>
                        <!-- Unnamed (矩形) -->
                        <div id="u51" class="" selectiongroup="u33u40_tree_group">
                            <div id="u51_div" class="" style="visibility: hidden"></div>
                            <!-- Unnamed () -->
                            <div id="u52" class="text" style="visibility: visible;">
                                <a href="/keywordmgr.action"><b><span>关键字管理</span></b></a>
                            </div>
                        </div>
                    </div>

                    <!-- Unnamed (Tree Node) -->
                    <div id="u53" class="ax_default button treenode">

                        <!-- Unnamed (图片) -->
                        <div id="u54" class="ax_default _图片">
                            <img id="u54_img" class="img " src="js/resources/images/transparent.gif"/>
                            <!-- Unnamed () -->
                            <div id="u55" class="text" style="display: none; visibility: hidden">
                                <p><span></span></p>
                            </div>
                        </div>
                        <!-- Unnamed (矩形) -->
                        <div id="u56" class="" selectiongroup="u33u40_tree_group">
                            <div id="u56_div" class=""style="visibility: hidden"></div>
                            <!-- Unnamed () -->
                            <div id="u57" class="text" style="visibility: visible;">
                                <b><span><a href="bidsearch.action">标书查找</a></span></b>
                            </div>
                        </div>
                    </div>

                    <!-- Unnamed (Tree Node) -->
                    <div id="u58" class="ax_default button treenode">

                        <!-- Unnamed (图片) -->
                        <div id="u59" class="ax_default _图片">
                            <img id="u59_img" class="img " src="js/resources/images/transparent.gif"/>
                            <!-- Unnamed () -->
                            <div id="u60" class="text" style="display: none; visibility: hidden">
                                <p><span></span></p>
                            </div>
                        </div>
                        <!-- Unnamed (矩形) -->
                        <div id="u61" class="" selectiongroup="u33u40_tree_group">
                            <div id="u61_div" class=""style="visibility: hidden"></div>
                            <!-- Unnamed () -->
                            <div id="u62" class="text" style="visibility: visible;">
                                <b><span><a href="focusbid.action">关注的标的</a></span></b>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Unnamed (Tree Node) -->
            <div id="u63" class="ax_default button treenode">

                <!-- Unnamed (图片) -->
                <!--<div id="u64" class="ax_default _图片">-->
                    <!--<img id="u64_img" class="img " src="img/afterlogin/u42_selected.png"/>-->
                    <!--&lt;!&ndash; Unnamed () &ndash;&gt;-->
                    <!--<div id="u65" class="text" style="display: none; visibility: hidden">-->
                        <!--<p><span></span></p>-->
                    <!--</div>-->
                <!--</div>-->

                <!-- Unnamed (图片) -->
                <div id="u66" class="ax_default _图片">
                    <img id="u66_img" class="img " src="js/resources/images/transparent.gif"/>
                    <!-- Unnamed () -->
                    <div id="u67" class="text" style="display: none; visibility: hidden">
                        <p><span></span></p>
                    </div>
                </div>
                <!-- Unnamed (矩形) -->
                <div id="u68" class="" selectiongroup="u33u40_tree_group">
                    <div id="u68_div" class=""style="visibility: hidden"></div>
                    <!-- Unnamed () -->
                    <div id="u69" class="text" style="visibility: visible;">
                        <b><span>个人信息</span></b>
                    </div>
                </div>
                <div id="u63_children" class="u63_children">

                    <!-- Unnamed (Tree Node) -->
                    <div id="u70" class="ax_default button treenode">

                        <!-- Unnamed (图片) -->
                        <div id="u71" class="ax_default _图片">
                            <img id="u71_img" class="img " src="js/resources/images/transparent.gif"/>
                            <!-- Unnamed () -->
                            <div id="u72" class="text" style="display: none; visibility: hidden">
                                <p><span></span></p>
                            </div>
                        </div>
                        <!-- Unnamed (矩形) -->
                        <div id="u73" class="" selectiongroup="u33u40_tree_group">
                            <div id="u73_div" class="" style="visibility: hidden"></div>
                            <!-- Unnamed () -->
                            <div id="u74" class="text" style="visibility: visible;">
                                <b><span><a href="userinfo.action">信息编辑</a></span></b>
                            </div>
                        </div>
                    </div>

                    <!-- Unnamed (Tree Node) -->
                    <div id="u75" class="ax_default button treenode">

                        <!-- Unnamed (图片) -->
                        <div id="u76" class="ax_default _图片">
                            <img id="u76_img" class="img " src="js/resources/images/transparent.gif"/>
                            <!-- Unnamed () -->
                            <div id="u77" class="text" style="display: none; visibility: hidden">
                                <p><span></span></p>
                            </div>
                        </div>
                        <!-- Unnamed (矩形) -->
                        <div id="u78" class="" selectiongroup="u33u40_tree_group">
                            <div id="u78_div" class=" "style="visibility: hidden"></div>
                            <!-- Unnamed () -->
                            <div id="u79" class="text" style="visibility: visible;">
                                <b><span>公司信息...</span></b>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Unnamed (Tree Node) -->
            <div id="u80" class="ax_default button treenode">

                <!-- Unnamed (图片) -->
                <div id="u81" class="ax_default _图片">
                    <img id="u81_img" class="img " src="js/resources/images/transparent.gif"/>
                    <!-- Unnamed () -->
                    <div id="u82" class="text" style="display: none; visibility: hidden">
                        <p><span></span></p>
                    </div>
                </div>
                <!-- Unnamed (矩形) -->
                <div id="u83" class="" selectiongroup="u33u40_tree_group">
                    <div id="u83_div" class=""style="visibility: hidden"></div>
                    <!-- Unnamed () -->
                    <div id="u84" class="text" style="visibility: visible;">
                        <b><span><a href="accountinfo.action">账户信息</a></span></b>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Unnamed (矩形) -->
    <div id="u87" class="ax_default link_button">
        <div id="u87_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u88" class="text" style="visibility: visible;">
            <p id="u803"><span>欢迎管理员：<%=name%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="homepage.action">退出</a></span></p>
        </div>
    </div>


    <!-- Unnamed (矩形) -->
    <div id="u85" class="ax_default box_1">
        <div id="u85_div" class="" style="visibility: hidden"></div>
        <!-- Unnamed () -->
        <div id="u86" class="text" style="display: none; visibility: hidden">
            <p><span></span></p>
        </div>
    </div>

 <!--   &lt;!&ndash; Unnamed (矩形) &ndash;&gt;
    <div id="u85" class="ax_default box_1">
        <div id="u85_div" class="" style="visibility: hidden"></div>
        &lt;!&ndash; Unnamed () &ndash;&gt;
        <div id="u86" class="text" style="display: none; visibility: hidden">
            <p><span></span></p>
        </div>
    </div>

    &lt;!&ndash; Unnamed (矩形) &ndash;&gt;
    <div id="u87" class="ax_default link_button">
        <div id="u87_div" class=""></div>
        &lt;!&ndash; Unnamed () &ndash;&gt;
        <div id="u88" class="text" style="visibility: visible;">
            <p id="u803"><span>欢迎管理员：张安&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 退出</span></p>
        </div>
    </div>-->

    <!-- Unnamed (Left Arrow) -->
    <div id="u89" class="ax_default box_1">
        <!--<img id="u89_img" class="img " src="img/afterlogin/u89.png"/>-->
        <!-- Unnamed () -->
        <div id="u90" class="text" style="display: none; visibility: hidden">
            <p><span></span></p>
        </div>
    </div>

    <!-- Unnamed (矩形) -->
    <div id="u91" class="ax_default box_1">
        <div id="u91_div" class="" style="visibility: hidden"></div>
        <!-- Unnamed () -->
        <div id="u92" class="text" style="visibility: visible;">
            <p><span><%=name%>你好</span></p><p><span><br></span></p><p><span>余额：208元&nbsp; 余额不足，充值点击 </span></p><p><span style="color:#000000;">你有订阅的标有108个未更新，点击查询</span></p><p><span style="color:#000000;">你还可以增加 </span><span style="color:#FF0000;">18</span><span style="color:#000000;"> 个关键字</span></p><p><span style="color:#000000;">你还可以关注</span><span style="color:#FF0000;">28</span><span style="color:#000000;">个标</span></p><p><span style="color:#000000;"><br></span></p><p><span style="color:#000000;"><br></span></p>
        </div>
    </div>

    <!-- Unnamed (矩形) -->
    <div id="u93" class="ax_default link_button">
        <div id="u93_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u94" class="text" style="visibility: visible;">
            <p><span>充值</span></p>
        </div>
    </div>

    <!-- Unnamed (矩形) -->
    <div id="u95" class="ax_default link_button">
        <div id="u95_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u96" class="text" style="visibility: visible;">
            <p><span>查询</span></p>
        </div>
    </div>
</div>
</body>
</html>

</html>