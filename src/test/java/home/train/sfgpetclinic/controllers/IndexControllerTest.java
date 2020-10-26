package home.train.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}