package day15_ForLoop;

public class FINRa {
    public static void main(String[] args) {
        for(int i =1;i<=100;i++){
            if (i%15==0){
                System.out.print("FINRA ");
            }else if(i%3==0){
                System.out.print("FIN ");

            }else if(i%5==0){
                System.out.print("RA ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}
