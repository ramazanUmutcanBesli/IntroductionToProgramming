package day32_Constructor;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 =new Employee("Aaron");
        Employee employee2 =new Employee("umut",'M');
        Employee employee3 =new Employee("Halil",'M',"Leiter");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
    }

}
