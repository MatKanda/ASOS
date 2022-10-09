package employee.notGod;

import java.util.Date;

public class Employee extends Person{
    private Integer ID;

    public Employee(String FirstName, String LastName, Date BirthDate, Integer ID) {
        super(FirstName, LastName, BirthDate);
        setID(ID);
    }

    public int setID(Integer ID){
        this.ID = ID;
        return 0;
    }

    public Integer getID(){
        return this.ID;
    }
}
