package week06;

public class BasicLoopExamples {
    public static void main(String[] args) {
        for (int i = 0; i <=1000 ; i+=10) {
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("--------------------------------------------------");
        for (int i = 3; i <=130 ; i+=2) {
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("-----------------------------------------------------");
        for (int i = 3; i <130 ; i++) {
            boolean result =i%2==1;
            if(result){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------");
        int count=0;
        for (int i = 5; i <=50 ; i++) {
            boolean evenNumber=i%2==0;
            if(evenNumber){
                count++;
            }

        }
        System.out.println(count);
        System.out.println();
        System.out.println("-------------------------");
        for (int i = 1; i <=10 ; i++) {

            System.out.println("12 * "+i+"="+(12*i));
        }
    }
}
