<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <title>jb-aptech毕业设计项目</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>
    <script type="text/javascript" src="js/custList.js"></script>
</head>

<body>
<div class="page_title">客户信息管理 > 客户信息 > 联系人 </div>

<table class="query_form_table">
    <tr>
        <th>客户编号</th>
        <td id="lkmCustNo">${cst1.lkmCustNo}</td>
        <th>客户名称</th>
        <td id="lkmCustName">${cst1.lkmCustName}</td>
    </tr>
</table>
<br />
<table id="linkman">

</table>
</body>
</html>