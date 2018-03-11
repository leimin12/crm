<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp" %>
    <script type="text/javascript" src="js/sale/saleList.js"></script>
</head>
<body>
    <div class="page_title">销售机会管理</div><br>
    <div id="tb" style="padding:2px 5px;">
        客户名称: <input id="chcCustName" name="chcCustName" style="width:110px">
        概要: <input id="chcTitle" name="chcTitle" style="width:110px">
        联系人: <input id="chcLinkman" name="chcLinkman" style="width:110px">
        <a href="#" id="dictBtn" class="easyui-linkbutton" iconCls="icon-search">Search</a>
    </div>
    <table id="dg"></table>
    <br>
</body>
</html>
