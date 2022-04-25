package week15;

public class MultiCatchExamples {
    public static void main(String[] args) {
        // more specialized exception class statement should be first in the order
        String word = "Java";
        try{
            System.out.println(word.substring(20));
        }catch(Throwable e){
            System.out.println(e.getClass().getSimpleName());
            System.out.println("Reason = "+e.getMessage());

        }
    }
}
