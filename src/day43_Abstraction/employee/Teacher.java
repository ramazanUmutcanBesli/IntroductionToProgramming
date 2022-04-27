package day43_Abstraction.employee;

public class Teacher extends employee {
    public Teacher(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }
    public void work(){
        System.out.println(getName()+" is teaching");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating strawberry");
    }
    public void sleep(){
        System.out.println(getName()+" is sleeping now");
    }
}
