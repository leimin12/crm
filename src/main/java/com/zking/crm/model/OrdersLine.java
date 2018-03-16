package com.zking.crm.model;

import java.io.Serializable;

public class OrdersLine implements Serializable{
    private Long oddId;

    private Long oddOrderId;

    private Long oddProdId;

    private Long oddCount;

    private String oddUnit;

    private Integer oddPrice;

    public OrdersLine(Long oddId, Long oddOrderId, Long oddProdId, Long oddCount, String oddUnit, Integer oddPrice) {
        this.oddId = oddId;
        this.oddOrderId = oddOrderId;
        this.oddProdId = oddProdId;
        this.oddCount = oddCount;
        this.oddUnit = oddUnit;
        this.oddPrice = oddPrice;
    }

    public OrdersLine() {
        super();
    }

    public Long getOddId() {
        return oddId;
    }

    public void setOddId(Long oddId) {
        this.oddId = oddId;
    }

    public Long getOddOrderId() {
        return oddOrderId;
    }

    public void setOddOrderId(Long oddOrderId) {
        this.oddOrderId = oddOrderId;
    }

    public Long getOddProdId() {
        return oddProdId;
    }

    public void setOddProdId(Long oddProdId) {
        this.oddProdId = oddProdId;
    }

    public Long getOddCount() {
        return oddCount;
    }

    public void setOddCount(Long oddCount) {
        this.oddCount = oddCount;
    }

    public String getOddUnit() {
        return oddUnit;
    }

    public void setOddUnit(String oddUnit) {
        this.oddUnit = oddUnit;
    }

    public Integer getOddPrice() {
        return oddPrice;
    }

    public void setOddPrice(Integer oddPrice) {
        this.oddPrice = oddPrice;
    }

    @Override
    public String toString() {
        return "OrdersLine{" +
                "oddId=" + oddId +
                ", oddOrderId=" + oddOrderId +
                ", oddProdId=" + oddProdId +
                ", oddCount=" + oddCount +
                ", oddUnit='" + oddUnit + '\'' +
                ", oddPrice=" + oddPrice +
                '}';
    }
}