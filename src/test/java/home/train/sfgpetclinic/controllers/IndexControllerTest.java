package home.train.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller= new IndexController();
    }

    @Test
    void index() {

        assertEquals("index",controller.index(),"if fail this message appear");
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

    @Test
    void assumptionTest() {
        assumeTrue("JOHN".equalsIgnoreCase(System.getenv("JOHN")));
    }

    @Test
    void assumptionTest2() {
        assumeTrue("John".equalsIgnoreCase("john"));
    }
}