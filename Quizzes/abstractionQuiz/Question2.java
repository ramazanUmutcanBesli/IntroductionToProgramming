package abstractionQuiz;

public class Question2 extends Data {
    public static void printHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Question2 obj =new Question2();
        obj.printHello();
    }
}
abstract class Data{
   // public abstract static void printHello();
}
