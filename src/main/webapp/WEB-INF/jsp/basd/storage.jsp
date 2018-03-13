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
<div id="tb" style="padding:2px 5px;">
    名称:
    <input id="pName" type="text" style="width:100px">
    仓库:
    <input id="stkWarehouse"  type="text" style="width:100px">
    <a id="dstorage" class="easyui-linkbutton" iconCls="icon-search">查询</a>
</div>

<table class="data_list_table" id="dst" width="100%">

</table>

</body>
</html>