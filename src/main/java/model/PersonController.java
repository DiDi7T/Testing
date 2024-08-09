package model;
import java.util.ArrayList;


public class PersonController {
    private ArrayList<Person> people;
    public PersonController(){
        people=new ArrayList<>();
    }
    public void addPerson(String name, int age, String cc){
        Person person =new Person(name,age,cc);
        people.add(person);
    }
    public ArrayList<Person> getPeople(){

        return people;
    }
}
