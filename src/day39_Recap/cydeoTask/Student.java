package day39_Recap.cydeoTask;

public class Student extends Person {
    private int studentID;
    private String fieldOfStudy;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        if (studentID<=0){
            System.err.println("invalid student ID " + studentID);
            System.exit(5);
        }

        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isEmpty()|| fieldOfStudy.isBlank()){
            System.err.println("invalid field of study " + fieldOfStudy);
            System.exit(6);
        }
        this.fieldOfStudy = fieldOfStudy;

    }

    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);

    }
    public String study(){
        return getName()+" is learning";
    }
}
