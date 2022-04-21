package day12_Scanner;
import java.util.Scanner;
//import package.class
public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me number: ");
        byte number = scan.nextByte();
        String result = "";
        if (number >= 1 && number <= 18) {
            switch (number) {
                case 6:
                case 7:
                case 8:
                    result="Middle School";
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    result="High School";
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    result="College";
                    break;
                case 17:
                case 18:
                    result="Grad School";
                    break;
                default:
                    result = "Elementary school";
                    break;
            }
        } else {
            result = "Invalid input";
        }
        System.out.println(result);
        scan.close();
    }
}
