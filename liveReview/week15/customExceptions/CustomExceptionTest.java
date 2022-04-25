package week15.customExceptions;

public class CustomExceptionTest {
    public static void main(String[] args) throws BreakTimeException {

        int minutes = 60;
        System.out.println("Class is going on for "+minutes+" minutes");

            if(minutes>50){

            }
        System.out.println("Lets Continue the class another "+ (minutes-50)+" minutes");

        double balance= 395.5;
        double itemPrice= 500.0;
        System.out.println("I have"+ balance+ "Euros in my Account the item is "+itemPrice);
        if (itemPrice>balance){
            throw new InsufficientBalanceException("Transaction declined to insufficient balance hold");

        }
    }


}
