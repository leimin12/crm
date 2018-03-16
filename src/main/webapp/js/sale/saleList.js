$(function() {
    $('#dg').datagrid({
        pagination : true,
        url : 'SalChance/list',
        pageList : [2, 4, 6, 8],
        pageSize : 4,
        singleSelect : true,
        idField : 'chcId',
        rownumbers : true,
        toolbar : [{
            iconCls : 'icon-redo',
            handler : function() {
                // 获取选中的一行
                var row = $('#dg').datagrid("getSelected");
                if (!row) {// 没有选中任何一行
                    $.messager.alert('警告', '请选择！');
                    return;
                }else{
                    parent.openTab('指派销售机会', 'SalChance/load?chcId='+ row.chcId+'&type=2');
                }

            },
            text : '指派'
        }, '-', {
            iconCls : 'icon-add',
            handler : function() {
                parent.openTab('新建销售机会', 'SalChance/toAddSalChance');
            },
            text : '新建'
        }, '-', {
            iconCls : 'icon-edit',
            handler : function() {
                // 获取选中的一行
                var row = $('#dg').datagrid("getSelected");
                if (!row) {// 没有选中任何一行
                    $.messager.alert('警告', '请选择！');
                    return;
                }else{
                    parent.openTab('修改销售机会', 'SalChance/load?chcId='+ row.chcId+'&type=1');
                }
            },
            text : '修改'
        }, '-', {
            iconCls : 'icon-remove',
            handler : function() {
                // 获取选中的一行
                var row = $('#dg').datagrid("getSelected");
                if (!row) {// 没有选中任何一行
                    $.messager.alert('警告', '请选择！');
                    return;
                }
                $.messager.confirm('确认', '您确认想要删除记录吗？', function(r) {
                    if (r) {
                        var url = 'SalChance/del?chcId='+ row.chcId;
                        $.ajax({
                            url : url
                        });
                        var idIndex = $('#dg').datagrid("getRowIndex", row.chcId);
                        $('#dg').datagrid("deleteRow", idIndex);
                    }
                });
            },
            text : '删除'
        }],
        columns : [[{
            field : 'chcId',
            title : '编号',
            width : '10%'
        }, {
            field : 'chcCustName',
            title : '客户名称',
            width : '15%'
        }, {
            field : 'chcTitle',
            title : '概要',
            width : '25%'

        }, {
            field : 'chcLinkman',
            title : '联系人',
            width : '15%'

        }, {
            field : 'chcTel',
            title : '联系人电话',
            width : '15%'
        }, {
            field : 'chcCreateDate',
            title : '创建时间',
            width : '20%'
        }]]
    });
    // 进行模糊查询 使用datagrid的额外参数属性
    $("#dictBtn").click(function() {
        var aa = {
            chcCustName : $("#chcCustName").val(),
            chcTitle:$("#chcTitle").val(),
            chcLinkman:$("#chcLinkman").val()
        };
        $('#dg').datagrid({
            queryParams : aa
        });
        return false;
    });
    // 提交addSalChance.jsp表单  新建销售机会
    $("#addSalChanceBtn").click(function() {
        $('#addSalChance').form({
                url:"SalChance/add",
            onSubmit: function(){
            // do some check
            // return false to prevent submit;
        },
        success:function(data){
            $.messager.alert('消息', data);
        }
    });
        // submit the form
        $('#addSalChance').submit();
        return false;
    });

    // 提交editSalChance.jsp表单  修改销售机会
    $("#editSalChanceBtn").click(function() {
        $('#editSalChance').form({
            url:"SalChance/edit",
            onSubmit: function(){
                // do some check
                // return false to prevent submit;
            },
            success:function(data){
                $.messager.alert('消息', data);
            }
        });
        // submit the form
        $('#editSalChance').submit();
        return false;
    });
    // 提交editSalChance.jsp表单  修改销售机会
    $("#dispatchBtn").click(function() {
        $('#dispatch').form({
            url:"SalChance/editStatusByDispatch",
            onSubmit: function(){
                // do some check
                // return false to prevent submit;
            },
            success:function(data){
                $.messager.alert('消息', data);
            }
        });
        // submit the form
        $('#dispatch').submit();
        return false;
    });
});