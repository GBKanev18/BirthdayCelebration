package OtherClasses;

import Interfaces.Birthable;

public class Pet implements Birthable {

    private String name;
    private String birthDate;

    public String getName(){
        return name;
    }

    public String getBirthDate(){
        return birthDate;
    }

}
