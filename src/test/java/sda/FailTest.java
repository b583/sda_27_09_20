package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FailTest {

    @Test
    void failedTest() {
        // something something
        Assertions.fail("failed manually");
    }

}
