<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp"%>
    <script type="text/javascript">
        $(document).ready(function() {
            $.ajax({
                url : "orders2/listCount?odrCustomer=''&mydate=''",
                success:function (datas) {
                    var m=datas.split("!");
                    var names=eval(m[0]);
                    var moneys=eval(m[1]);
                    var data =[moneys];
                    var data_max = 10000; //Y轴最大刻度
                    var line_title = ["总金额"]; //曲线名称
                    var y_label = "总金额（元）"; //Y轴标题
                    var x_label = "客户名称"; //X轴标题
                    var x = [names[0],names[1]]; //定义X轴刻度值
                    var title = "客户贡献分析"; //统计图标标题
                    j.jqplot.diagram.base("chart2", data, line_title, "客户贡献分析", x, x_label, y_label, data_max,2);
                }
            });
        });
        function reload() {
            var odrCustomer=document.getElementById("odrCustomer").value;
            var odrDate=document.getElementById("odrDate").value;
            alert(odrCustomer + odrDate);
            $.ajax({
                url : "orders2/listCount?odrCustomer="+odrCustomer+"&mydate="+odrDate,
                success:function (datas) {
                    var m=datas.split("!");
                    var names=eval(m[0]);
                    var moneys=eval(m[1]);
                    var data =[moneys];
                    var data_max = 10000; //Y轴最大刻度
                    var line_title = ["总金额"]; //曲线名称
                    var y_label = "总金额（元）"; //Y轴标题
                    var x_label = "客户名称"; //X轴标题
                    var x = [names[0],names[1]]; //定义X轴刻度值
                    var title = "客户贡献分析"; //统计图标标题
                    j.jqplot.diagram.base("chart2", data, line_title, "客户贡献分析", x, x_label, y_label, data_max,2);
                }
            });
        }
    </script>

</head>
<body>

<div class="page_title">客户贡献分析</div>
<div class="button_bar">
    <button class="common_button" onclick="help('');">帮助</button>
    <button class="common_button" onclick="reload();">查询</button>
</div>
<table class="query_form_table">
    <tr>
        <th>客户名称</th>
        <td><input id="odrCustomer"/></td>
        <th>年份</th>
        <td>
            <select id="odrDate">
                <option value="">全部</option>
                <option value="2017">2017</option>
                <option value="2018">2018</option>
                <option value="2019">2019</option>
                <option value="2020">2020</option>
            </select>
        </td>
    </tr>
</table>
<br />
<br /><br />
<div id="chart2"></div>
</body>
</html>
