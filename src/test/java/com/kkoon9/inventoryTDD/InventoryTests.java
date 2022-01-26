package com.kkoon9.inventoryTDD;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class InventoryTests {

    @Test
    void testInventory_size_test() {
        Inventory inventory = new Inventory();

        inventory.setLength(new BigDecimal(10));
        inventory.setWidth(new BigDecimal(10));
        inventory.setHeight(new BigDecimal(10));

        Assertions.assertThat(new BigDecimal(10)).isEqualTo(inventory.getLength());
        Assertions.assertThat(new BigDecimal(10)).isEqualTo(inventory.getWidth());
        Assertions.assertThat(new BigDecimal(10)).isEqualTo(inventory.getHeight());
    }

    @Test
    void testInventory_type_test() {
        Inventory inventory = new Inventory();

        inventory.setType(EnumType.Temperature.AMBIENT);

        Assertions.assertThat(EnumType.Temperature.AMBIENT).isEqualTo(inventory.getType());
    }

    @Test
    void testInventory_capacity_test() {
        Inventory inventory = new Inventory();

        inventory.setCapacity(10);

        Assertions.assertThat(10).isEqualTo(inventory.getCapacity());
    }

    @Test
    void testInventory_current_count_test() {
        Inventory inventory = new Inventory();

        inventory.setCurrent(10);

        Assertions.assertThat(10).isEqualTo(inventory.getCurrent());
    }

    @Test
    void testInventory_unable_current_count_test() {
        Inventory inventory = new Inventory();
        inventory.setCapacity(5);
        inventory.setCurrent(10);

        Assertions.assertThat(false).isEqualTo(inventory.isAbleCurrentCount());
    }

    @Test
    void testInventory_usable_capacity_test() {
        Inventory inventory = new Inventory();
        inventory.setCapacity(10);
        inventory.setCurrent(5);

        Assertions.assertThat(5).isEqualTo(inventory.usableCapacity());
    }
}
