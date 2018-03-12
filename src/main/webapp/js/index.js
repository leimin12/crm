$(function() {
    $("ul.myTree").each(function() {
        var url = "sysTreeNode/listByParentId?parentNodeId="
            + $(this).attr("id");
        $(this).tree({
            url : url,
            onBeforeLoad : function(node, param) {
                if (node) {
                    // 这个this代表着是当前jQuery对象 （还是属于遍历中的元素）
                    // 取出该对象的所有potions默认参数 并且改变参数的值
                    var defaluts = $(this).tree("options");
                    var newUrl = "sysTreeNode/listByParentId?parentNodeId="
                        + node.id;
                    defaluts.url = newUrl;
                }
            },
            onSelect : function(node) {
                var text = node.text;
                var url = node.attributes.url;
                openTab(text, url);
            }
        });
    });

    // 至少留一个
    $('#tt').each(function() {
        $(this).tabs({
            onBeforeClose : function(title, index) {
                if (index == 0) {
                    alert("no delete");
                    return false;
                }
                return true;
            }
        });
    });
});

function openTab(text, path) {
    if ($('#tt').tabs('exists', text)) {// 根据文本判断是否里面有该tab
        $("#tt").tabs("select", text);// 如果有则根据文本来进行选中
        var tabss = $("#tt").tabs("getTab", text);
        // 在查询出来的选项卡中找到含有iframe的元素改变src的路径 实现强制刷新
        $("iframe", tabss).attr("src", path);
    } else {
        // 如果没有已经存在的就重新创建一个新的tab
        var context = "<iframe scrolling=\"no\" frameborder=\"0\" src=\""
            + path + "\" width=\"99%\" height=\"99%\"></iframe>";
        $('#tt').tabs('add', {// 如果没有则重新创建一个新的tab
            title : text,
            content : context,
            closable : true
        });
    }


}
