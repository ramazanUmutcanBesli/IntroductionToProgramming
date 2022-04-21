package week02;

import java.util.Scanner;

public class LearningScannerClass {
    public static void main(String[] args) {
        String name;
        // output goes to console --- print or println
        System.out.println("Output");

        // how can i receive input for my JAVA class
        //1. create your scanner object (object name can be anything)
        Scanner scan = new Scanner(System.in);

        // 2. prompt the user for putting input
        System.out.print("put your name: "); // this is printed out to console

        // 3. Get the input
        name=scan.next();// reads to data from console next() for String datatype
        // 4. use the value that i read

        System.out.println("name = " + name);

        // Step 1 and 3 are must but step 2 and 4 depends on the situations
        // we need to import scanner class from JAVA utilities import java.util.Scanner;
        // you put the Statement at the top of page before the class
        System.out.print("give me number: ");
        double number= scan.nextDouble();


        double number2= number*number;
        System.out.println(number2);

    }
}
