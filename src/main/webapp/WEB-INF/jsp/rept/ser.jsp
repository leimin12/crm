<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript">
        $(document).ready(function() {
            $.ajax({
                url : "Satisfy/doGetCount2?mydate=",
                success:function (datas) {
                    var list=eval(datas);
                    var data = [list];
                    var data_max = 30; //Y轴最大刻度
                    var line_title = ["服务数据"]; //曲线名称
                    var y_label = "客户数量"; //Y轴标题
                    var x_label = "客户服务类型"; //X轴标题
                    var x = ['建议','咨询','投诉']; //定义X轴刻度值
                    var title = "客户服务分析"; //统计图标标题
                    j.jqplot.diagram.base("chart2", data, line_title, "客户服务分析", x, x_label, y_label, data_max,2);
                }
            });
        });
        function myf(nian) {
            $.ajax({
                url : "Satisfy/doGetCount2?mydate="+nian,
                success:function (datas) {
                    var list=eval(datas);
                    var data = [list];
                    var data_max = 30; //Y轴最大刻度
                    var line_title = ["服务数据"]; //曲线名称
                    var y_label = "客户数量"; //Y轴标题
                    var x_label = "客户服务类型"; //X轴标题
                    var x = ['建议','咨询','投诉']; //定义X轴刻度值
                    var title = "客户服务分析"; //统计图标标题
                    j.jqplot.diagram.base("chart2", data, line_title, "客户服务分析", x, x_label, y_label, data_max,2);
                }
            });
        }
    </script>

</head>
<body>

<div class="page_title">客户服务分析</div>
<div class="button_bar">
</div>
<table class="query_form_table">
    <tr>
        <th>年份</th>
        <td>
            <select  onchange="myf(this.value)">
                <option value="">全部</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019">2019</option>
                <option value="2020">2020</option>
            </select>
        </td>
        <th>&nbsp;</th>
        <td>
            &nbsp;
        </td>
    </tr>
</table>
<br />
<br /><br />
<div id="chart2"></div>
</body>
</html>
