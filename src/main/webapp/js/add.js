$(function () {
    $("#submit").click(function () {
        $('#ff').form('submit', {
            url:"dict/add",
            success:function(data){
                back();
            }
        });
    });
});
$(function () {
    $("#submit").click(function () {
        $('#dictEdit').form('submit', {
            url:"dict/ToEidt",
            success:function(data){
                    $.messager
                        .alert('提示', '修改成功');
            }
        });
    });
});
$(function () {
    $("#submit").click(function () {
        $('#sadd').form('submit', {
            url:"svr/Add",
            success:function(data){

            }
        });
    });
});

