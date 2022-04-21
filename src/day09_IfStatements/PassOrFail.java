package day09_IfStatements;

public class PassOrFail {
    public static void main(String[] args) {
        int number1 =100,
                number2=111;
        boolean maxNumber=number1<number2;

        if(maxNumber){
            System.out.println(number2);
        }
        else{
            System.out.println(number1);
        }
    }
}
