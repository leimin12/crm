$ (function () {
    $ ('#orde').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'odrId',
        singleSelect : true,

        toolbar : [{
            iconCls: 'icon-search',
            text:'查看明细',
            handler: function() {
                var row = $('#orde').datagrid("getSelected");
                if (!row) {
                    $.messager.alert('警告', '请选择要查看的订单');
                    return;
                }
                var odrId = row.odrId;
                parent.openTab('查看', 'orders/orloadsssss?odrId='+ odrId);
            }
        }],

        url:"orders/orderList?odrCustomer="+$("#odrCustomer").html(),
        columns : [[{
        field : 'odrId',
        title : '订单编号',
        width : "20%"
    }, {
        field : 'odrDate',
        title : '日期',
        width : "30%"
    }, {
        field : 'odrAddr',
        title : '送货地址',
        width : "40%"
    }, {
        field:'odrStatus',
        title:'状态',
        width:'10%',
            formatter:function (value) {
                if (value == "a") {
                    return "已回款";
                } else if (value == "b") {
                    return "未回款";
                }
            }
    }, ]]

});

});





