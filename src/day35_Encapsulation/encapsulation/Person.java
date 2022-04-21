package day35_Encapsulation.encapsulation;

public class Person {
    private String name;
    private int age;
    // getter method for name
    public String getName(){
        return name;
    }
    // setter method for name
    public void setName(String name){
        this.name=name;
    }
    // getter method for age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age <= 0 || age > 150){
            System.err.println("Invalid Age: "+age);
            System.exit(0);
        }
        this.age=age;
    }

}
