package day23_CustomMethodIntro;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        helloWorld5Times();
        helloCydeo5Times();
        System.out.println("-------------------");
        evenNumbers();
    }
    // create a function that can print hello world 5 times  ====> helloWorld5Times()
    public static void helloWorld5Times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello World");
        }
    }
    // create a function that can print hello Cydeo 5 times
    public static void helloCydeo5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");
        }
    }
    public static void evenNumbers(){
        for (int i = 2; i < 11; i+=2) {
            System.out.println(i);
        }
    }


}
