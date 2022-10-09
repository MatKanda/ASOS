import employee.notGod.Child;
import employee.notGod.Employee;
import employee.notGod.Spouse;

import java.util.Date;

public class Main {
    public static void main(String[] args){

        Employee employee = new Employee("Matúš", "Kanda", new Date(), 1);
        Spouse spouse = new Spouse("Samuelka", "Balaščíková", new Date(), 1);
        // easy to add another chid and connect it via employee ID
        Child child1 = new Child("Bože", "Decko", new Date(), 1);
        Child child2 = new Child("Bože", "DalšieDecko", new Date(), 1);
    }
}
