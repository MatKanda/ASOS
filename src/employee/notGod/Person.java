package employee.notGod;

import java.util.Date;

public class Person {
    private String FirstName;
    private String LastName;
    private Date BirthDate;

    public Person(String FirstName, String LastName, Date BirthDate){
        setFirstName(FirstName);
        setLastName(LastName);
        setBirthDate(BirthDate);
    }
    public int setBirthDate(Date BirthDate){
        this.BirthDate = BirthDate;
        return 0;
    }
    public int setFirstName(String FirstName){
        this.FirstName = FirstName;
        return 0;
    }
    public int setLastName(String LastName){
        this.LastName = LastName;
        return 0;
    }

    public Date getBirthDate() {
        return this.BirthDate;
    }
    public String getFirstName(){
        return this.FirstName;
    }
    public String getLastName(){
        return this.LastName;
    }
}
