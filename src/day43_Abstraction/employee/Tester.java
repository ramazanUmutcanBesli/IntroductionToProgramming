package day43_Abstraction.employee;

public class Tester extends employee{
    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName()+" is testing the application");
    }
    public void sleep(){
        System.out.println(getName()+" sleeps 8 hours");
    }
    public void eat(){
        System.out.println(getName()+" eat banana for energy");
    }
    public void bugReport(){
        System.out.println(getName()+ " is creating bug reports");
    }

}
