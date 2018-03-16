$ (function () {
    $ ('#dp').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'prodId',
        singleSelect : true,
        url:"product/ToList",
        columns : [[{
            field : 'prodName',
            title : '名称',
            width : "20%"
        }, {
            field : 'prodType',
            title : '型号',
            width : "20%"
        }, {
            field : 'prodBatch',
            title : '等级/批次',
            width : "20%"
        },{
            field:'prodUnit',
            title:'单位',
            width:'10%'
        },{
            field:'prodPrice',
            title:'单价(元)',
            width:'10%'
        },{
            field:'prodMemo',
                title:'备注',
                width:'20%'
            }
        ]]

    });
    $("#dproudct").click(function () {

        var formData = {
            prodName:$("#prodName").val(),
            prodType:$("#prodType").val(),
            prodBatch:$("#prodBatch").val()

        };
        $("#dp").datagrid( {
            queryParams : formData
        });
        return false;
    });
});
