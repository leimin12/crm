<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp" %>
    <script type="text/javascript" src="js/sale/planList.js"></script>
</head>
<body>
<div class="page_title">客户开发计划 &gt; 制定计划</div>
<div class="button_bar">
    <a href="#" id="toPlanExec" name="${load.chcId}" class="easyui-linkbutton" iconCls="icon-tip">执行计划</a>
</div>
<table class="query_form_table">
    <tr>
        <th>编号</th>
        <td id="chcId">${load.chcId}</td>
        <th>机会来源</th>
        <td>${load.chcSource}</td>
    </tr>
    <tr>
        <th>客户名称</th>
        <td>${load.chcCustName}</td>
        <th>成功机率（%）</th>
        <td>&nbsp;${load.chcRate}</td>
    </tr>
    <tr>
        <th>概要</th>
        <td colspan="3">${load.chcTitle}</td>
    </tr>
    <tr>
        <th>联系人</th>
        <td>${load.chcLinkman}</td>
        <th>联系人电话</th>
        <td>${load.chcTel}</td>
    </tr>
    <tr>
        <th>机会描述</th>
        <td colspan="3">${load.chcDesc}</td>
    </tr>
    <tr>
        <th>创建人</th>
        <td>${load.chcCreateBy}</td>
        <th>创建时间</th>
        <td><m:formatDate value="${load.chcCreateDate}" pattern="yyyy年MM月dd日 hh时mm分ss秒"/></td>
    </tr>
    <tr>
        <th>指派给</th>
        <td>
            ${load.chcDueTo}</td>
        <th>指派时间</th>
        <td><m:formatDate value="${load.chcDueDate}" pattern="yyyy年MM月dd日 hh时mm分ss秒"/>
           </td>
    </tr>
</table>
<br />
<table class="data_list_table" id="plan">
</table>
<div class="button_bar">
    <a href="#" id="addSalPlanBtn" class="easyui-linkbutton" iconCls="icon-save">保存</a>
</div>
    <form id="addSalPlan" method="post">
    <table class="query_form_table">
        <tr>
            <th>日期</th>
            <jsp:useBean id="now" class="java.util.Date" scope="page"/>
            <input type="hidden" name="plaChcId" value="${load.chcId}">
            <input type="hidden" name="plaDate" value="${now}">
            <td><input value="<m:formatDate value='${now}' pattern='yyyy-MM-dd hh:mm:ss'/>" readonly/><span class="red_star">*</span></td>
            <th>计划项</th>
            <td>
                <input size="50" name="plaTodo" /><span class="red_star">*</span>
            </td>
        </tr>
    </table>
    </form>
</body>
</html>
