package day24_CustomMethod_Return;

public class ReturnStatements2 {
    public static void main(String[] args) {
        nameOfMonth(22);
    }
    public static void nameOfMonth(int number) {
        if(number<1 || number>12){
            System.out.println("Invalid");
            return; // exits nameOfMEthod method, remaining code fragments of the method never gets executed
        }

        String name = (number == 1) ? "January" :
                    (number == 2) ? "Feb" : (number == 3) ? "March" :
                    (number == 4) ? "April" : (number == 5) ? "may" :
                    (number == 6) ? "June" : (number == 7) ? "Juli" :
                            (number == 8) ? "August" : (number == 9) ? "September" :
                                    (number == 10) ? "October" :
                            (number == 11) ? "November" : "December";

        System.out.println("Month name = " + name);
    }
}
