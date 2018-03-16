<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <title>jb-aptech毕业设计项目</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>
    <script type="text/javascript" src="js/custList.js"></script>
</head>
<body>
<div class="page_title">客户信息管理 > 客户信息 > 联系人 > 新建联系人</div>

<form id="add">
<table class="query_form_table">
    <th>客户编号</th>
    <td id="lkmCustNo">${linkman.lkmCustNo}</td>
    <th>客户名称</th>
    <td id="lkmCustName">${linkman.lkmCustName}</td>
    <tr>
        <th>姓名</th>
        <td><input  name="lkmName"/><span class="red_star">*</span></td>
        <th>性别</th>
        <td>
            <input type="radio" name="lkmSex" value="男" checked/>男
            <input type="radio" name="lkmSex" value="女"/>女
        </td>
    </tr>
    <tr>
        <th>职位</th>
        <td><input  name="lkmPostion"/><span class="red_star">*</span></td>
        <th>办公电话</th>
        <td><input  name="lkmTel"/><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>手机</th>
        <td><input  name="lkmMobile" size="20" /></td>
        <th>备注</th>
        <td><input  name="lkmMemo" size="20" /></td>
    </tr>
    <input type="hidden"  name="lkmCustNo" value="${cst1.lkmCustNo}" >
    <input type="hidden"  name="lkmCustName" value="${cst1.lkmCustName}" >
    <div class="button_bar">
        <a id="linkmanbtn" class="easyui-linkbutton" iconCls="icon-save">保存</a>
    </div>
</table>
</form>
</body>
</html>