package home.train.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("repeated")
public interface repeatedTest {
    @BeforeEach
    default void beforeEachMethod(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println(testInfo.getTags().toString()+" - "+
                 repetitionInfo.getCurrentRepetition()+" : "+repetitionInfo.getTotalRepetitions());
    }
}
