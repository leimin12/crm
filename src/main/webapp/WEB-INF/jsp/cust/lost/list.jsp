<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <title>jb-aptech毕业设计项目</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>
    <script type="text/javascript" src="js/lostList.js"></script>
</head>
<body>
<div class="page_title">客户流失管理</div>
<table class="query_form_table">
    <tr>
        <th>客户</th>
        <td><input name="lstCustName" id="lstCustName"/></td>
        <th>客户经理</th>
        <td><input name="lstCustManagerName" id="lstCustManagerName"/></td>
        <th>状态</th>
        <td>
            <select name="lstStatus" id="lstStatus">
                <option value="">全部</option>
                <option value="1">预警</option>
                <option value="2">暂缓流失</option>
                <option value="3">确认流失</option>
            </select>
        </td>
    </tr>
    <div class="button_bar">
        <a href="#" id="vs" class="easyui-linkbutton" iconCls="icon-search">查询</a>
    </div>
</table>
<br />
<table id="lost">
</table>
</body>
</html>