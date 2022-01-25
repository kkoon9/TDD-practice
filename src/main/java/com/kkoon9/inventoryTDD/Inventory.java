package com.kkoon9.inventoryTDD;

import java.math.BigDecimal;

class Inventory {
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;
    private EnumType.Temperature type;
    private int capacity;
    private int current;

    public Inventory() {
    }

    public Inventory(BigDecimal length, BigDecimal width, BigDecimal height, EnumType.Temperature type, int capacity, int current) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.type = type;
        this.capacity = capacity;
        this.current = current;
    }

    BigDecimal getLength() {
        return length;
    }

    void setLength(BigDecimal length) {
        this.length = length;
    }

    BigDecimal getWidth() {
        return width;
    }

    void setWidth(BigDecimal width) {
        this.width = width;
    }

    BigDecimal getHeight() {
        return height;
    }

    void setHeight(BigDecimal height) {
        this.height = height;
    }

    EnumType.Temperature getType() {
        return type;
    }

    void setType(EnumType.Temperature type) {
        this.type = type;
    }

    int getCapacity() {
        return capacity;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    int getCurrent() {
        return current;
    }

    void setCurrent(int current) {
        this.current = current;
    }

    boolean isAbleCurrentCount() {
        return this.getCapacity() >= this.getCurrent();
    }

    int usableCapacity() { return this.getCapacity() - this.getCurrent(); }
}
