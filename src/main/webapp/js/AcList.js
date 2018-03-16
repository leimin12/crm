$ (function () {
    $ ('#activi').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'atvId',
        singleSelect : true,

        toolbar : [{
            iconCls: 'icon-remove',
            text:'删除',
            handler: function(){
                var row=$('#activi').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选g择要删除的行');
                    return;
                }
                $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
                    if (r){
                        var atvId=row.atvId;
                        var url="Activity/acdel?atvId="+atvId;
                        $.ajax({
                            dataType:'json',
                            url:url,
                            success:function(data){
                                if(1==data){
                                    $.messager.alert('提示','删除成功');
                                    var ind=$('#activi').datagrid("getRowIndex",atvId);
                                    $('#activi').datagrid("deleteRow",ind);
                                }else{
                                    $.messager.alert('警告','删除失败,请与管理员联系');
                                }

                            }
                        });
                    }
                });
            }
        },'-',{
            iconCls: 'icon-edit',
            text:'修改',
            handler: function(){
                var row=$('#activi').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选择要修改的记录');
                    return;
                }

                var atvId=row.atvId;
                parent.openTab('字典修改','Activity/acload?atvId='+atvId);
            }
        }, '-', {
            iconCls : 'icon-add',
            handler : function() {
                parent.openTab('新建', 'Activity/add');
            },
            text : '新建'
        }],

        url:"Activity/ActivityList?atvCustNo="+$("#atvcustno").html(),
        columns : [[{
        field : 'atvDate',
        title : '时间',
        width : "30%"
    }, {
        field : 'atvPlace',
        title : '地点',
        width : "20%"
    }, {
        field : 'atvTitle',
        title : '概要',
        width : "15%"
    }, {
        field:'atvRemark',
        title:'详细信息',
        width:'15%'
    }, {
        field : 'atvDesc',
        title : '备注',
        width : "20%"
    }]]

});

    $("#acbtn").click(function () {
        $('#addac').form('submit', {
            url:"Activity/acadd",
            success:function(data){
                $.messager.alert('消息', data);
            }
        });
        $('#addac').submit();
        return false;
    });
    $("#editactivibtn").click(function () {
        $('#editac').form('submit', {
            url:"Activity/acedit",
            success:function(data){
                $.messager.alert('消息', data);
            }
        });
        $('#editac').submit();
        return false;
    });
});





