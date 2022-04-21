package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = -25;
        System.out.println(num1 < 0);//false
        System.out.println(num2 < 0);//true
        // ++ increment operator
        //-- decrement operator
        int y = 5;
        ++y;// pre increment : increases the value by 1 right away
        int x = y;
        System.out.println(x);
        --y; //pre decrement: decreases the value by 1 right away
        System.out.println(y);
        /*
        this increment and decrement operators
        before the operators it is increase immediately
        if we add after operators it is increase after process

         */
        // Post Increment and Decrement
        int a = 25;
        System.out.println(a++);// first passes the current value then increases the value by 1
        System.out.println(a);//26
        System.out.println(a--);// first passes the current value then decreases the value by 1
        System.out.println(a);// 25
        System.out.println("-----------------------");
        int w = 100;
        System.out.println(--w);// pre decrement decreases the value by 1 right away
        int z = 100;
        System.out.println(z--);// post decrement first passes the current value then decreases the value by 1
        System.out.println(z);
        System.out.println(++z);


        System.out.println("-------------------");

        int h = 45;
        System.out.println(++h);//pre increment 46
        System.out.println(h++);// post increment 46
        System.out.println(h); // 47

        int q = 30;
        System.out.println(--q); // 29 q =29
        System.out.println(q--); // 29 q=28
        System.out.println(q); // q=28

    }
}
