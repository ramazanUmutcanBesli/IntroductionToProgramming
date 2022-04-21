package day33_Statics;

public class Student {
    public String name;
    public char gender;
    public int age;
    public int studentId;
    public char grade;
    // 1 st Constructor
    public Student(String name){
        this.name=name;
    }
    // 2 nd Constructor
    public Student(String name, char gender){
        this(name);
        this.gender=gender;

    }
    // 3rd Constructor
    public Student(String name,int studentId){
        this(name);
        this.studentId=studentId;
    }
    // 4th Constructor
    public Student(String name,int studentId,char grade){
        this(name, studentId);
        this.grade=grade;
    }
    // 5th Constructor
    public Student(String name,char gender,int age){
        this(name, gender);
        this.age=age;
    }
    // 6th Constructor
    public Student(String name,char gender,int age,int studentId){
        this(name, gender, age);
        this.studentId=studentId;
    }
    // 7th Constructor
    public Student(String name,char gender,int age,int studentId,char grade){
        this(name, gender, age, studentId);
        this.grade=grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }
}
/*
Warmup tasks:

	Student Task:
		1. Create a class called Student:
				Attributes:
					name, gender, age, studentID, grade

				Add a constructor that allows user to create object by setting the name of student

				Add a constructor that allows user to create object by setting the name and gender of the student

				Add a constructor that allows user to create object by setting the name and studentID of the student

				Add a constructor that allows user to create object by setting the name, studentID and grade of the student

				Add a constructor that allows user to create object by setting the name, gender and age of the student

				Add a constructor that allows user to create object by setting the name, gende, age and studentID of the student

				Add a constructor that allows user to create object by setting the name, gende, age, studentID and grade of the student

				Actions:
					toString()
					study()
 */