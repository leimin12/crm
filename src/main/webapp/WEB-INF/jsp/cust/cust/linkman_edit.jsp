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
<div class="page_title">客户信息管理 > 客户信息 > 联系人 > 编辑联系人</div>

<form id="editlinkman">
<table class="query_form_table" id="table1">
    <tr>
        <th>姓名</th>
        <td><input readonly name="lkmName" id="lkmName" value="${linkmans.lkmName}" size="20" /><span class="red_star">*</span></td>
        <th>性别</th>
        <td>

            <input type="radio" name="lkmSex"  <c:if test="${linkmans.lkmSex=='男'}">checked</c:if> />男

            <input type="radio" name="lkmSex"  <c:if test="${linkmans.lkmSex=='女'}">checked</c:if> />女
        </td>
    </tr>
    <tr>
        <th>职位</th>
        <td><input name="lkmPostion" id="lkmPostion" size="20" value="${linkmans.lkmPostion}"/><span class="red_star">*</span></td>
        <th>办公电话</th>
        <td><input name="lkmTel" id="lkmTel" size="20" value="${linkmans.lkmTel}"/><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>手机</th>
        <td><input name="lkmMobile" id="lkmMobile" value="${linkmans.lkmMobile}" size="20" /></td>
        <th>备注</th>
        <td><input name="lkmMemo" id="lkmMemo" size="20" value="${linkmans.lkmMemo}"/></td>
    </tr>
    <div class="button_bar">
        <input type="hidden" name="lkmId" id="lkmId" value="${linkmans.lkmId}">
        <input type="hidden" id="lkmCustNo" name="lkmCustNo" value="${linkmans.lkmCustNo}" >
        <input type="hidden" id="lkmCustName" name="lkmCustName" value="${linkmans.lkmCustName}" >
        <a id="editlinkmanbtn" class="easyui-linkbutton" iconCls="icon-save">保存</a>
    </div>
</table>
</form>
</body>
</html>
