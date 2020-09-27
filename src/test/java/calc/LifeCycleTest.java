package calc;

import org.junit.jupiter.api.*;

class LifeCycleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("This is called ONCE before all tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("This is called before EACH test");
    }

    @Test
    void test1() {
        System.out.println("1");
    }

    @Test
    void test2() {
        System.out.println("2");
    }

    @Test
    void test3() {
        System.out.println("3");
    }

    @AfterEach
    void afterEach() {
        System.out.println("This is called after EACH test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("This is called ONCE after all tests");
    }

}
