package day34_GarbageCollection_AccessModifiers;

public class CydeoStudent {
    public String studentName;
    public static String schoolName;
    public CydeoStudent(String studentName){
        this.studentName=studentName;
    }
    static {
        schoolName="Cydeo School";
    }


    public String toString() {
        return "CydeoStudent{" +
                "studentName='" + studentName + '\'' +
                "Name of School='" + schoolName + '\'' +
                '}';
    }
}
class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent std1 =new CydeoStudent("umut");
        CydeoStudent std2 = new CydeoStudent("Halil");
        System.out.println(std1);
        System.out.println(std2);

    }
}