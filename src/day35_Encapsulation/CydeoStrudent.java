package day35_Encapsulation;

public class CydeoStrudent {
    public String name;
    public char gender;
    public int age;
    public String batchNumber, groupNumber;

    public static String schoolName;
    public static String fieldOfStudy, programmingLanguage;

    public CydeoStrudent(String name, char gender, int age, String batchNumber, String groupNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    static{
        schoolName="Cydeo School";
        fieldOfStudy="QA";
        programmingLanguage="Java and Selenium";
    }
    public static void printSchoolName(){
        System.out.println("School name is"+schoolName);
    }
    public  void secretCode(){
        System.out.println(name+ " Secret code is "+ batchNumber );
    }
    public void attendClass(){
        System.out.println(name+" attending at "+ groupNumber);

    }
    public void study(){
        System.out.println(name+" is studying");
    }

    public String toString() {
        return "CydeoStrudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber='" + batchNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", school='" + schoolName + '\'' +
                ", Programming Language is '" + programmingLanguage + '\'' +
                '}';
    }
}
/*
create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */