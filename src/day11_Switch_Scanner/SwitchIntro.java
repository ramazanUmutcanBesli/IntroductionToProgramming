package day11_Switch_Scanner;

import java.util.Scanner;

public class SwitchIntro {
    /*
    Switch Statement : Switch case default break

    syntax:
    Switch (data){
        case data1:
            Statements;
            break;
        case data2:
            Statements;
            break;
        default:
            Statements;
            break;
            long double float boolean Can not!!!!
            >= <= % / can not allow

     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Give me number: ");
        int number =scan.nextInt();

        /*
        It can not be Used
        long number = 9L;
        float number=9f;
        double number =9D;
        boolean number=true;
        we can only be one default block

         */
        /*
        if (number==1){
            System.out.println("monday");
        }*/
        switch(number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }
}
