package day44_Abstraction.animalTask;

public final class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void eat() {
        System.out.println(getName()+" is eating biryani ");
    }
    public void Meow(){
        System.out.println(getName()+" is meowing");
    }
    public void play(){
        System.out.println(getName()+" ");
    }
}
