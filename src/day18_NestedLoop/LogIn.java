package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u = scan.next();
        System.out.println("Enter your password: ");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Woodenspoon")) {
            System.out.println("Logged in");

        } else {
            System.err.println("Incorrect username or password");
            for (int i = 0; i < 4; i++) {
                System.out.println("Enter your username: ");
                u = scan.next();
                System.out.println("Enter your password: ");
                p = scan.next();
                if (u.equals("Cydeo") && p.equals("Woodenspoon")) {
                    System.out.println("Logged in");
                    break;
                }else{
                    System.err.println("Incorrect username or password");
                }
            }
        }
    }
}
