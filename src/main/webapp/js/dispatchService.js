$ (function () {
    $ ('#sdtch').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'svrId',
        singleSelect : true,
        toolbar : [{
            iconCls: 'icon-Remove',
            text: '删除',
            handler: function () {
                var rows = $("#sdtch").datagrid("getSelected");
                if (!rows) {
                    $.messager.alert('警告', '请选择要删除的记录');
                    return;
                }
                $.messager.confirm('确认', '您确定删除该行记录吗？', function (r) {
                    if (r) {
                        var svrId = rows.svrId;
                        var url = "svr/toDel?svrId=" + svrId;
                        $.ajax({
                            dataType: 'json',
                            url: url,
                            success: function (data) {
                                if (1== data) {
                                    // alert(999);
                                    var ind = $("#sdtch").datagrid(
                                        "getRowIndex", svrId);
                                    $("#sdtch").datagrid("deleteRow", ind);
                                    $.messager
                                        .alert('提示', '删除成功');
                                } else {
                                    $.messager.alert('警告', '删除失败');
                                }
                            }
                        });
                    }
                });
            }
        },'-',{
            iconCls: 'icon-Print',
            text: '分配',
            handler:function () {
                var rows = $("#sdtch").datagrid("getSelected");
                if (!rows) {
                    $.messager.alert('警告', '请选择要分配的记录');
                    return;
                }else{
                    $('#dd').dialog({
                        title: '分配',
                        width: 400,
                        height: 200,
                        closed: false,
                        cache: false,
                        href: '',
                        modal: true,
                        toolbar:[{
                            text:'保存',
                            iconCls:'icon-save',
                            handler:function(){
                                var svrDueTo = $("#svrDueTo").combobox("getValue");
                                var url = "svr/ToEdit?svrId="+rows.svrId+"&svrDueTo="+svrDueTo+"&svrStatus=2";
                                $.ajax({
                                    dataType:'json',
                                    url:url,
                                    success:function (data) {
                                        if (1 == data) {
                                            $.messager
                                                .alert('提示', '分配成功');
                                            $('#sdtch').datagrid('reload');
                                            $('#dd').dialog('close');
                                        } else {
                                            $.messager.alert('警告', '分配失败');
                                        }
                                    }
                                });
                            }
                        }]
                    });
                }
            }
        }
        ],
        url:"svr/ToListDispatch",
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
            }, {
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
    $("#ds").click(function () {
        var formData = {
            svrCustName:$("#svrCustName").val(),
            svrType:$("#svrType").val(),
            svrTitle:$("#svrTitle").val(),
            svrStatus:$("#svrStatus").val()
        };
        $("#sdtch").datagrid({
            queryParams : formData
        });
        return false;
    });
});
