<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp" %>
</head>
<body class="easyui-layout">
<div data-options="region:'north',split:true" style="height:80px;border-bottom:solid 1px #666;">
    <TABLE style="width:100%;">
        <tr>
            <td ><img src="images/logo.gif"></td>
            <td style="font-family:黑体;font-size:33px;font-weight:bold;"> 客户关系管理系统</td>
            <td width="25%" align="right" style="font-size:12px;" valign="bottom">当前用户：刘颖（系统管理员）&nbsp;&nbsp; 退出系统 </td>
        </tr>
    </table>
</div>
<div class="easyui-accordion" data-options="region:'west',split:true" style="width:200px;">
    <c:forEach items="${list}" var="v">
        <div title="${v.treeNodeName}" data-options="selected:true" style="overflow:auto;padding:0px;">
            <ul id="${v.treeNodeId}" class="myTree"></ul>
        </div>
    </c:forEach>
</div>
<div data-options="region:'center'" style="padding:0px;background:#eee;">
    <div id="tt" class="easyui-
    tabs" style="width:500px;height:250px;" data-options="fit:true">
        <div title="客户关系系统" data-options="closable:true" style="overflow:auto;padding:20px;display:none;">
            <img src="images/welcome.gif" />
        </div>
    </div>
</div>
<div data-options="region:'south'" style="height:50px;background:#eee;font-size:12px;scroll:no;border-top:solid 1px #666;">
    <div style="text-align:right;padding:6px;">
        &copy;  2008 北大青鸟APTECH(涞水慧仁)授权培训中心 Y272班 第7组
    </div>
</div>
</body>
</html>
