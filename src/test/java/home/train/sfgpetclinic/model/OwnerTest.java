package home.train.sfgpetclinic.model;

import home.train.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @DisplayName("Value Source Test - ")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @ValueSource(strings = {"hello","world","junit"})
    void parameterizedMethod(String value){
        System.out.println(value);
    }

    @DisplayName("Enum Source Type")
    @ParameterizedTest(name = "{displayName} - [{index}] : {arguments}")
    @EnumSource(PersonType.class)
    void EnumTest(PersonType type){
        System.out.println(type);
    }

    @DisplayName("SCV Source test ")
    @ParameterizedTest(name="{displayName} - [{index}] : {arguments}")
    @CsvSource({
            "TE,21,98",
            "DC,15,01",
            "PA,14,22"
    })
    void csvTest(String city,int val1,int val2){
        System.out.println(city+" : "+ val1+" - "+val2);
    }
    @DisplayName("SCV file source test")
    @ParameterizedTest(name = "{displayName} - [{index}] : {arguments}")
    @CsvFileSource(resources = "/index.csv",numLinesToSkip = 1)
    void ScvFileTest(String name,int value1,int value2){
        System.out.println(name+" ==> "+value1+" : "+value2);
    }
}