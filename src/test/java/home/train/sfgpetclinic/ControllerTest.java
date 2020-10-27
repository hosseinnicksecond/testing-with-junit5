package home.train.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("controller")
public interface ControllerTest {

    @BeforeAll
    default void beforeAllMethod(){
        System.out.println("can be here something useful");
    }
}
