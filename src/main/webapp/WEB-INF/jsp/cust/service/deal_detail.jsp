<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/8
  Time: 13:32
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
    <script type="text/javascript">
        $(function () {
            $("#dsubmit").click(function () {
                $('#deal').form('submit', {
                    url:"svr/ToDealEdit",
                    success:function(data){
                    }
                });
            });
        });
    </script>
</head>

<body>

<div class="page_title">客户服务管理 &gt; 服务处理</div>
<form method="post" id="deal">

<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="back();">返回</button>
    <button id="dsubmit" class="common_button">保存</button>
</div>
<table class="query_form_table">
    <tr>
        <th>编号</th>
        <td>${satisfy.svrId}</td>
        <th>服务类型</th>
        <td>${satisfy.svrType}</td>
    </tr>
    <tr>
        <th>概要</th>
        <td colspan="3">${satisfy.svrTitle}</td>
    </tr>
    <tr>
        <th>客户</th>
        <td>${satisfy.svrCustName}</td>
        <th>状态</th>
        <td>
            <c:if test="${satisfy.svrStatus==2}">
                已分配
            </c:if>
        </td>
    </tr>
    <tr>
        <th>服务请求</th>
        <td colspan="3">${satisfy.svrRequest}<br>
            　</td>
    </tr>
    <tr>
        <th>创建人</th>
        <td>${satisfy.svrCreateBy}</td>
        <th>创建时间</th>
        <td>
            <m:formatDate value="${satisfy.svrCreateDate}" pattern="YYYY年MM月dd日 HH时mm分ss秒"></m:formatDate>
            </td>
    </tr>
</table>
<br />
<table class="query_form_table" id="table3">
    <tr>
        <th>分配给</th>
        <td>${satisfy.svrDueTo}</td>
        <th>分配时间</th>
        <td><m:formatDate value="${satisfy.svrDueDate}" pattern="YYYY年MM月dd日 HH时mm分ss秒"></m:formatDate></td>
    </tr>
</table>
<br/>
<table class="query_form_table" id="table1">
    <tr>
        <th>服务处理
            <input name="svrId" type="hidden" value="${satisfy.svrId}">
            <input name="svrStatus" type="hidden" value="3">
        </th>
        <td colspan="3"><textarea name="svrDeal " rows="6" cols="50"></textarea><span class="red_star">*</span></td>
    </tr>
    <tr>
        <th>处理人</th>
        <td><input name="svrDealBy " value="刘颖" readonly size="20" /><span class="red_star">*</span></td>
        <th>处理时间</th>
        <td><input  name="svrDealDate" value="<%=new Date()%>" readonly size="20" /><span class="red_star">*</span></td>
    </tr>
</table>
</form>
<script>
    setCurTime('t3');
</script>
</body>
</html>