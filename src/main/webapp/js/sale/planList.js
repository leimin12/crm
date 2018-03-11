$(function () {
    $('#dg').datagrid({
        pagination: true,
        url: 'SalChance/listToPlan',
        pageList: [2, 4, 6, 8],
        pageSize: 4,
        singleSelect: true,
        idField: 'chcId',
        rownumbers: true,
        toolbar: [{
            iconCls: 'icon-cut',
            handler: function () {
                // 获取选中的一行
                var row = $('#dg').datagrid("getSelected");
                if (!row) {// 没有选中任何一行
                    $.messager.alert('警告', '请选择！');
                    return;
                } else {
                    parent.openTab('制定计划', 'SalChance/load?chcId=' + row.chcId + '&type=3');
                }

            },
            text: '制定计划'
        }, '-', {
            iconCls: 'icon-tip',
            handler: function () {
                // 获取选中的一行
                var row = $('#dg').datagrid("getSelected");
                if (!row) {// 没有选中任何一行
                    $.messager.alert('警告', '请选择！');
                    return;
                } else {
                    parent.openTab('执行计划', 'SalChance/load?chcId=' + row.chcId + '&type=5');
                }
            },
            text: '执行计划'
        }, '-', {
            iconCls: 'icon-ok',
            handler: function () {
                // 获取选中的一行
                var row = $('#dg').datagrid("getSelected");
                if (!row) {// 没有选中任何一行
                    $.messager.alert('警告', '请选择！');
                    return;
                }
                $.messager.confirm('确认', '您确认要将该机会为开发成功吗？', function(r) {
                    if (r) {
                        // var url =
                        $.ajax({
                            url : 'SalChance/editStatusByPlanSuccess?chcId='+ row.chcId,
                            dataType: "text",
                            success:function (data) {
                                $.messager.alert('消息', data);
                            }
                        });
                    }
                });
            },
            text: '开发成功'
        }, '-', {
            iconCls: 'icon-more',
            handler: function () {
                // 获取选中的一行
                var row = $('#dg').datagrid("getSelected");
                if (!row) {// 没有选中任何一行
                    $.messager.alert('警告', '请选择！');
                    return;
                } else {
                    parent.openTab('查看', 'SalChance/load?chcId=' + row.chcId + '&type=4');
                }
            },
            text: '查看'
        }],
        columns: [[{
            field: 'chcId',
            title: '编号',
            width: '10%'
        }, {
            field: 'chcCustName',
            title: '客户名称',
            width: '15%'
        }, {
            field: 'chcTitle',
            title: '概要',
            width: '20%'

        }, {
            field: 'chcLinkman',
            title: '联系人',
            width: '10%'

        }, {
            field: 'chcTel',
            title: '联系人电话',
            width: '15%'
        }, {
            field: 'chcCreateDate',
            title: '创建时间',
            width: '20%'
        }, {
            field: 'chcStatus',
            title: '状态',
            width: '10%',
            formatter: function (value) {
                if (value == 2) {
                    return '已指派';
                }else if (value == 3) {
                    return '开发成功';
                } else {
                    return "开发失败";
                }

            }
        }]]
    });
    // 进行模糊查询 使用datagrid的额外参数属性
    $("#dictBtn").click(function () {
        var aa = {
            chcCustName: $("#chcCustName").val(),
            chcTitle: $("#chcTitle").val(),
            chcLinkman: $("#chcLinkman").val()
        };
        $('#dg').datagrid({
            queryParams: aa
        });
        return false;
    });
    // 提交addSalChance.jsp表单  新建销售机会
    $("#addSalPlanBtn").click(function () {
        $('#addSalPlan').form({
            url: "salPlan/add",
            onSubmit: function () {
                // do some check
                // return false to prevent submit;
            },
            success: function (data) {
                $('#plan').datagrid('reload');
            }
        });
        // submit the form
        $('#addSalPlan').submit();
        return false;
    });
/*
    // 提交editSalChance.jsp表单  修改销售机会
    $("#editSalChanceBtn").click(function () {
        $('#editSalChance').form({
            url: "SalChance/edit",
            onSubmit: function () {
                // do some check
                // return false to prevent submit;
            },
            success: function (data) {
                $.messager.alert('消息', data);
            }
        });
        // submit the form
        $('#editSalChance').submit();
        return false;
    });*/
    // 提交editStatusByDispatch表单  修改状态
    $("#dispatchBtn").click(function () {
        $('#dispatch').form({
            url: "SalChance/editStatusByPlanSuccess",
            onSubmit: function () {
                // do some check
                // return false to prevent submit;
            },
            success: function (data) {
                $.messager.alert('消息', data);
            }
        });
        // submit the form
        $('#dispatch').submit();
        return false;
    });
    $('#plan').datagrid({
        url: 'salPlan/list',
        singleSelect: true,
        idField: 'chcId',
        rownumbers: true,
        toolbar: [{
            iconCls: 'icon-remove',
            handler: function () {
                // 获取选中的一行
                var row = $('#plan').datagrid("getSelected");
                if (!row) {// 没有选中任何一行
                    $.messager.alert('警告', '请选择！');
                    return;
                }
                $.messager.confirm('确认', '您确认想要删除记录吗？', function (r) {
                    if (r) {
                        var url = 'salPlan/del?plaId=' + row.plaId;
                        $.ajax({
                            url: url,
                        });
                        var idIndex = $('#plan').datagrid("getRowIndex", row.plaId);
                        $('#plan').datagrid("deleteRow", idIndex);
                    }
                });
            },
            text: '删除'
        }],
        columns: [[{
            field: 'plaDate',
            title: '日期',
            width: '20%'
        }, {
            field: 'plaTodo',
            title: '计划项',
            width: '80%',
            editor:'text'
        }]],onDblClickCell:function (index, field,value) {
            if (endEditing()) {
                $('#plan').datagrid('selectRow', index).datagrid('editCell', {
                    index : index,
                    field : field
                });
                editIndex = index;
            }
        },onAfterEdit:function (index, row, changes) {
            $.ajax({
                url : 'salPlan/edit?plaId='+row.plaId,
                data:{plaTodo:row.plaTodo},
                dataType: "text",
                success:function (data) {
                    $.messager.alert('消息', data);
                }
            });
        }
    });

    $.extend($.fn.datagrid.methods, {
        editCell : function(jq, param) {
            return jq.each(function() {
                var opts = $(this).datagrid('options');
                var fields = $(this).datagrid('getColumnFields', true).concat(
                    $(this).datagrid('getColumnFields'));
                for ( var i = 0; i < fields.length; i++) {
                    var col = $(this).datagrid('getColumnOption', fields[i]);
                    col.editor1 = col.editor;
                    if (fields[i] != param.field) {
                        col.editor = null;
                    }
                }
                $(this).datagrid('beginEdit', param.index);
                for ( var i = 0; i < fields.length; i++) {
                    var col = $(this).datagrid('getColumnOption', fields[i]);
                    col.editor = col.editor1;
                }
            });
        }
    });
    var editIndex = undefined;
    //结束编辑
    function endEditing() {
        if (editIndex == undefined) {
            return true
        }
        if ($('#plan').datagrid('validateRow', editIndex)) {
            $('#plan').datagrid('endEdit', editIndex);
            editIndex = undefined;
            return true;
        } else {
            return false;
        }
    }
    // 跳转至执行计划
        $("#toPlanExec").click(function () {
           parent.openTab('执行计划', 'SalChance/load?chcId=' + $("#chcId").html() + '&type=5');
            return false;
        });
    $('#planLoad').datagrid({
        url: 'salPlan/list',
        singleSelect: true,
        idField: 'chcId',
        rownumbers: true,
        columns: [[{
            field: 'plaDate',
            title: '日期',
            width: '20%'
        }, {
            field: 'plaTodo',
            title: '计划项',
            width: '80%'
        }]]
    });
    $('#planExecute').datagrid({
        url: 'salPlan/list',
        singleSelect: true,
        idField: 'chcId',
        rownumbers: true,
        columns: [[{
            field: 'plaDate',
            title: '日期',
            width: '20%'
        }, {
            field: 'plaTodo',
            title: '计划项',
            width: '40%'
        }, {
            field: 'plaResult',
            title: '执行效果',
            width: '40%',
            editor:'text'
        }]],onDblClickCell:function (index, field,value) {
            if (endEditing2()) {
                $('#planExecute').datagrid('selectRow', index).datagrid('editCell', {
                    index : index,
                    field : field
                });
                editIndex = index;
            }
        },onAfterEdit:function (index, row, changes) {
            $.ajax({
                url : 'salPlan/edit?plaId='+row.plaId,
                data:{plaTodo:row.plaTodo,plaResult:row.plaResult},
                dataType: "text",
                success:function (data) {
                    $.messager.alert('消息', data);
                }
            });
        }
    });
    // 跳转至制定计划
    $("#toPlan").click(function () {
        parent.openTab('制定计划', 'SalChance/load?chcId=' + $("#chcId").html() + '&type=3');
        return false;
    });
    // 跳转至开发成功
    $("#toOk").click(function () {
        $.messager.confirm('确认', '您确认要将该机会为开发成功吗？', function(r) {
            if (r) {
                $.ajax({
                    url : 'SalChance/editStatusByPlanSuccess?chcId='+ $("#chcId").html(),
                    dataType: "text",
                    success:function (data) {
                        $.messager.alert('消息', data);
                    }
                });
            }
        });
        return false;
    });
    // 跳转至开发失败
    $("#toNo").click(function () {
        $.messager.confirm('确认', '您确认要将该机会为开发失败吗？', function(r) {
            if (r) {
                $.ajax({
                    url : 'SalChance/editStatusByPlanFailed?chcId='+ $("#chcId").html(),
                    dataType: "text",
                    success:function (data) {
                        $.messager.alert('消息', data);
                    }
                });
            }
        });
        return false;
    });

    //结束编辑
    function endEditing2() {
        if (editIndex == undefined) {
            return true
        }
        if ($('#planExecute').datagrid('validateRow', editIndex)) {
            $('#planExecute').datagrid('endEdit', editIndex);
            editIndex = undefined;
            return true;
        } else {
            return false;
        }
    }
});