package Day10_NestedIf;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Grade : ");
        int grade = scan.nextInt();
        if (grade >= 0 && grade <= 100) { // if the score is valid
            if (grade >= 90 && grade <= 100) {
                System.out.println("EXCELLENT");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("GREAT");
            } else if (grade >= 70 && grade <= 79) {
                System.out.println("GOOD");
            } else if (grade >= 60 && grade <= 69) {
                System.out.println("Passed");
            } else {
                System.out.println("FAILED");
            }
        } else {// if the score is not valied
            System.out.println("invalid grade given...");
        }

        System.out.println("------------------");
        String name=(grade>=0&&grade<=100)?  (grade>=90)? "Excellent" :(grade>=80)?"Good"
                :"Failed":"Invalid Score";
        System.out.println(name);
    }
}
