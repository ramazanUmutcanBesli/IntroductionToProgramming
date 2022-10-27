package exception_Short_Quiz;

public class Sleep {
    public static void main(String[] args) {
        pause1();
        //pause2();
    }
    public static void pause1(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(" pause 1");
    }
    public static void pause2() throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("pause2");

    }
}
