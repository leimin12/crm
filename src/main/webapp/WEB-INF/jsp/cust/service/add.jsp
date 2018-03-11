<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/8
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp"%>
<%@ page import="java.text.SimpleDateFormat" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String date= format.format(new Date()).toString();
%>
<html>
<head>
    <title>jb-aptech毕业设计项目</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="js/add.js"></script>
</head>
<body>

<div class="page_title">客户服务管理 > 服务创建</div>
<form id="sadd" method="post">
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button id="submit" class="common_button">保存</button>
</div>
<table class="query_form_table">
    <tr>
        <th>编号</th>
        <td><input disabled /></td>
        <th>服务类型</th>
        <td>
            <select name="svrType">
            <option value="">--请选择--</option>
            <c:forEach items="${dictIsEditableList}" var="i">
                <option value="${i.dictItem}">${i.dictItem}</option>
            </c:forEach>
            </select>
            <span class="red_star">*</span>
        </td>
    </tr>
    <tr>
        <th>概要</th>
        <td colspan="3"><input name="svrTitle" size="53" /><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>客户</th>
        <td><input name="svrCustName" size="20" /><span class="red_star">*</span></td>
        <th>状态</th>
        <td>新创建</td>
    </tr>
    <tr>
        <th>服务请求</th>
        <td colspan="3"><textarea name="svrRequest" rows="6" cols="50"></textarea><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>创建人</th>
        <td><input name="svrCreateBy" value="刘颖" readonly size="20" /><span class="red_star">*</span></td>
        <th>创建时间</th>
        <td><input  name="svrCreateDate" value="<%=new Date()%>" readonly size="20" /><span class="red_star">*</span>
        </td>
    </tr>
</table>
</form>
</body>
</html>
