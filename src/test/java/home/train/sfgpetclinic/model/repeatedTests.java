package home.train.sfgpetclinic.model;

import home.train.sfgpetclinic.repeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class repeatedTests implements repeatedTest {

    @RepeatedTest(value = 10,name = "{displayName} : {currentRepetition} - {totalRepetitions}")
    @DisplayName("repeated test")
    void repeatedTest() {
        System.out.println("hello");
    }

    @RepeatedTest(5)
    @DisplayName("junit dependency injection")
    void repeatedTestWithParameter(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println(testInfo.getDisplayName()+" : "+repetitionInfo.getCurrentRepetition());
    }
}
