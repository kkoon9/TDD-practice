package com.kkoon9.inventoryTDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    public int fibonacci(int num) {
        if (num <= 1) {
            return num;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    @Test
    void testFibonacci_0() {
        int num = 0;
        int result = fibonacci(num);

        // 0 -> 0
        Assertions.assertEquals(0, result);
    }

    @Test
    void testFibonacci_1() {
        int num = 1;
        int result = fibonacci(num);

        // 1 -> 1
        Assertions.assertEquals(1, result);
    }

    @Test
    void testFibonacci_2() {
        int num = 2;
        int result = fibonacci(num);

        // 2 -> 1
        Assertions.assertEquals(1, result);
    }
    @Test
    void testFibonacci_3() {
        int num = 3;
        int result = fibonacci(num);

        // 3 -> 2
        Assertions.assertEquals(2, result);
    }

}
