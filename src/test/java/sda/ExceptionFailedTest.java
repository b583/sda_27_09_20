package sda;

import org.junit.jupiter.api.Test;

class ExceptionFailedTest {

    @Test
    void failExTest() throws Exception {
        throw new Exception();
    }

}
