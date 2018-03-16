<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <title>jb-aptech毕业设计项目</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>
    <script type="text/javascript" src="js/OrList.js"></script>
</head>
<body>
<div class="page_title">客户信息管理 > 客户信息 > 历史订单 </div>
<div class="button_bar">
</div>
<table class="query_form_table">
    <tr>
        <th>客户名称</th>
        <input type="hidden" value="${ors.odrId}" id="odrId">
        <td id="odrCustomer">${ors.odrCustomer}</td>
    </tr>
</table>
<br />
<table id="orde">

</table>
</body>
</html>