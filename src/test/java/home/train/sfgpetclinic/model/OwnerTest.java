package home.train.sfgpetclinic.model;

import home.train.sfgpetclinic.CustomProvider;
import home.train.sfgpetclinic.ModelTest;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

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
    @ValueSource(strings = {"hello", "world", "junit"})
    void parameterizedMethod(String value) {
        System.out.println(value);
    }

    @DisplayName("Enum Source Type")
    @ParameterizedTest(name = "{displayName} - [{index}] : {arguments}")
    @EnumSource(PersonType.class)
    void EnumTest(PersonType type) {
        System.out.println(type);
    }

    @DisplayName("SCV Source test ")
    @ParameterizedTest(name = "{displayName} - [{index}] : {arguments}")
    @CsvSource({
            "TE,21,98",
            "DC,15,01",
            "PA,14,22"
    })
    void csvTest(String city, int val1, int val2) {
        System.out.println(city + " : " + val1 + " - " + val2);
    }

    @DisplayName("SCV file source test")
    @ParameterizedTest(name = "{displayName} - [{index}] : {arguments}")
    @CsvFileSource(resources = "/index.csv", numLinesToSkip = 1)
    void ScvFileTest(String name, int value1, int value2) {
        System.out.println(name + " ==> " + value1 + " : " + value2);
    }

    @DisplayName("Method provider test")
    @ParameterizedTest(name = "{displayName} - [{index}] : {arguments}")
    @MethodSource("getArgs")
    void fromMethodSource(String name, int value1, int value2) {
        System.out.println(name + " : " + value1 + " : " + value2);
    }

    static Stream<Arguments> getArgs() {
        return Stream.of(
                Arguments.of("name1",22,23),
                Arguments.of("name2",25,7),
                Arguments.of("name3",2,14)
        );
    }

    @DisplayName("Custom provider from class")
    @ParameterizedTest(name = "{displayName} - [{index}] : {arguments}")
    @ArgumentsSource(CustomProvider.class)
    void fromClassCustomerProvider(String name,int v1,int v2){
        System.out.println(name+" : "+v1+" : "+v2);
    }
}