package employee.notGod;

import java.util.Date;

public class Spouse extends Person{
    private Integer EmployeeID;

    public Spouse(String FirstName, String LastName, Date BirthDate,Integer EmployeeID) {
        super(FirstName, LastName, BirthDate);
        setEmployeeID(EmployeeID);
    }

    public int setEmployeeID(Integer EmployeeID){
        this.EmployeeID = EmployeeID;
        return 0;
    }

    public Integer getEmployeeID(){
        return this.EmployeeID;
    }
}
