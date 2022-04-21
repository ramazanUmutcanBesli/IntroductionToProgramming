package day11_Switch_Scanner;

public class Quiz {
    public static void main(String[] args) {
       /* boolean A = true, B= !false;
        if(B){
            System.out.println("B");
        }else if(A){
            System.out.println("A");
        }else{
            System.out.println("C");
        }*/

        boolean result =true;
        if(result){
            System.out.println("it is true");
        }else{
            System.out.println("it is false");
        }
        int number= 10;
        if(--number>10){
            System.out.println("Hello cybertek"+number);
        }
        else if(number==9){
            System.out.println(number);
        }
        boolean X = true;
        boolean y= !X==false;
        if(y){
            System.out.println("today");
        }
    }
}
