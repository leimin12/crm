<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <title>jb-aptech毕业设计项目</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>
    <script type="text/javascript" src="js/AcList.js"></script>
</head>
<body>
<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 交往记录</div>

<table class="query_form_table">
    <tr>
        <th>客户编号</th>
        <td id="atvcustno">${act.atvCustNo}</td>
        <th>客户名称</th>
        <td id="atv2">${act.atvCustName}</td>
    </tr>
</table>
<br />
<table id="activi">

</table>
</body>
</html>