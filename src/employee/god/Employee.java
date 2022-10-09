package employee.god;

import java.util.Date;

public class Employee {

    private Integer ID;
    private Date BirthDate ;
    private String FirstName;
    private String LastName;
    private String SpouseFirstName;
    private String SpouseLastName;
    private String ChildOneFirstName;
    private String ChildOneLastName ;

    /*  Every child is a new variable, not good
    ...
    public String ChildXXXFirstName;
    public String ChildXXXLastName;
    public String ChildYYYFirstName;
    public String ChildYYYLastName;
    ...
    */

    public int setID(Integer ID){
        this.ID = ID;
        return 0;
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
    public int setSpouseFirstName(String SpouseFirstName){
        this.SpouseFirstName = SpouseFirstName;
        return 0;
    }
    public int setSpouseLastName(String SpouseLastName){
        this.SpouseLastName = SpouseLastName;
        return 0;
    }
    public int setChildOneFirstName(String ChildOneFirstName){
        this.ChildOneFirstName = ChildOneFirstName;
        return 0;
    }
    public int setChildOneLastName(String ChildOneLastName){
        this.ChildOneLastName = ChildOneLastName;
        return 0;
    }

    public Integer getID(){
        return this.ID;
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
    public String getSpouseFirstName(){
        return this.SpouseFirstName;
    }
    public String getSpouseLastName(){
        return this.SpouseLastName;
    }
    public String getChildOneFirstName(){
        return this.ChildOneFirstName;
    }
    public String getChildOneLastName(){
        return this.ChildOneLastName;
    }
}
