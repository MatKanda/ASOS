package employeeManager.god;

import employee.god.Employee;
import employeeManager.Address;

import java.util.Date;

public class EmployeeManager {

    public static void HireEmployee(Employee employee) {}
    public static void TerminateEmployee(int employeeID) {}
    public static void EditEmployee(Employee employee) {}
    public static void AddVacationTime(int employeeID, Date vacationDate){}
    public static void CancelVacationTime(int employeeID, Date vacationDate) {}
    public static void AddAddress(int employeeID, Address address) {}
    public static void RemoveAddress(int employeeID, int addressID) {}
    public static void GiveBonus(int employeeID, Double bonus) {}
    public static void GiveRaise(int employeeID, Double amount) {}
    public static void DockPay(int employeeID, Double amount) {}
    public static void AddPhoneNumber(int employeeID, String phoneNumber) {}


    /*
    Tu by bolo obrovské množstvo Getrov a Setrov, veľké množstvo kódu na jednom mieste
    */

}
