package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumTest {

    @Test
    void sumTest() {
        Assertions.assertEquals(5, SumTest.sum(2, 3));
    }

    static int sum(int a, int b) {
        return a + b;
    }

}
