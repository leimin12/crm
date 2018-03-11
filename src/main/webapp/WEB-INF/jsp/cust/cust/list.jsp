<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <title>jb-aptech毕业设计项目</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>
</head>
<body>
    <div class="page_title">客户信息管理</div>

    <table class="query_form_table">
        <tr>
            <th>客户编号</th>
            <td><input id="custno"/></td>
            <th>名称</th>
            <td><input id="custname"/></td>
            <th>地区</th>
            <td>
                <select id="custr">
                    <option>全部</option>
                    <option value="北京">北京</option>
                    <option value="华北">华北</option>
                    <option value="中南">中南</option>
                    <option value="东北">东北</option>
                    <option value="西部">西部</option>
                </select>
            </td>
        </tr>
        <tr>
            <th>客户经理</th>
            <td><input id="custmanage"/></td>
            <th>客户等级</th>
            <td>
                <select id="custnagename">
                    <option>全部</option>
                    <option value="战略合作伙伴">战略合作伙伴</option>
                    <option value="合作伙伴">合作伙伴</option>
                    <option value="大客户">大客户</option>
                    <option value="普通客户">普通客户</option>
                </select>
            </td>
            <th>　</th>
            <td>　</td>
        </tr>
        <div class="button_bar">
            <button class="common_button" onclick="help('');">帮助</button>
            <button id="dd" class="common_button" onclick="reload();">查询</button>
        </div>
    </table>
<br/>
<table class="data_list_table" id="dg" width="100%">


</table>
</body>
</html>