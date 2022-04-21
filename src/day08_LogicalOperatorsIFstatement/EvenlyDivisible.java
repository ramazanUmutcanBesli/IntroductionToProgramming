package day08_LogicalOperatorsIFstatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number = 100;
        boolean isDivisibleBy2 = number % 2 == 0;
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        System.out.println(number + " is divisible by 2: " + isDivisibleBy2);
        System.out.println(number + " is divisible by 3: " + isDivisibleBy3);
        System.out.println(number + " is divisible by 5: " + isDivisibleBy5);

        System.out.println("\n-----------------------");
        int year =2000;
        boolean isLeapYear= number%4==0;
        System.out.println(year+" is leap year: "+ isLeapYear);

    }
}
