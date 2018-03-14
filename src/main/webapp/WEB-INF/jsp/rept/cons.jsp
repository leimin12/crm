<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript">
        $(document).ready(function() {
            $.ajax({
                url : "CstCustomer/doGetCount?gourpType=cust_level",
                success:function (data) {
                    var list=eval(data);
                    var data = [list];
                    var data_max = 30; //Y轴最大刻度
                    var line_title = ["客户数量"]; //曲线名称
                    var y_label = "客户数量"; //Y轴标题
                    var x_label = "客户等级名称"; //X轴标题
                    var x = ['战略合作伙伴','合作伙伴','大客户','重点开发客户','普通客户']; //定义X轴刻度值
                    var title = "客户构成分析"; //统计图标标题
                    j.jqplot.diagram.base("chart2", data, line_title, "客户构成分析", x, x_label, y_label, data_max, 2);
                }
            });
        });
        function myf(type) {
            $.ajax({
                url : "CstCustomer/doGetCount?gourpType="+type,
                success:function (data) {
                    var list=eval(data);
                    var data = [list];
                    var data_max = 30; //Y轴最大刻度
                    var line_title = ["客户数量"]; //曲线名称
                    var y_label = "客户数量"; //Y轴标题
                    var x_label = "客户等级名称"; //X轴标题
                    var x = ['战略合作伙伴','合作伙伴','大客户','重点开发客户','普通客户'];  //定义X轴刻度值
                    var title = "客户构成分析"; //统计图标标题
                    j.jqplot.diagram.base("chart2", data, line_title, "客户构成分析", x, x_label, y_label, data_max, 2);
                }
            });
        }
    </script>

</head>
<body>

<div class="page_title">客户构成分析</div>
<div class="button_bar">
</div>
<table class="query_form_table">
    <tr>
        <th>报表方式</th>
        <td>
            <select name="gourpType" onchange="myf(this.value)">
                <option value="cust_level">按等级</option>
                <option value="cust_credit">按信用度</option>
                <option value="cust_satisfy">按满意度</option>
            </select>
        </td>

        <th>&nbsp;</th>
        <td>

            &nbsp;
        </td>
    </tr>
</table>
<br /><br />
<div id="chart2"></div>
</body>
</html>
