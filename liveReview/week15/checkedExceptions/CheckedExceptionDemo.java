package week15.checkedExceptions;

public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        // Which way do we have to handling checked exception
        // 1. try Catch
        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }
        System.out.println("I will move on with my web Automation");
        // 2. Declare using the Throws Keyword
        Thread.sleep(5000);
        System.out.println("More automatıon ");
    }
}
