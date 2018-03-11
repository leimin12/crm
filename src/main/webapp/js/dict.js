$ (function () {
    $ ('#di').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'dictId',
        singleSelect : true,
        toolbar : [{
            iconCls: 'icon-add',
            text:'新增',
            handler: function(){
                parent.openTab('字典新增','dict/Toadd');
            }
        },'-',{
            iconCls: 'icon-remove',
            text:'删除',
            handler: function(){
                var row=$('#di').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选择要删除的行');
                    return;
                }
                $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
                    if (r){
                        var dictId=row.dictId;
                        var url="dict/Todel?dictId="+dictId;
                        $.ajax({
                            dataType:'json',
                            url:url,
                            success:function(data){
                                if(0==data.code){
                                    $.messager.alert('提示','删除成功');
                                    var ind=$('#di').datagrid("getRowIndex",dictId);
                                    $('#di').datagrid("deleteRow",ind);
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
                var row=$('#di').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选择要修改的记录');
                    return;
                }
                var dictId=row.dictId;
                parent.openTab('字典修改','dict/Toload?dictId='+dictId);
            }
        }],
        url:"dict/dictlist",
        columns : [[{
            field : 'dictType',
            title : '字典类型',
            width : "25%"
        }, {
            field : 'dictItem',
            title : '字典条目',
            width : "30%"
        }, {
            field : 'dictValue',
            title : '字典值',
            width : "25%"
        }, {
            field:'dictIsEditable',
            title:'能否编辑',
            width:'20%'
        }]]

    });
    $("#dg").click(function () {
        alert($("#dictType").val()+$("#dictItem").val()+$("#dictValue").val());
        var formData = {
            dictType:$("#dictType").val(),
            dictItem:$("#dictItem").val(),
            dictValue:$("#dictValue").val()

        };
        $("#di").datagrid( {
            queryParams : formData
        });
        return false;
    });
});
