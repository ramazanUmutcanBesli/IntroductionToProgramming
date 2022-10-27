package day52_Map_FunctionalInterface;
// lambda= ()->{}
public class Test {
    public static void main(String[] args) {
        //Function: create a function that can display a number is odd
        MyFirstFunctionalInterface oddOrEvenNumber=(n)->{
            if (n%2==0){
                System.out.println(n+" is a even number");
            }else{
                System.out.println(n+" is odd number");
            }
        };
        oddOrEvenNumber.apply(20);


        // Function: create a function that can check if a person is eligible to buy
        // alcohol
        MyFirstFunctionalInterface eligibleToBuyAlcohol;
        eligibleToBuyAlcohol=(age)->{
            if (age>=18){
                System.out.println("Eligible to buy Alcohol");
            }else{
                System.out.println("Not eligible to buy Alcohol");
            }
        };
        eligibleToBuyAlcohol.apply(11);

        // Function: create a function that can display the cube of a number
        MyFirstFunctionalInterface printCube;
        printCube=(n)->{
            System.out.println(n*n*n);
        };
        printCube.apply(3);

        //Function: Create a function that can check if a number is evenly divisible
        MyFirstFunctionalInterface divisibleBy3And5=n -> {
          if (n%15==0){
              System.out.println(n+" is divisible by 3 and 5");
          }else{
              System.out.println(n+" is not divisible by 3 and 5");
          }
        };
        divisibleBy3And5.apply(30);
    }
}
