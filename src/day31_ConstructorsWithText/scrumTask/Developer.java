package day31_ConstructorsWithText.scrumTask;

public class Developer {
    public String name;
    public int employeeID;
    public String jobTıtle;
    public double salary;

    public Developer(String name, int employeeID, String jobTıtle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTıtle = jobTıtle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTıtle='" + jobTıtle + '\'' +
                ", salary= $" + salary +
                '}';
    }
    public void coding(){
        System.out.println(name+" is coding");
    }
    public void unitTesting(){
        System.out.println(name+" is unit testing");
    }
    public void fixingBug(){
        System.out.println(name+" is fixing bug");
    }
}
