<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/8
  Time: 13:17
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

<div class="page_title">数据字典管理</div>

<div id="tb" style="padding:2px 5px;">
    类别:
    <input id="dictType"  type="text" style="width:100px"/>
    条目:
    <input id="dictItem"  type="text" style="width:100px"/>
    值:
    <input id="dictValue"  type="text" style="width:100px">
    <a id="dg" class="easyui-linkbutton" iconCls="icon-search">查询</a>
</div>

<table class="data_list_table" id="di" width="100%">

</table>
<div id="wu-dialog1" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:550px;  padding:20px;">
    <form method="post" id="wu-form1">
        <table class="query_form_table"> 
            <tr>
                <th>编号</th>
                <td>
                    <input  name="dictId" readonly></td>
                <th>类别</th>
                <td><input name="dictType"  /><span class="red_star">*</span><br />（需要使用Ajax实现自动补全功能）</td>
            </tr>
            <tr>
                <th>条目</th>
                <td><input name="dictItem"  /><span class="red_star">*</span></td>
                <th>值</th>
                <td><input name="dictValue" /><span class="red_star">*</span></td>
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
</div>
</body>
</html>