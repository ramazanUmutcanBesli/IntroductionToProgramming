package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch = 'B';
        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
