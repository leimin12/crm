$ (function () {
    $ ('#dg').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'custNo',
        singleSelect : true,
        toolbar : [{
            iconCls: 'icon-remove',
            text:'删除',
            handler: function(){
                var row=$('#dg').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选g择要删除的行');
                    return;
                }
                $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
                    if (r){
                        var custNo=row.custNo;
                        var url="cstCustomer/cstdel?custNo="+custNo;
                        $.ajax({
                            dataType:'json',
                            url:url,
                            success:function(data){
                                if(0==data.code){
                                    $.messager.alert('提示','删除成功');
                                    var ind=$('#dg').datagrid("getRowIndex",custNo);
                                    $('#dg').datagrid("deleteRow",ind);
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
                var row=$('#dg').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选择要修改的记录');
                    return;
                }
                var custNo=row.custNo;
                parent.openTab('字典修改','cstCustomer/cstload?custNo='+custNo);
            }
        },'-',{
            iconCls: 'icon-add',
            text:'联系人',
            handler: function(){
                var row=$('#dg').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选择要查看的联系人');
                    return;
                }
                var custNo=row.custNo;
                parent.openTab('查看','cstCustomer/cstedit?custNo='+custNo);
            }
        },'-',{
            iconCls: 'icon-cut',
            text:'交往记录',
            handler: function(){
                var row=$('#dg').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选择要查看的交往记录');
                    return;
                }
                var custNo=row.custNo;
                parent.openTab('查看','cstCustomer/cstedit?custNo='+custNo);
            }
        },'-',{
            iconCls: 'icon-save',
            text:'历史订单',
            handler: function(){
                var row=$('#dg').datagrid("getSelected");
                if(!row){
                    $.messager.alert('警告','请选择要查看的历史订单');
                    return;
                }
                var custNo=row.custNo;
                parent.openTab('查看','cstCustomer/cstedit?custNo='+custNo);
            }
        }],
        url:"cstCustomer/cstList",
        columns : [[{
            field : 'custNo',
            title : '客户编号',
            width : "20%"
        }, {
            field : 'custName',
            title : '名称',
            width : "30%"
        }, {
            field : 'custRegion',
            title : '地区',
            width : "15%"
        }, {
            field:'custManagerName',
            title:'客户经理',
            width:'15%'
        }, {
            field : 'custLevelLabel',
            title : '客户等级',
            width : "20%"
        }]]

    });
    $("#dg").click(function () {
        var formData = {
            custno:$("#custno").val(),
            custname:$("#custname").val(),
            custr:$("#custr").val(),
            custmanage:$("#custmanage").val(),
            custnagename:$("#custnagename").val()
        };
        $("#dg").datagrid(function () {
            alert(formData);
            queryParams : formData
        });
        return false;
    });

});