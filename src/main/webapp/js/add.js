$(function () {
    $("#submit").click(function () {
        $('#ff').form('submit', {
            url:"dict/add",
            success:function(data){
                parent.location.reload();

            }
        });
    });
});
$(function () {
    $("#submit").click(function () {
        $('#dictEdit').form('submit', {
            url:"dict/ToEidt",
            success:function(data){
                window.location.reload();

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
