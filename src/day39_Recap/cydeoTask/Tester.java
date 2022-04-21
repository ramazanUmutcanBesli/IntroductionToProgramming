package day39_Recap.cydeoTask;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public String work() {
        return getName()+" is testing";
    }

    public String createTicket(){
        return getName()+" create a ticket";
    }
}
