package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {



    public static void main(String[] args) {
        Employee employee1 =new Employee();
        employee1.setInfo("Umut",1067,'M',"Engıneer",650,false);
        Employee employee2 =new Employee();
        employee2.setInfo("Halil",450,'M',"Leiter",2000,true);
        Employee employee3 =new Employee();
        employee3.setInfo("Metin",1000,'F',"Engineer",0,false);
        Employee employee4 =new Employee();
        employee4.setInfo("Hayrullah",2,'F',"Driver",1000,true);
        Employee employee5 =new Employee();
        employee5.setInfo("Beste",3,'F',"Test Engineer",85,true);
        Employee[] team={employee1,employee2,employee3,employee4,employee5};
        int countOfFullTimeEmployees=0;
        int countOfPartTimeEmployees=0;
        int max=team[0].salary;
        int min=team[0].salary;
        for (Employee employee : team) {
            if (employee.isFullTime==true){
                countOfFullTimeEmployees++;
            }else{
                countOfPartTimeEmployees++;
            }
            if(employee.salary>max){
                max=employee.salary;
            }
            if (employee.salary<min){
                min=employee.salary;
            }
        }
        System.out.println("countOfPartTimeEmployees = " + countOfPartTimeEmployees);
        System.out.println("count Of Full Time Employees = " + countOfFullTimeEmployees);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        employee5.work();


    }
}
