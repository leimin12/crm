package com.zking.crm.model;

import java.io.Serializable;

public class DictIsEditable implements Serializable {
    private Long dictId;

    private String dictType;

    private String dictItem;

    private String dictValue;

    private Boolean dictIsEditable;

    public DictIsEditable(Long dictId, String dictType, String dictItem, String dictValue, Boolean dictIsEditable) {
        this.dictId = dictId;
        this.dictType = dictType;
        this.dictItem = dictItem;
        this.dictValue = dictValue;
        this.dictIsEditable = dictIsEditable;
    }

    public DictIsEditable() {
        super();
    }

    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public Boolean getDictIsEditable() {
        return dictIsEditable;
    }

    public void setDictIsEditable(Boolean dictIsEditable) {
        this.dictIsEditable = dictIsEditable;
    }

    @Override
    public String toString() {
        return "DictIsEditable{" +
                "dictId=" + dictId +
                ", dictType='" + dictType + '\'' +
                ", dictItem='" + dictItem + '\'' +
                ", dictValue='" + dictValue + '\'' +
                ", dictIsEditable=" + dictIsEditable +
                '}';
    }
}