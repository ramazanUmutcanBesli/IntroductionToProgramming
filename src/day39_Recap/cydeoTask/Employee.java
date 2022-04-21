package day39_Recap.cydeoTask;

public class Employee extends Person{
    private int employeeID;
    private String jobTitle;
    private double salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmployeeID(int employeeID) {
        if(employeeID<=0){
            System.err.println("employee ID is invalid :" + employeeID);
            System.exit(3);
        }
        this.employeeID=employeeID;
    }

    public void setJobTitle(String jobTitle) {
        if(jobTitle.isBlank()||jobTitle.isEmpty()){
            System.err.println("employee title is invalid : " + jobTitle);
            System.exit(4);
        }
        this.jobTitle=jobTitle;
    }

    public void setSalary(double salary) {
        if (salary<=0){
            System.err.println("employee salary is invalid" + salary);
            System.exit(5);
        }
        this.salary=salary;
    }

    public Employee(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public String work(){
        return "";
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
