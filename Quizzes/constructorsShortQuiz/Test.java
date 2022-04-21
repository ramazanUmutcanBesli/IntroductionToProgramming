package constructorsShortQuiz;

public class Test {
    public Test(){
        System.out.print("A ");
    }
    public Test(int a){
        this(2.5);
        System.out.print("B ");
    }
    public Test(double c){
        this();

        System.out.print("C ");
    }

    public static void main(String[] args) {
        Test obj =new Test(100);
    }
}
