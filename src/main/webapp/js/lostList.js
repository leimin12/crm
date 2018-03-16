$ (function () {
    $ ('#lost').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'lstId',
        singleSelect : true,
        toolbar : [{
            iconCls: 'icon-edit',
            text:'暂缓流失',
            handler: function(){
                var row=$('#lost').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选择要修改的记录');
                    return;
                }
                var lstId=row.lstId;
                parent.openTab('字典修改','cstLost/lostload?lstId='+lstId);
            }
        },'-',{
            iconCls: 'icon-edit',
            text:'确认流失',
            handler: function(){
                var row=$('#lost').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选择要修改的记录');
                    return;
                }
                var lstId=row.lstId;
                parent.openTab('字典修改','cstLost/lostloads?lstId='+lstId);
            }
        }],
        url:"cstLost/lostList",
        columns : [[{
            field : 'lstId',
            title : '编号',
            width : "20%"
        }, {
            field : 'lstCustName',
            title : '客户',
            width : "25%"
        }, {
            field : 'lstCustManagerName',
            title : '客户经理',
            width : "15%"
        }, {
            field:'lstLastOrderDate',
            title:'上次下单时间',
            width:'15%'
        }, {
            field : 'lstLostDate',
            title : '确认流失时间',
            width : "15%"
        },{
            field : 'lstStatus',
            title : '状态',
            width : "10%",
            formatter:function (value) {
                if(value == "1"){
                    return "预警";
                }else if(value == "2"){
                    return "暂缓流失";
                }else if(value == "3"){
                    return "确认流失";
                }else if(value == "4"){
                    return "暂缓客户流失成功";
                }

            }
        }]]

    });
    $("#vs").click(function () {
        var formData = {
            lstCustName:$("#lstCustName").val(),
            lstCustManagerName:$("#lstCustManagerName").val(),
            lstStatus:$("#lstStatus").val(),
        };
        $("#lost").datagrid({
            queryParams : formData
        });
        return false;
    });


        $("#relayBtn").click(function () {
            $('#relay').form('submit', {
                url:"cstLost/edit",
                success:function(data){
                    $.messager.alert('消息', data);
                }
            });
            $('#relay').submit();
            return false;
        });


        $("#confirmBtn").click(function () {
            $('#confirm').form('submit', {
                url:"cstLost/edits",
                success:function(data){
                    $.messager.alert('消息', data);
                }
            });
            $('#confirm').submit();
            return false;
        });



});





