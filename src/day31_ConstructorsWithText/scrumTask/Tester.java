package day31_ConstructorsWithText.scrumTask;

public class Tester {
    public String name;
    public int employeeID;
    public String jobTıtle;
    public double salary;

    public Tester(String name, int employeeID, String jobTıtle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTıtle = jobTıtle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTıtle='" + jobTıtle + '\'' +
                ", salary= $" + salary +
                '}';
    }
    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }
}
