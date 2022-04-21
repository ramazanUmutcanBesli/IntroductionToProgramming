package day30_CustomClass;
/*
    Attributes:
        name , gender, age, ID, grade(Char)

    Actions:

     */

public class Student {
    public String name;// setInfo methodunun içindede aynı ismi kullandım ilk name instance variabledır
    public char gender;// 2. name ise local variabledır birbirlerinden farklıdır
    public int age;
    public int ID;
    public char grade;
    // 1st way to generate SetInfo method with writing
    /*public void setInfo(String name, char gender, int age, int ID , char grade){
        this.name=name; // this. keyword used for calling ınstance variable
        this.gender=gender;
        this.age=age;
        this.ID=ID;
        this.grade=grade;
    }*/
    // 2nd way to generate setInfo method : rıght clıck choose generate and then constructor
    // 2. yolu seçtikten sonra method ismini ve return type void yapmayı UNUTMAAAA

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code() {
        System.out.println(name + " is coding ");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
