package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        //assignment: "=" it means assignment in JAVA
        int number = 100;
        System.out.println("number = " + number);//100
        number = 200;
        System.out.println("number = " + number);//200

        String word = "Java Programming";
        System.out.println("word = " + word);// java programming
        word = "wooden spoon";
        System.out.println("word = " + word);// wooden spoon
        // any data we can use re initialize
        word = "CYDEO";

        System.out.println("word = " + word);
        System.out.println("---------------");

        // Addition Assignment Operator
        // x+=y is equal to x=x+y
        int x = 100;
        System.out.println("x = " + x);
        x += 100;
        System.out.println("x = " + x);

        String str = "wooden";
        str += "spoon";
        System.out.println("str = " + str);


        double num = 2.5;
        System.out.println("num = " + num);
        num += 5.5;
        System.out.println("num = " + num);

        double availableBalance = 1000.5;

        // deposit 300$
        double deposit = 300;
        availableBalance += deposit;
        System.out.println("availableBalance = " + availableBalance);

        // withdrawing 500$
        // substraction assignment it is not accepting for string
        // we can not using for string datatype
        availableBalance -= 500;
        System.out.println("availableBalance with withdrawing = " + availableBalance);

        // withdrawing 200$, then depositing 400$
        availableBalance -= 200;// available balance 600.5
        availableBalance += 400; // available balance 1000.5
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("----------------------------------");
        // Multiplication Assignment
        double salary = 50000.5;
        System.out.println("salary = " + salary);
        salary *= 2; // salary = salary*2;
        System.out.println("salary = " + salary);

        double dodge = 0.00000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);

        System.out.println("-----------------------------");
        // Division Assignment
        double numb=25000;
        numb/=2;
        System.out.println(numb);
        // Remainder Assigment
        System.out.println("--------------------------");
        double numbe=100;
        //%=
        numbe%=3;
        System.out.println("numbe = " + numbe);
        System.out.println("---------------------------");

        int amount = 127; // cents
        int quarters= amount/25;
        int cents = amount %25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("-------------------");
         int cents2 =127;
         cents2%=25;
        System.out.println("cents2 = " + cents2);
        System.out.println("--------------------");
        int v =300;
        v %= 16;
        System.out.println("v = " + v);

        int balance =3500;

        // insurance fee: $153
        balance%=153;


        System.out.println("balance = " + balance);
    }
}
