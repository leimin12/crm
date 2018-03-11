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
                        var url = "?svrId=" + svrId;
                        $.ajax({
                            dataType: 'json',
                            url: url,
                            success: function (data) {
                                if (0 == data.code) {
                                    $.messager
                                        .alert('提示', data.message);
                                    // alert(999);
                                    var ind = $("#sdtch").datagrid(
                                        "getRowIndex", svrId);
                                    $("#sdtch").datagrid("deleteRow", ind);
                                } else {
                                    $.messager.alert('警告', '字典删除失败');
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
                var rows = $("#ssdtch").datagrid("getSelected");
                var svrDueTo = $("#svrDueTo").combobox("getValue");
                if (!rows) {
                    $.messager.alert('警告', '请选择要分配的记录');
                    return;
                }else{
                    $('#dd').dialog({
                        title: 'My Dialog',
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
                                var url = "service/editDispatch?svrId="+rows.svrId+"&svrDueTo="+svrDueTo;
                                $.ajax({
                                    dataType:'json',
                                    url:url,
                                    success:function (data) {
                                        if (0 == data.code) {
                                            $.messager
                                                .alert('提示', data.message);
                                            $('#sdtch').datagrid('reload');
                                            close();
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
        url:"svr/ToList",
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
            width : "15%"
        }]]

    });
    $("#sdtch").click(function () {
        var formData = {
            svrCustName:$("#svrCustName").val()
            // svrType:$("#svrType").val(),
            // T1:$("#T1").val(),
            // T2:$("#T2").val()
        };
        $("#di").datagrid({
            queryParams : formData
        });
        return false;
    });
});