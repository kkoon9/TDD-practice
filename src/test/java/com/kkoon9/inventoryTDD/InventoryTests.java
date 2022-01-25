package com.kkoon9.inventoryTDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class InventoryTests {

    @Test
    void testInventory_size_test() {
        Inventory inventory = new Inventory();

        inventory.setLength(new BigDecimal(10));
        inventory.setWidth(new BigDecimal(10));
        inventory.setHeight(new BigDecimal(10));

        Assertions.assertEquals(new BigDecimal(10), inventory.getLength());
        Assertions.assertEquals(new BigDecimal(10), inventory.getWidth());
        Assertions.assertEquals(new BigDecimal(10), inventory.getHeight());
    }

    @Test
    void testInventory_type_test() {
        Inventory inventory = new Inventory();

        inventory.setType(EnumType.Temperature.AMBIENT);

        Assertions.assertEquals(EnumType.Temperature.AMBIENT, inventory.getType());
    }

    @Test
    void testInventory_capacity_test() {
        Inventory inventory = new Inventory();

        inventory.setCapacity(10);

        Assertions.assertEquals(10, inventory.getCapacity());
    }

    @Test
    void testInventory_current_count_test() {
        Inventory inventory = new Inventory();

        inventory.setCurrent(10);

        Assertions.assertEquals(10, inventory.getCurrent());
    }

    @Test
    void testInventory_unable_current_count_test() {
        Inventory inventory = new Inventory();
        inventory.setCapacity(5);
        inventory.setCurrent(10);

        Assertions.assertEquals(false, inventory.isAbleCurrentCount());
    }

    @Test
    void testInventory_usable_capacity_test() {
        Inventory inventory = new Inventory();
        inventory.setCapacity(10);
        inventory.setCurrent(5);

        Assertions.assertEquals(5, inventory.usableCapacity());
    }
}
