$(function () {
    $("#submit").click(function () {
        $('#ff').form('submit', {
            url:"cstCustomer/cstedit",
            success:function(data){
            }
        });
    });
});