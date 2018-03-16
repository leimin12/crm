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
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="page_title">客户服务管理 &gt; 服务归档</div>
<div id="tb" style="padding:2px 5px;">
    客户:
    <input id="svrCustName"  type="text" style="width:100px"/>
    概要:
    <input id="svrTitle"  type="text" style="width:100px"/>
    服务类型:<select id="svrType">
    <option value="">全部</option>
    <c:forEach items="${dictIsEditableList}" var="i">
        <option value="${i.dictItem}">${i.dictItem}</option>
    </c:forEach>
</select>
    <a id="da" class="easyui-linkbutton" iconCls="icon-search">查询</a>
</div>
<table class="data_list_table" id="darch" width="100%">

</table>

</body>
</html>
