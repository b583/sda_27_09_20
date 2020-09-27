package person;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

class PersonAssertJTest {

    @Test
    void personTest() {
        // arrange
        final var jan = new Person("Jan", "Kowalski");
        // act
        final var fullName = jan.getFullName();

        // assert
        final var softAssert = new SoftAssertions();
        softAssert.assertThat(fullName)
                .as("Full name should be name + space + last name")
                .startsWith("Jan")
                .contains(" ")
                .endsWith("Kowalski");
        softAssert.assertAll(); // THIS MUST BE HERE
    }

}
