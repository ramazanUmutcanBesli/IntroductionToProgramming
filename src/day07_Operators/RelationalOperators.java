package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // greater than >
        // greater than or equal >=
        // less than <
        // less than or equal <=

        boolean result1=200>40; // true
        System.out.println("result1 = " + result1);
        boolean result2= 300>= 150;
        System.out.println("result2 = " + result2);
        boolean result3= 100>=100;
        System.out.println("result3 = " + result3);

        boolean result4= 300>=500;
        System.out.println("result4 = " + result4);

        // credit score of 720
        int score =745;
        boolean isEligibleForLoan= score>=720;
        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        boolean result5=100<120;
        System.out.println("result5 = " + result5);

        int score1=75;
        boolean hasFailed= score <=59;
        System.out.println("hasFailed = " + hasFailed);
        
        
        boolean result6 = 45<=60;
        System.out.println("result6 = " + result6);


        System.out.println("------------------------");

        //== equal operator
        int x =100;
        int y =200;
        boolean result8 = x==y;
        System.out.println("result8 = " + result8);
        boolean result9 = "umut" == "halil";
        System.out.println("result9 = " + result9);
        boolean result10='A'=='a';
        System.out.println("result10 = " + result10);
        boolean result11 = "JAVA"=="JAVA";
        System.out.println("result11 = " + result11);

        System.out.println("---------------------");

        // Not Equal !=
        boolean result12= 100 !=200;
        System.out.println("result12 = " + result12);
        boolean result13 = 100!= 100;
        System.out.println("result13 = " + result13);

        boolean result14= "Java"!="break";
        System.out.println("result14 = " + result14);
    }
}
