package home.train.sfgpetclinic.controllers;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@Tag("controller")
class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller= new IndexController();
    }

    @Test
    void index() {

        assertEquals("index",controller.index(),"if fail this message appear");
        //this from assertj
        assertThat(controller.index()).isEqualTo("index");
    }

    @Test
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class,()->controller.oupsHandler());
//        assertTrue("notimplementedy".equals(controller.oupsHandler()),()->"make some message ");
    }
    @Disabled("just demo")
    @DisplayName("test functionality for assertTimeout")
    @Test
    void testTimeOut() {
        assertTimeout(Duration.ofMillis(100),()->{
            Thread.sleep(2000);
            System.out.println("this from Timeout last command");
        });
    }

    @Disabled("just demo")
    @DisplayName("test functionality TimeoutPreemptively")
    @Test
    void testTimeoutPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(100),()->{
            Thread.sleep(2000);
            System.out.println("this from TimeoutPreemptively");
        });
    }
    @Disabled("just for test")
    @Test
    void assumptionTest() {
        assumeTrue("JOHN".equalsIgnoreCase(System.getenv("JOHN")));
    }

    @Test
    void assumptionTest2() {
        assumeTrue("John".equalsIgnoreCase("john"));
    }

    @EnabledOnOs(OS.LINUX)
    @Test
    void RunOnOS() {
    }
    @EnabledOnOs(OS.WINDOWS)
    @Test
    void justRunOnWindows() {
    }
    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void runOnJava8() {
    }
    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void runOnJava11() {
    }
    @EnabledIfEnvironmentVariable(named = "USER",matches = "hossein")
    @Test
    void RunWithUserHossein() {
    }

}