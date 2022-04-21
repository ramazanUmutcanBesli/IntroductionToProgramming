package day09_IfStatements;
import java.util.Scanner;
public class NameOfDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me number between 1 to 7 : ");
        int n = scan.nextInt();
        String day;
        if (n == 1) {
            day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
        } else if (n == 4) {
            day = "Thursday";
        } else if (n == 5) {
            day = "Friday";
        } else if (n == 6) {
            day = "Saturday";
        } else if (n == 7) {
            day = "Sunday";
        } else {
            day = "Invalid number";
        }
        System.out.println("day = " + day);
    }
}
