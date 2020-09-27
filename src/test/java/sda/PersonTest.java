package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void checkFullNameTest() {
        // arrange
        final var jan = new Person("Jan", "Kowalski");
        // act
        final var fullName = jan.getFullName();
        Assertions.assertAll(
                () -> Assertions.assertTrue(fullName.startsWith("Jan")),
                () -> Assertions.assertTrue(fullName.contains(" ")),
                () -> Assertions.assertTrue(fullName.endsWith("Kowalski")));
    }

    private static class Person {
        private String name, lastName;

        private Person(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        private String getFullName() {
            return name + " " + lastName;
        }
    }

}
