package Day10_NestedIf;

import java.util.Scanner;

public class NameOfMonth2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Give me number");
        int n = scan.nextInt();
      String name=  (n==1)? "January ": (n==2)?"Feb": (n==3)? "March":(n==4)?"April":(n==5)?"May"
        : (n==6)?"Jan":(n==7)?"jul":(n==8)?"August":(n==9)?"September":(n==10)?"Oktober":(n==11)?"Nov"
              : (n==12)?"dec":"Invalid number";
        System.out.println(name);
    }
}
