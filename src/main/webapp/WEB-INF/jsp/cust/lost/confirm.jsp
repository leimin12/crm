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
<div class="page_title">客户流失管理 &gt; 确认流失</div>
<div class="button_bar">
    <a href="#" id="confirmBtn" class="easyui-linkbutton" iconCls="icon-save">保存</a>
</div>
<form id="confirm">
<table class="query_form_table">
    <tr>
        <th>编号</th>
        <td>${cstLost2.lstId}</td>
        <th>客户</th>
        <td>${cstLost2.lstCustName}</td>
    </tr>
    <tr>
        <th>客户经理</th>
        <td>
            ${cstLost2.lstCustManagerName}</td>
        <th>上次下单时间</th>
        <td>
            ${cstLost2.lstLastOrderDate}</td>
    </tr>
    <tr>
        <th>暂缓措施</th>
        <td colspan="3">
            ${cstLost2.lstDelay}
        </td>
    </tr>

    <tr>
        <th>流失原因</th>
        <td colspan="3">
            <input name="lstId" value="${cstLost2.lstId}" type="hidden">
            <textarea rows="6" cols="50" name="lstReason"></textarea><span class="red_star">*</span></td>
            <input name="lstLostDate" type="hidden" value=" ${cstLost2.lstLostDate}">
    </tr>
</table>
</form>
</body>
</html>