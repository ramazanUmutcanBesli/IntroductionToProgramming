package day39_Recap.cydeoTask;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public String work() {
        return getName()+" is studying";
    }
}
