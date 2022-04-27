package day43_Abstraction.employee;

public abstract class employee extends Person {
    private final int id;
    private String jobTitle;
    private double salary;

    public employee(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender);
        if (id<=0){
            throw new RuntimeException("Invalid ID: "+id);
        }
        this.id=id;
        setJobTitle(jobTitle);
        setSalary(salary);
    }
    public int getId() {
        return id;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public abstract void work();
    public String toString() {
        return "employee{" +
                "name =" + getName() +
                "age =" + getAge() +
                "gender =" + getGender() +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
