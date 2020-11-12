<%@ page import="java.util.List" %>
<%@ page import="com.suda.yingyong.pojo.Bids" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@ page isELIgnored ="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>bidsearch</title>
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
        .test{
            overflow:hidden;
            text-overflow:ellipsis;
            white-space:nowrap;

        }
        .test:hover{
            overflow:visible;
        }
    </style>
</head>
<body>
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
        <li id="u2019" role="presentation" class="active">
            <a href="afterlogin.action">首页</a></li>
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
                <!--<div id="u41_children" class="u41_children">-->

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
                            <a href="keywordmgr.action"><b><span>关键字管理</span></b></a>
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
                            <a href="bidsearch.action"><b><span>标书查找</span></b></a>
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
                            <a href="focusbid.action"><b><span>关注的标的</span></b></a>
                        </div>
                    </div>
                </div>
                <!--</div>-->
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
                <!--<div id="u63_children" class="u63_children">-->

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
                            <a href="userinfo.action"><b><span>信息编辑</span></b></a>
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
                <!--</div>-->
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
                        <a href="accountinfo.action"><b><span>账户信息</span></b></a>
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
            <p id="u803"><span>欢迎管理员：${user_name}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="homepage.action">退出</a></span></p>
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
    <!-- Unnamed (文本框) -->
    <div id="u291" class="ax_default text_field">
        <input id="u291_input" type="text" value=""/>
    </div>

    <!-- Unnamed (矩形) -->
    <div id="u292" class="ax_default label">
        <div id="u292_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u293" class="text" style="visibility: visible;">
            <p><span>关键字：</span></p>
        </div>
    </div>



    <form action="Search.action" method="post">
        <!-- Unnamed (文本框) -->
        <div id="u294" class="ax_default text_field">
            <input id="u294_input" type="date" name="start_time" style="width: 120px; left: -30px"/>
        </div>

        <!-- Unnamed (矩形) -->
        <div id="u295" class="ax_default label">
            <div id="u295_div" class=""></div>
            <!-- Unnamed () -->
            <div id="u296" class="text" style="visibility: visible;">
                <p><span>到</span></p>
            </div>
        </div>

        <!-- Unnamed (水平线) -->
        <div id="u297" class="ax_default line">
            <img id="u297_img" class="img " src="js/images/bidsearch/u297.png"/>
            <!-- Unnamed () -->
            <div id="u298" class="text" style="display: none; visibility: hidden">
                <p><span></span></p>
            </div>
        </div>

        <!-- Unnamed (复选框) -->
        <div id="u299" class="ax_default checkbox">
            <label for="u299_input">
                <!-- Unnamed () -->
                <div id="u300" class="text" style="visibility: visible;">
                    <p><span>高级</span></p>
                </div>
            </label>
            <input id="u299_input" type="checkbox" value="checkbox"/>
        </div>

        <!-- Unnamed (文本框) -->
        <div id="u301" class="ax_default text_field">
            <input id="u301_input" type="date" name="end_time" style="width: 120px; left: -10px"/>
        </div>

        <!-- Unnamed (提交按钮) -->
        <div id="u302" class="ax_default html_button">
            <input id="u302_input" type="submit" value="查询"/>
        </div>
    </form>
    <!-- Unnamed (提交按钮) -->
    <div id="u303" class="ax_default html_button">
        <input id="u303_input" type="submit" value="清空"/>
    </div>

    <!-- Unnamed (单选按钮) -->
    <div id="u304" class="ax_default radio_button">
        <label for="u304_input">
            <!-- Unnamed () -->
            <div id="u305" class="text" style="visibility: visible;">
                <p><span>今天</span></p>
            </div>
        </label>
        <input id="u304_input" type="radio" value="今天" name="bid_search" checked/>
    </div>

    <!-- Unnamed (单选按钮) -->
    <div id="u306" class="ax_default radio_button">
        <label for="u306_input">
            <!-- Unnamed () -->
            <div id="u307" class="text" style="visibility: visible;">
                <p><span>一周</span></p>
            </div>
        </label>
        <input id="u306_input" type="radio" value="一周" name="bid_search"/>
    </div>

    <!-- Unnamed (单选按钮) -->
    <div id="u308" class="ax_default radio_button">
        <label for="u308_input">
            <!-- Unnamed () -->
            <div id="u309" class="text" style="visibility: visible;">
                <p><span>一个月</span></p>
            </div>
        </label>
        <input id="u308_input" type="radio" value="一个月" name="bid_search"/>
    </div>

    <!-- Unnamed (水平线) -->
    <div id="u310" class="ax_default line">
        <img id="u310_img" class="img " src="js/images/bidsearch/u297.png"/>
        <!-- Unnamed () -->
        <div id="u311" class="text" style="display: none; visibility: hidden">
            <p><span></span></p>
        </div>
    </div>

    <div id="u1009" >
        <table cellspacing="0" cellpadding="10"  style="width: 1100px; height: 450px;  text-align: center">
            <tr style="background: #cdecf9 ">
                <td><p><span>序号</span></p></td>
                <td><p><span>简要说明</span></p></td>
                <td><p><span>明细信息</span></p></td>
                <td><p><span>原始连接</span></p></td>
                <td><p><span>发布日期</span></p></td>
                <td><p><span>操作</span></p></td>
            </tr>
            <%--<%--%>
            <%--List<Bids> bids = (List<Bids>) session.getAttribute("bids");--%>
            <%--for (int i=0;i<bids.size();i++) {--%>
            <%--System.out.println(bids.get(i).getBids_detail());--%>
            <%--}--%>
            <%--//                for (int i = 0;i<list.size();i++){--%>
            <%--%>--%>
            <%--<% %>--%>
            <c:forEach items="${bids}" var="bids" varStatus="status">
                <tr
                        <c:if test="${status.index%2==0}">
                            bgcolor="#D3D3D3"
                        </c:if>
                        <c:if test="${status.index%2!=0}">
                            bgcolor="#cdecf9"
                        </c:if>
                >
                    <td><p><span class="test">${bids.bids_id}</span></p></td>
                    <td><p><span >${bids.bids_brief}</span></p></td>
                    <td><p><span>${bids.bids_detail}</span></p></td>
                    <td><span  style="text-decoration:underline;">${bids.bids_link}</span></td>
                    <td><p><span  style="text-decoration:underline;">${bids.bids_create_time}</span></p></td>
                    <td><p><span  style="text-decoration:underline;">${bids.bids_operation}</span></p></td>
                </tr>
            </c:forEach>
            <%--<%--%>
            <%--}--%>
            <%--%>--%>
            <%--<tr style="background: #cdecf9">--%>
            <%--<td><p><span>2</span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span>昨天</span></p></td>--%>
            <%--<td><p><span>关注过的出不关注，不关注的出关注</span></p></td>--%>
            <%--</tr>--%>
            <%--<tr style="background: #D3D3D3">--%>
            <%--<td><p><span>3</span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span>2018/5/28</span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--</tr>--%>

            <%--<tr style="background: #cdecf9; height: 200px">--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--<td><p><span></span></p></td>--%>
            <%--</tr>--%>
        </table>
    </div>


    <!-- Unnamed (矩形) -->
    <div id="u373" class="ax_default label">
        <div id="u373_div" class=""></div>
        <!-- Unnamed () -->
        <div id="u374" class="text" style="visibility: visible;">
            <p><span>查询日期从</span></p>
        </div>
    </div>

    <!-- Unnamed (矩形) -->
    <%--<div id="u375" class="ax_default label">--%>
    <%--<div id="u375_div" class=""></div>--%>
    <%--<!-- Unnamed () -->--%>
    <%--<div id="u376" class="text" style="visibility: visible;">--%>
    <%--&lt;%&ndash;<p><span>1年以内，跨度不能超过3个月</span></p>&ndash;%&gt;--%>
    <%--</div>--%>
    <%--</div>--%>

    <!-- Unnamed (文本段落) -->
    <div id="u377" class="ax_default _文本段落">
        <img id="u377_img" class="img " src="js/resources/images/transparent.gif"/>
        <!-- Unnamed () -->
        <div id="u378" class="text" style="visibility: visible;">
            <p><span style="text-decoration:underline;">首页</span></p>
        </div>
    </div>

    <!-- Unnamed (文本段落) -->
    <div id="u379" class="ax_default _文本段落">
        <img id="u379_img" class="img " src="js/resources/images/transparent.gif"/>
        <!-- Unnamed () -->
        <div id="u380" class="text" style="visibility: visible;">
            <p><span style="text-decoration:underline;">末页</span></p>
        </div>
    </div>

    <!-- Unnamed (文本段落) -->
    <div id="u381" class="ax_default _文本段落">
        <img id="u381_img" class="img " src="js/resources/images/transparent.gif"/>
        <!-- Unnamed () -->
        <div id="u382" class="text" style="visibility: visible;">
            <p><span style="text-decoration:underline;">上一页</span></p>
        </div>
    </div>

    <!-- Unnamed (文本段落) -->
    <div id="u383" class="ax_default _文本段落">
        <img id="u383_img" class="img " src="js/resources/images/transparent.gif"/>
        <!-- Unnamed () -->
        <div id="u384" class="text" style="visibility: visible;">
            <p><span style="text-decoration:underline;">下一页</span></p>
        </div>
    </div>
</div>
</div>
</div>
</body>
</html>