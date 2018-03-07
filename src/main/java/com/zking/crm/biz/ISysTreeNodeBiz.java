package com.zking.crm.biz;

import com.zking.crm.model.SysTreeNode;

import java.util.List;

public interface ISysTreeNodeBiz {
    List<SysTreeNode> list(SysTreeNode sysTreeNode);

    List<SysTreeNode> listByParentId(SysTreeNode sysTreeNode);
}
