package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Enter your gender: ");
        String gender = scan.next();

        scan.nextLine();// you must to use that between int and string scanner
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your phone number: ");
        long phone = scan.nextLong();

        System.out.println("Enter your zip code: ");
        int zipCode = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your school Name");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name: ");
        String city = scan.nextLine();

        System.out.println("enter your state name");
        String state= scan.next();
        System.out.println("Enter your building number: ");
        int buildingNum= scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your Street name: ");
        String street = scan.nextLine();
        scan.close();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phone = " + phone);
        System.out.println("Address: \n\t"+buildingNum+" "+street+"\n\t"+city
        +", "+state+" "+zipCode);
        System.out.println("schoolName = " + schoolName);

    }

}
