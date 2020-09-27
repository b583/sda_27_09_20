package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionThrownTest {

    @Test
    void myExceptionIsThrown() {

        Assertions.assertThrows(MyException.class, () -> {
            throwException();
//            throw new DummyException();
        });
    }

    private static void throwException() throws MyException {
        throw new MyException();
    }

    private static class MyException extends Exception {}

    private static class DummyException extends Exception {}

}
