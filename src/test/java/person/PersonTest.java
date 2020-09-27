package person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonTest {

    final String fullName = new Person("Jan", "Kowalski").getFullName();

    @Test
    @DisplayName("Full name should be name + space + last name")
    void checkFullNameTest() {
        // arrange
        final var jan = new Person("Jan", "Kowalski");
        // act
        final var fullName = jan.getFullName();
        Assertions.assertAll(
                () -> Assertions.assertTrue(fullName.startsWith("Jan"),
                        "Jan should be at start of full name"),
                () -> Assertions.assertTrue(fullName.contains(" "),
                        "Whitespace should be in the middle of name and last name"),
                () -> Assertions.assertTrue(fullName.endsWith("Kowalski"),
                        "Kowalski should be at the end of full name"));
    }

    @Test
    void checkFirstName() {
        Assertions.assertTrue(fullName.startsWith("Jan"));
    }

    @Test
    void checkSpace() {
        Assertions.assertTrue(fullName.contains(" "));
    }

    @Test
    void checkLastName() {
        Assertions.assertTrue(fullName.endsWith("Kowalski"));
    }

}
