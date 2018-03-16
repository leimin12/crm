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
<div class="page_title">客户流失管理 &gt; 暂缓措施</div>

<form id="relay">
<table class="query_form_table">
    <tr>
        <th>编号</th>
        <td>${cstLost1.lstId}</td>
        <th>客户</th>
        <td>${cstLost1.lstCustName}</td>
    </tr>
    <tr>
        <th>客户经理</th>
        <td>
            ${cstLost1.lstCustManagerName}</td>
        <th>上次下单时间</th>
        <td>
            ${cstLost1.lstLastOrderDate}</td>
    </tr>
    <tr>
        <th>暂缓措施</th>
        <td colspan="3">
            ${cstLost1.lstDelay}</td>
    </tr>
    <tr>
        <th>追加暂缓措施</th>
        <td colspan="3">
            <textarea rows="6" cols="50" name="lstDelay"></textarea><span class="red_star">*</span></td>
    </tr>
    <div class="button_bar">
        <input name="lstId" value="${cstLost1.lstId}" type="hidden">
        <a href="#" id="relayBtn" class="easyui-linkbutton" iconCls="icon-save">保存</a>
    </div>
</table>
</form>
<br />
</body>
</html>