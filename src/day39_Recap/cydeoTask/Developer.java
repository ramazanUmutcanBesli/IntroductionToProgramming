package day39_Recap.cydeoTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }
    public String work(){
        return getName()+" is developing.";
    }
    public String fixingBugs(){
        return getName()+" fix all of bugs";
    }


}
