package day24_CustomMethod_Return;

public class ReturnStatement {

    public static void main(String[] args) {

        nameOfDay(5);
    }

    public static void nameOfDay(int number) {// for void method return method only exit the method
        if(number<1 || number>7){ // if the number is invalid
            System.out.println("Invalid");
            return; //exits nameOfDay method
            //break we can not use break method only for switch and loop statement
        }

        if (number==1){
            System.out.println("Monday");
        }else if(number==2){
            System.out.println("Tuesday");
        }else if(number==3){
            System.out.println("Wednesday");
        }else if (number==4){
            System.out.println("Thursday");
        }else if (number==5){
            System.out.println("Friday");
        }else if(number==6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }
    }
}
