package day44_Abstraction.animalTask;

public final class Eagle extends Animal implements WildAnimal,Flyable{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat() {
        System.out.println(getName()+" is eating snake");
    }
    public void hunt() {
        System.out.println(getName()+" is hunting snake");
    }
    public void fly() {
        System.out.println(getName()+" can fly with 50 km/h");
    }
}
