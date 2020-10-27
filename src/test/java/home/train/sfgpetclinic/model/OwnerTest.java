package home.train.sfgpetclinic.model;

import home.train.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//@Tag("model")
class OwnerTest implements ModelTest {

    @Test
    void dependencyAssertions() {
        Owner owner = new Owner(1l, "John", "Doe");
        owner.setCity("Key West");
        owner.setTelephone("12345 678");

        assertAll("Properties Test",
                () -> assertAll("Person property test",
                        () -> assertEquals("John", owner.getFirstName(), "firstName dose not match"),
                        () -> assertEquals("Doe", owner.getLastName(), "lastName Dose not Match")),
                () -> assertAll("owner Properties Test",
                        () -> assertEquals("Key West", owner.getCity(), "city name dose not match"),
                        () -> assertEquals("12345 678", owner.getTelephone(), "telephone not match"))
        );
    }

    @RepeatedTest(value = 10,name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("repeated test")
    @Test
    void repeatedTest() {
        System.out.println("hello");
    }
}