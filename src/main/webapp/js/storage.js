$ (function () {
    $ ('#dst').datagrid({
        pagination : true,
        pageList : [1, 2, 4, 6],
        pageSize : 6,
        idField : 'sktId',
        singleSelect : true,
        url:"storage/ToList",
        columns : [[{
            field : 'pName',
            title : '产品',
            width : "20%"
        }, {
            field : 'stkWarehouse',
            title : '仓库',
            width : "20%"
        }, {
            field : 'stkWare',
            title : '货位',
            width : "20%"
        },{
            field:'stkCount',
            title:'件数',
            width:'10%'
        },{
            field:'stkMemo',
                title:'备注',
                width:'20%'
            }
        ]]

    });
    $("#dstorage").click(function () {
        var formData = {
            stkWarehouse:$("#stkWarehouse").val(),
            pName:$("#pName").val()
        };
        $("#dst").datagrid( {
            queryParams : formData
        });
        return false;
    });
});
