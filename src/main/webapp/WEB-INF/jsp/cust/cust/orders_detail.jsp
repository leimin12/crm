<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/common/head.jsp" %>
<html>
<head>
    <title>jb-aptech毕业设计项目</title>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script src="script/common.js"></script>
    <script type="text/javascript" src="js/OrList.js"></script>

</head>
<body onload="summ()">
<div class="page_title">客户信息管理 &gt; 客户信息 &gt; 历史订单 &gt; 订单明细 </div>
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="back();">返回</button>
</div>
<table class="query_form_table" height="59">
    <tr>
        <th>订单编号</th>
        <td>${order.odrId}</td>
        <th>日期</th>
        <td><fmt:formatDate value="${order.odrDate}" pattern="yyyy-MM-dd" /></td>
    </tr>
    <tr>
        <th height="28">送货地址</th>
        <td>${order.odrAddr}　</td>
        <th height="28">总金额（元）</th>
        <td>${sums}</td>
    </tr>
    <tr>
        <th height="28">状态</th>
        <c:if test="${order.odrStatus=='a'}">
            <td>已回款</td>
        </c:if>
        <c:if test="${order.odrStatus=='b'}">
            <td>未回款</td>
        </c:if>
        <th height="28">&nbsp;</th>
        <td>&nbsp;</td>
    </tr>
</table>
<br />
<table class="data_list_table">
    <tr>
        <th>商品</th>
        <th>数量</th>
        <th>单位</th>
        <th>单价（元）</th>
        <th>金额（元）</th>
    </tr>
    <c:forEach items="${ordersLines}"  var="orl">
    <tr>
        <td class="list_data_text">${orl.oddProdId}</td>
        <td class="list_data_ltext">${orl.oddCount}</td>
        <td class="list_data_text">${orl.oddUnit}</td>
        <td class="list_data_text">${orl.oddPrice}</td>
        <td class="list_data_text" id="sum">${orl.oddCount*orl.oddPrice}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>