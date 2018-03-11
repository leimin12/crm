<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/8
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/head.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>jb-aptech毕业设计项目</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="page_title">客户服务管理 &gt; 服务处理</div>
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="reload();">查询</button>
</div>
<table class="query_form_table">
    <tr>
        <th height="28">客户</th>
        <td><input /></td>
        <th height="28">概要</th>
        <td><input /></td>
        <th height="28">服务类型</th>
        <td>
            <select name="D1">
                <option>全部</option>
                <option>咨询</option>
                <option>建议</option>
                <option>投诉</option>
            </select>
        </td>
    </tr>
    <tr>
        <th height="32">创建日期</th>
        <td colspan="3">
            <input name="T2" size="10" /> - <input name="T1" size="10" /></td>
        <th height="32">状态</th>
        <td>
            <select name="D1">
                <option selected>已分配</option>
            </select>
        </td>
    </tr>
</table>
<br/>
<table class="data_list_table" id="sdeal" width="100%">

</table>

</body>
</html>
