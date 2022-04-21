package day09_IfStatements;
import java.util.Scanner;

public class MetinIdea {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Give me fucking number 1 to 7 son of bitch : ");
        int n = scan.nextInt();
        String day12="Monday2", day2="Tuesday", day3="Wednesday", day4="Thursday", day5="Freiday", day6="Saturday", day7="Sunday";
        if(n==1){
            System.out.println("day12 = " + day12);
        }else if(n==2){
            System.out.println("day2 = " + day2);
        }else if(n==3){
            System.out.println("day3 = " + day3);
        }else if (n==4){
            System.out.println("day4 = " + day4);
        }else if(n==5){
            System.out.println("day5 = " + day5);
        }else if(n==6){
            System.out.println("day6 = " + day6);
        }else if (n==7){
            System.out.println("day7 = " + day7);
        }else{
            System.out.println("give me fucking valid number");
        }
    }

}
