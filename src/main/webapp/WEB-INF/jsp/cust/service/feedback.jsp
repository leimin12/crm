<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/8
  Time: 13:33
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

<div class="page_title">客户服务管理 &gt; 服务反馈</div>
<div id="tb" style="padding:2px 5px;">
    客户:
    <input id="svrCustName"  type="text" style="width:100px"/>
    概要:
    <input id="svrTitle"  type="text" style="width:100px"/>
    <a id="df" class="easyui-linkbutton" iconCls="icon-search">查询</a>
</div>

<table class="data_list_table" id="dsf" width="100%">

</table>

</body>
</html>
