package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        // username: "cydeo"
        //password: "cydeo123"

        // while(invalid && hasAttempts)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = scan.next();
        System.out.println("Enter your password: ");
        String p = scan.next();
        if ((u.equals("cydeo")) && (p.equals("cydeo123"))) {
            System.out.println("logged in ");
        } else {
            int attempt = 3;
            while (!(u.equals("cydeo")) && (p.equals("cydeo123")) && attempt > 0) {
                if(attempt==1){
                    System.out.println("This is your Last Chance");
                }
                System.out.println("incorrect username or password , please re-enter");
                System.out.println("Enter your username: ");
                u = scan.next();
                System.out.println("Enter your password: ");
                p = scan.next();
                attempt--;
            }
        if((u.equals("cydeo")) && (p.equals("cydeo123"))){
            System.out.println("logged in ");
        }else{
            System.out.println("your account is locked");
        }
        }
    }
}
