$ (function () {
    $ ('#sdeal').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'svrId',
        singleSelect : true,
        toolbar : [{
            iconCls: 'icon-Remove',
            text: '处理',
            handler: function () {
                var rows = $("#sdeal").datagrid("getSelected");
                if (!rows) {
                    $.messager.alert('警告', '请选择要处理的记录');
                    return;
                }else{
                    var svrId=rows.svrId;
                    parent.openTab('服务处理','svr/ToDealLoad?svrId='+svrId);
                }
            }
        }],
        url:"svr/ToListDispatch?svrStatus=2",
        columns : [[{
            field : 'svrCustName',
            title : '客户',
            width : "15%"
        }, {
            field : 'svrTitle',
            title : '概要',
            width : "30%"
        }, {
            field:'svrType',
            title:'服务类型',
            width:'15%'
        }, {
            field : 'svrCreateBy',
            title : '创建人',
            width : "15%"
        }, {
            field : 'svrCreateDate',
            title : '创建日期',
            width : "15%"
        },{
            field : 'svrStatus',
            title : '状态',
            width : "15%",
            formatter: function(value){
                if (value==1){
                    return '新创建';
                } else if(value==2) {
                    return '已分配';
                }else if(value==3){
                    return '已处理';
                }else if (value==4){
                    return '已归档';
                }else {
                    return value;
                }
            }
        }]]

    });
    $("#dBt").click(function () {
        var formData = {
            svrCustName:$("#svrCustName").val(),
            svrType:$("#svrType").val(),
            svrTitle:$("#svrTitle").val(),
            svrStatus:$("#svrStatus").val()
        };
        $("#sdeal").datagrid({
            queryParams : formData
        });
        return false;
    });
});