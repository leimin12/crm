<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/8
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@include file="/common/head.jsp"%>
<html>
<head>
    <title>jb-aptech毕业设计项目</title>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="page_title">产品查询</div>
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="reload();">查询</button>
</div>
<table class="query_form_table">
    <tr>
        <th>产品</th>
        <td><input /></td>
        <th>仓库</th>
        <td><input /></td>
        <th>&nbsp;</th>
        <td>&nbsp;</td>
    </tr>
</table>
<br />
<table class="data_list_table">
    <tr>
        <th>序号</th>
        <th>产品</th>
        <th>仓库</th>
        <th>货位</th>
        <th>件数</th>
        <th>备注</th>
    </tr>
    <tr>
        <td class="list_data_number">1</td>
        <td class="list_data_ltext">幸福牌电视机-818 FFT-2388 EA03</td>
        <td class="list_data_ltext">北京-西直门库</td>
        <td class="list_data_text">EC-D2</td>
        <td class="list_data_number">16</td>
        <td class="list_data_ltext">&nbsp;</td>
    </tr>
    <tr>
        <td class="list_data_number">2</td>
        <td class="list_data_ltext">海龙笔记本电脑-i60-2688 9966</td>
        <td class="list_data_ltext">北京-大钟寺库</td>
        <td class="list_data_text">EA-B8</td>
        <td class="list_data_number">12</td>
        <td class="list_data_ltext">&nbsp;</td>
    </tr>
    <tr>
        <td class="list_data_number">3</td>
        <td class="list_data_ltext">海龙笔记本电脑-i60-2688 9966</td>
        <td class="list_data_ltext">北京-马甸库</td>
        <td class="list_data_text">EA-A6</td>
        <td class="list_data_number">8</td>
        <td class="list_data_ltext">&nbsp;</td>
    </tr>
    <tr>
        <td class="list_data_number">4</td>
        <td class="list_data_ltext">海龙笔记本电脑-i61-2689 6688</td>
        <td class="list_data_ltext">天津-恒远电子C库</td>
        <td class="list_data_text">北26位</td>
        <td class="list_data_number">36</td>
        <td class="list_data_ltext">&nbsp;</td>
    </tr>
    <tr>
        <td class="list_data_number">5</td>
        <td class="list_data_ltext">海龙笔记本电脑-i61-2689 6688</td>
        <td class="list_data_ltext">天津-恒远电子C库</td>
        <td class="list_data_text">北27位</td>
        <td class="list_data_number">36</td>
        <td class="list_data_ltext">&nbsp;</td>
    </tr>
    <tr>
        <td class="list_data_number">6</td>
        <td class="list_data_ltext">海龙笔记本电脑-i61-2689 6688</td>
        <td class="list_data_ltext">天津-恒远电子C库</td>
        <td class="list_data_text">北28位</td>
        <td class="list_data_number">30</td>
        <td class="list_data_ltext">&nbsp;</td>
    </tr>

</table>
</body>
</html>