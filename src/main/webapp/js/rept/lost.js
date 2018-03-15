$(function() {
    $('#dg').datagrid({
        pagination : true,
        url : 'lostCont/listLost',
        pageList : [2, 4, 6, 8],
        pageSize : 4,
        singleSelect : true,
        idField : 'lstId',
        rownumbers : true,
        columns : [[{
            field : 'lstId',
            title : '编号',
            width : '10%'
        }, {
            field : 'lstLostDate',
            title : '年份',
            width : '15%'
        }, {
            field : 'lstCustName',
            title : '客户',
            width : '25%'

        }, {
            field : 'lstCustManagerName',
            title : '客户经理',
            width : '15%'

        }, {
            field : 'lstReason',
            title : '流失原因',
            width : '35%'
        }]]
    });
    // 进行模糊查询 使用datagrid的额外参数属性
    $("#dictBtn").click(function() {
        var aa = {
            lstCustName : $("#lstCustName").val(),
            lstCustManagerName:$("#lstCustManagerName").val()
        };
        $('#dg').datagrid({
            queryParams : aa
        });
        return false;
    });
});