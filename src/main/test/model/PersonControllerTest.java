package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class PersonControllerTest {
    private PersonController controller;

    private void setups1(){
        controller =new PersonController();
    }
    @Test
    public void testAddPerson(){
        // init
        setups1();//la lista esta vacia

        //act
        controller.addPerson("name",10,"A0");

        //Assert

        assertFalse(controller.getPeople().isEmpty());
    }
}
