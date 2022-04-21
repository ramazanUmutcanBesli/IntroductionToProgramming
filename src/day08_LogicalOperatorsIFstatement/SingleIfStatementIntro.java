package day08_LogicalOperatorsIFstatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int number = 301;
        boolean evenNumber = number % 2 == 0;

        if (evenNumber) {

            System.out.println(number + " Even Number");
        }

        if (!evenNumber) {

            System.out.println(number + " is Odd Number");

        }
    }
}
