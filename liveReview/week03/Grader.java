package week03;

import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        // for a given grade assign letter Grades : 100-90 (inclusive): A
        // 89-80 :B
        // 79-70 : C
        // 69-60: D
        // below is F

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your grade");
        int grade = scan.nextInt();
        char gradeLetter;
        if (grade <= 100 && grade >= 0) {
            System.out.println("Grade is Valid");
            if (grade <= 100 && grade >= 90) {
                gradeLetter = 'A';

            } else if (grade <= 89 && grade >= 80) {
                gradeLetter = 'B';

            } else if (grade <= 79 && grade >= 70) {
                gradeLetter = 'C';

            } else if (grade <= 69 && grade >= 60) {
                gradeLetter = 'A';

            } else {
                gradeLetter = 'F';
            }
            System.out.println("gradeLetter = " + gradeLetter);
        } else {
            System.out.println("given number is invalid");
        }


    }
}
