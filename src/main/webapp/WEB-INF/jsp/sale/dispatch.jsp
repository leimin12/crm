<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp" %>
    <script type="text/javascript" src="js/sale/saleList.js"></script>
</head>
<body>
<div class="page_title">销售机会管理&nbsp; &gt; 指派销售机会</div>
<div class="button_bar">
    <a href="#" id="dispatchBtn" class="easyui-linkbutton" iconCls="icon-save">指派</a>
</div>

<table class="query_form_table">
    <tr>
        <th>编号</th>
        <td><input name="chcId" value="${load.chcId}"  readonly /></td>
        <th>机会来源</th>
        <td>
            <input name="chcSource" value="${load.chcSource}" size="20" readonly/></td>
    </tr>
    <tr>
        <th>客户名称</th>
        <td><input name="chcCustName" value="${load.chcCustName}" readonly/><span class="red_star">*</span></td>
        <th>成功机率</th>
        <td><input name="chcRate" value="${load.chcRate}" readonly/><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>概要</th>
        <td colspan="3"><input name="chcTitle" value="${load.chcTitle}" readonly size="46" /><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>联系人</th>
        <td><input name="chcLinkman" size="20" value="${load.chcLinkman}" readonly/></td>
        <th>联系人电话</th>
        <td><input name="chcTel" size="20" value="${load.chcTel}" readonly/></td>
    </tr>
    <tr>
        <th>机会描述</th>
        <td colspan="3"><textarea rows="6" cols="47" name="chcDesc" readonly>${load.chcDesc}</textarea><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>创建人</th>
        <td  colspan="3"><input name="chcCreateBy" value="${load.chcCreateBy}" readonly size="20" readonly /><span class="red_star">*</span></td>
    </tr>
</table>

<br />
<form id="dispatch" method="post">
    <input type="hidden" name="chcId" value="${load.chcId}">
    <table class="query_form_table" id="table1">
        <tr>
            <th>指派给</th>
            <td>

                <select name="chcDueTo">
                    <option>请选择...</option>
                    <c:forEach var="v" items="${list}">
                    <option value="${v.roleName}">${v.roleName}</option>
                    </c:forEach>
                </select> <span class="red_star">*</span></td>
            <th>指派时间</th>
            <td>
                <jsp:useBean id="now" class="java.util.Date" scope="page"/>
                <input type="hidden" name="chcDueDate" value="${now}">
                <input id="t2" name="" value="<fmt:formatDate value='${now}' pattern='yyyy-MM-dd hh:mm:ss'/>"  readonly size="20" /><span class="red_star">*</span></td>
        </tr>
    </table>
</form>
</body>
</html>
