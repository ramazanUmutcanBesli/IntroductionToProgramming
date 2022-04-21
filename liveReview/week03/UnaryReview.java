package week03;

public class UnaryReview {
    public static void main(String[] args) {

        int a=20;
        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);
        int b =20;
        System.out.println("++b = " + ++b);
        int c =20;
        System.out.println(++c +1);
        boolean isMarried = true;
        System.out.println("isMarried = " + !isMarried);
        int x =12;
        if(++x>12){ // pre increment
            System.out.println("x in the if part:  "+x);
        }
        else{
            System.out.println("x value in the ELSE statement: "+ x);
        }
        int y =12;

        if(y++>12){
            System.out.println("y in the if part:  "+y);
        }
        else{
            System.out.println("y value in the ELSE statement: "+ y);
        }

        //difference between "=" assign a value "==" checks if the statements are equal
        // "+=" : a+=20; -----> a=a+20; Shorthand operators
    }
}
