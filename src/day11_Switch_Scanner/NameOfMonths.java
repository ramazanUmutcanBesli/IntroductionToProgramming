package day11_Switch_Scanner;

import java.util.Scanner;

public class NameOfMonths {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Give me number: ");
        int number=scan.nextInt();
        switch(number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("oktober");
                break;
            case 11:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
