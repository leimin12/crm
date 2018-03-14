<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp" %>
    <script type="text/javascript" src="js/sale/saleList.js"></script>
</head>
<body>
<div class="page_title">销售机会管理&nbsp; &gt; 编辑销售机会</div>
<div class="button_bar">
    <a href="#" id="editSalChanceBtn" class="easyui-linkbutton" iconCls="icon-save">修改</a>
</div>
<form id="editSalChance" method="post">
<table class="query_form_table">
    <tr>
        <th>编号</th>
        <td><input name="chcId" value="${load.chcId}"  readonly /></td>
        <th>机会来源</th>
        <td>
            <input name="chcSource" value="${load.chcSource}" size="20" /></td>
    </tr>
    <tr>
        <th>客户名称</th>
        <td><input name="chcCustName" value="${load.chcCustName}"/><span class="red_star">*</span></td>
        <th>成功机率</th>
        <td><input name="chcRate" value="${load.chcRate}"/><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>概要</th>
        <td colspan="3"><input name="chcTitle" value="${load.chcTitle}" size="46" /><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>联系人</th>
        <td><input name="chcLinkman" size="20" value="${load.chcLinkman}"/></td>
        <th>联系人电话</th>
        <td><input name="chcTel" size="20" value="${load.chcTel}"/></td>
    </tr>
    <tr>
        <th>机会描述</th>
        <td colspan="3"><textarea rows="6" cols="47" name="chcDesc">${load.chcDesc}</textarea><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>创建人</th>
        <td  colspan="3"><input name="chcCreateBy" value="${load.chcCreateBy}" readonly size="20" /><span class="red_star">*</span></td>
    </tr>
</table>
</form>
<br />
</body>
</html>
