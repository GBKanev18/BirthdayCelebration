package OtherClasses;

import Interfaces.Birthable;
import Interfaces.Identifiable;

public class Citizen implements Identifiable {

    private String name;
    private int age;
    private String id;
    private String birthdate;

    public Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getBirthdate(){
        return birthdate;
    }
}
