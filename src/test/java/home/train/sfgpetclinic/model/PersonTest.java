package home.train.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

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
                () -> assertEquals("john", person.getFirstName(), "Failed cause Sensitive"),
                () -> assertEquals("doe", person.getLastName(), "failed cause sensitive"));
    }
}