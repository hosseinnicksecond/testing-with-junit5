package home.train.sfgpetclinic.model;

import home.train.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@Tag("model")
class PersonTest implements ModelTest {

    String displayName;

    @Test
    void testEqualProperty() {
        Person person = new Person(1l, "John", "Doe");
        assertAll("test property",
                () -> assertEquals("John", person.getFirstName()),
                () -> assertEquals("Doe", person.getLastName()));
    }

    @Test
    void testSensitiveStringProperty() {
        Person person = new Person(1l, "John", "Doe");
        assertAll("test sensitive String property",
                () -> assertEquals("John", person.getFirstName(), "Failed cause Sensitive"),
                () -> assertEquals("doe", person.getLastName(), "failed cause sensitive"));
    }

}