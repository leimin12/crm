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
<div class="page_title">客户服务管理 > 服务分配</div>

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
    状态:
    <select id="svrStatus">
        <option value="">全部</option>
        <option value="1">新创建</option>
        <option value="2">已分配</option>
        <option value="3">已处理</option>
        <option value="4">已反馈</option>
        <option value="5">已归档</option>
    </select>
    <a id="ds" class="easyui-linkbutton" iconCls="icon-search">查询</a>
</div>

<div id="dd" class="easyui-dialog" data-options="closed:true" title="服务分配" style="width:400px;height:100px;display: none;">
    <select class="easyui-combobox" id="svrDueTo" style="width:380px;">
        <c:forEach items="${sysRoleList}" var="i">
            <option value="${i.roleName}">${i.roleName}</option>
        </c:forEach>
    </select>
</div>
</div>
<br />
<br />
<table class="data_list_table" id="sdtch" width="100%">

</table>
</body>
</html>
