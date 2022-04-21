package day17_While_DoWhile;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
        boolean a = false;
        while(a){
            System.out.println("Wooden spoon-- while loop");
        }
        System.out.println("----------------------");
        do{
            System.out.println("Wooden spoon--do while loop");
        }while(a);

        int k = 1;
        do{
            System.out.println("Wooden Spoon");
            k++;
        }while(k<10);




    }
}
