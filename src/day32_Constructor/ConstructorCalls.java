package day32_Constructor;

public class ConstructorCalls {
    public ConstructorCalls() {
        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
    }
    public ConstructorCalls(String str){
        this(9);
        System.out.println("Constructor with string Argument");
    }

    public static void main(String[] args) {
        ConstructorCalls c1 =new ConstructorCalls();
        System.out.println("-----------------------");
        ConstructorCalls c2 =new ConstructorCalls(10);
        System.out.println("-----------------------");
        ConstructorCalls c3 =new ConstructorCalls("string");
    }
}
