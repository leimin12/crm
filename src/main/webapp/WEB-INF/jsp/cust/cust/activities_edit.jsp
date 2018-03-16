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
<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 交往记录 &gt; 编辑交往记录</div>
<form id="editac">
<table class="query_form_table" id="table1">
    <tr>
        <th>时间</th>
        <td><input name="atvDate" value="<fmt:formatDate value="${activity1.atvDate}" pattern="yyyy-MM-dd"/>" size="20" /><span class="red_star">*</span></td>
        <th>地点</th>
        <td>
            <input name="atvPlace" value="${activity1.atvPlace}" size="20" /><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>概要</th>
        <td><input name="atvTitle" value="${activity1.atvTitle}" size="20" /><span class="red_star">*</span></td>
        <th>备注</th>
        <td><input name="atvRemark"  value="${activity1.atvRemark}" size="20" /></td>
    </tr>
    <tr>
        <th>详细信息</th>
        <td colspan="3">
            <textarea cols="50" rows="6" name="atvDesc" >${activity1.atvDesc}</textarea>
        </td>
    </tr>
    <div class="button_bar">
        <input type="hidden" id="atvId" name="atvId" value="${activity1.atvId}" >
        <input type="hidden" id="atvCustNo" name="atvCustNo" value="${activity1.atvCustNo}" >
        <input type="hidden" id="atvCustName" name="atvCustName" value="${activity1.atvCustName}" >
        <a id="editactivibtn" class="easyui-linkbutton" iconCls="icon-save">保存</a>
    </div>
</table>
</form>
</body>
</html>