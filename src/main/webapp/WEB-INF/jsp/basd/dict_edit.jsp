<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/8
  Time: 13:18
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
    <script src="js/add.js" type="text/javascript"></script>
</head>
<body>

<div class="page_title">数据字典管理 > 编辑数据字典条目</div>
<form method="post"id="dictEdit" >
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="back();">返回</button>
    <button id="submit" class="common_button" onclick="">保存</button>
</div>
<table class="query_form_table">
    <tr>
        <th>编号</th>
        <td>
            ${load.dictId}
            <input type="hidden" name="dictId" value="${load.dictId}"></td>
        <th>类别</th>
        <td><input name="dictType" value="${load.dictType}" /><span class="red_star">*</span><br />（需要使用Ajax实现自动补全功能）</td>
    </tr>
    <tr>
        <th>条目</th>
        <td><input name="dictItem" value="${load.dictItem}" /><span class="red_star">*</span></td>
        <th>值</th>
        <td><input name="dictValue" value="${load.dictValue}" /><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>是否可编辑</th>
        <td><input name="dictIsEditable" type="checkbox" value="1"/>

        </td>
        <th>&nbsp;</th>
        <td>&nbsp;</td>
    </tr>
</table>
</form>
</body>
</html>