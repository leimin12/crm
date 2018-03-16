<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    //让session失效并跳回登陆界面
    session.invalidate();
    response.sendRedirect("input/toLogin");
%>
