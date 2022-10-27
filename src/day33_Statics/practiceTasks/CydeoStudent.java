package day33_Statics.practiceTasks;

public class CydeoStudent {
/*
*
* 1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */
    public String name;
    public int age;
    public String gender;
    public int id;
    public double grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName="CYDEO";
    public static String programmingLanguage="JAVA";

    public CydeoStudent(String name){
        this.name=name;
    }
    public CydeoStudent(String name,int age){
        this(name);
        this.age=age;
    }
    public CydeoStudent(String name,int age,String gender){
        this(name,age);
        this.gender=gender;
    }
    public CydeoStudent(String name, int age,String gender,int id){

        this(name,age,gender);
        this.id=id;
    }
    public CydeoStudent(String name,int age,String gender,int id, double grade){
        this(name,age,gender,id);
        this.grade=grade;
    }
    public CydeoStudent(String name, int age, String gender,int id,double grade,int batchNumber){
        this(name,age,gender,id,grade);
        this.batchNumber=batchNumber;
    }

    public CydeoStudent(String name,int age,String gender,int id,double grade,int batchNumber,int groupNumber){
        this(name,age,gender,id,grade,batchNumber);
        this.groupNumber=groupNumber;
    }
    //                  study()
    //					attendClass()
    //					printSchoolName(): displays the school name
    //					printProgLanguage(): displays the name of programming language
    //					toString()
    public void study(){
        System.out.println(name+" is studying now\n"+name+"("+gender.substring(0,1)+") is in "+batchNumber);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
