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

<div class="page_title">客户服务管理 &gt; 服务处理</div>
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="back();">返回</button>
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
            <c:if test="${satisfy.svrStatus==1}">
                新创建
            </c:if>
            <c:if test="${satisfy.svrStatus==2}">
                已分配
            </c:if>
            <c:if test="${satisfy.svrStatus==3}">
                已处理
            </c:if>
            <c:if test="${satisfy.svrStatus==4}">
                已反馈
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
            <th>服务处理</th>
            <td colspan="3"><textarea rows="6" cols="50" readonly>${satisfy.svrDealBy}</textarea><span class="red_star">*</span></td>
        </tr>
        <tr>
            <th>处理人</th>
            <td>${satisfy.svrDealBy}<span class="red_star">*</span></td>
            <th>处理时间</th>
            <td>
                <m:formatDate value="${satisfy.svrDealDate}" pattern="YYYY年MM月dd日 HH时mm分ss秒"></m:formatDate>
                <span class="red_star">*</span></td>
        </tr>
    </table>
    <br />
    <table disabled class="query_form_table" id="table2">
        <tr>
            <th>处理结果</th>
            <td>
                ${satisfy.svrResult}
                <span class="red_star">*</span></td>
            <th>满意度</th>
            <td>
                <c:if test="${satisfy.svrSatisfy==1}">
                    <img src="images/star.jpg" class="star_pic" />
                </c:if>
                <c:if test="${satisfy.svrSatisfy==2}">
                    <img src="images/star.jpg" class="star_pic" />
                    <img src="images/star.jpg" class="star_pic" />
                </c:if>
                <c:if test="${satisfy.svrSatisfy==3}">
                    <img src="images/star.jpg" class="star_pic" />
                    <img src="images/star.jpg" class="star_pic" />
                    <img src="images/star.jpg" class="star_pic" />
                </c:if>
                <c:if test="${svrSatisty.svrSatisfy==4}">
                    <img src="images/star.jpg" class="star_pic" />
                    <img src="images/star.jpg" class="star_pic" />
                    <img src="images/star.jpg" class="star_pic" />
                    <img src="images/star.jpg" class="star_pic" />
                </c:if>
                <c:if test="${satisfy.svrSatisfy==5}">
                    <img src="images/star.jpg" class="star_pic" />
                    <img src="images/star.jpg" class="star_pic" />
                    <img src="images/star.jpg" class="star_pic" />
                    <img src="images/star.jpg" class="star_pic" />
                    <img src="images/star.jpg" class="star_pic" />
                </c:if>
                <span class="red_star">*</span></td>
        </tr>
    </table>
</body>
</html>