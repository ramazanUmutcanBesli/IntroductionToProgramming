package day23_CustomMethodIntro;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(10);
        ageOfPerson(1996);
        printNumbers(5,1);
    }

    // create a function that can check if a number is odd number or even number
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    // create a function that can display the age of the person
    public static void ageOfPerson(int birthYear) {
        int age = 2022 - birthYear;
        System.out.println("your age is:" + age);
    }

    // create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y) {
        if(x>=y){
            for (int i = y; i <= x; i++) {
                System.out.print(i+" ");
            }
        }else{
            for (int i = x; i <=y ; i++) {
                System.out.print(i+" ");
            }
        }
    }
}
