package com.kkoon9.inventoryTDD;

public class EnumType {
    public enum Temperature {
        AMBIENT	    ("상온"),
        FROZEN	    ("냉동"),
        FRIDGE      ("냉장");

        private final String value;
        Temperature(String value) { this.value = value; }
    }
}
