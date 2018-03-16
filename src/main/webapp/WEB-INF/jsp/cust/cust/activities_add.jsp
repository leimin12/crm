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
<div class="page_title">客户信息管理 > 客户信息 > 交往记录 > 新建交往记录</div>

<form id="addac">
<table class="query_form_table">
    <tr>
        <th>时间</th>
        <td><input name="atvDate"/><span class="red_star">*</span></td>
        <th>地点</th>
        <td>
            <input name="atvPlace" size="20" /><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>概要</th>
        <td><input name="atvTitle"/><span class="red_star">*</span></td>
        <th>备注</th>
        <td><input name="atvRemark"/></td>
    </tr>
    <tr>
        <th>详细信息</th>
        <td colspan="3">
            <textarea cols="50" rows="6" name="atvDesc"> </textarea>
        </td>
    </tr>
    <div class="button_bar">
        <input type="hidden"  name="atvCustNo" value="${act.atvCustNo}" >
        <input type="hidden"  name="atvCustName" value="${act.atvCustName}" >
        <a id="acbtn" class="easyui-linkbutton" iconCls="icon-save">保存</a>
    </div>
</table>
</form>
</body>
</html>