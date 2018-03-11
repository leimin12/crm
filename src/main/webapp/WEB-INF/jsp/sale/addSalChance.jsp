<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp" %>
    <script type="text/javascript" src="js/sale/saleList.js"></script>
</head>
<body>
<div class="page_title">销售机会管理&nbsp; &gt; 新建销售机会</div>
<div class="button_bar">
    <a href="#" id="addSalChanceBtn" class="easyui-linkbutton" iconCls="icon-save">保存</a>
</div>
<form id="addSalChance" method="post">
<table class="query_form_table">
    <tr>
        <th>机会来源</th>
        <td colspan="3">
            <input name="chcSource" size="20" /></td>
    </tr>
    <tr>
        <th>客户名称</th>
        <td><input name="chcCustName" /><span class="red_star">*</span></td>
        <th>成功机率</th>
        <td><input name="chcRate"/><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>概要</th>
        <td colspan="3"><input name="chcTitle" size="52" /><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>联系人</th>
        <td><input name="chcLinkman" size="20" /></td>
        <th>联系人电话</th>
        <td><input name="chcTel" size="20" /></td>
    </tr>
    <tr>
        <th>机会描述</th>
        <td colspan="3"><textarea rows="6" cols="50" name="chcDesc"></textarea><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>创建人</th>
        <td  colspan="3"><input name="chcCreateBy" value="刘颖" readonly size="20" /><span class="red_star">*</span></td>
    </tr>
</table>
</form>
<br />
</body>
</html>
