package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonControllerTest {
    private PersonController controller;

    private void setups1(){
        controller =new PersonController();
    }
    private void setups2(){
        controller=new PersonController();
        controller.addPerson("name",14,"33",68.5);
    }
    @Test
    public void testAddPerson(){
        // init
        setups1();//la lista esta vacia

        //act
        controller.addPerson("name",10,"A0", 12.4);

        //Assert

        //assertFalse(controller.getPeople().isEmpty());
        assertTrue(!controller.getPeople().isEmpty());
    }
    @Test
    public void testAddPerson2(){
        //init
        setups1();//la lista esta vacia

        //act
        String name="NameA";
        int age=10;
        String cc="A0";
        double weight=60.7;
        controller.addPerson(name,age,cc,weight);

        //Assert

        assertEquals(name,controller.getPeople().get(0).getName());
        assertEquals(age,controller.getPeople().get(0).getAge());
        assertEquals(cc,controller.getPeople().get(0).getCc());
        assertEquals(weight,controller.getPeople().get(0).getWeight(),0.3);
       // assertEquals(weight,60.5,0.3);
    }
}
