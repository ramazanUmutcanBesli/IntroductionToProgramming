package week05;

import java.util.Scanner;

public class EmailExampleFromReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a valid email: ramazanumutcanbesli@hotmail.com ");
        String email = scan.next();
        int indexof_=email.indexOf("_");
        int indexofAtSign= email.indexOf("@");
        int indexOfDot=email.indexOf(".");
        String firstName=email.substring(0,indexof_);
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);
        
        String lastName=email.substring(indexof_+1,indexofAtSign);
        //(1)lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();
        //(2)lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();
        lastName=lastName.toUpperCase().charAt(0)+lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);
        String domainName= email.substring(indexofAtSign+1,indexOfDot);
        System.out.println("domainName = " + domainName);

    }
}
