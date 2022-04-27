package day43_Abstraction.employee;

public class Developer extends employee{
    public Developer(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is developing application");
    }
    public void sleep(){
        System.out.println(getName()+"sleeps 6 hours");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" eat banana like tester");
    }
}
