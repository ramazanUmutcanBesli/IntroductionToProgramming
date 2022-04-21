package week06;

public class Quiz {
    public static void main(String[] args) {
        /*int num =-5;
        System.out.print(num++ +",");
        System.out.print(num=0);
        System.out.print(","+ --num);
        System.out.println();

        short s =13-9/3*10;
        s+=-10;
        System.out.println(s);
        boolean a = false || 0==(9-10+1);
        System.out.println(a);

        long l =100;
        short x =(short)l;
        System.out.println(x+10);
        int y =10;
        y=--y+ y++ +y-- + y++;
        System.out.println(y);*/

        /*short s = 13+3 * (10-6)%2;
        boolean b = s !=25;
        System.out.println(b);
        String x = "scsd";
        switch (x){
            case "scsd":*/
        /*int cookies =10;
        String day ="tuesday";
        switch(day){
            case "sunday":
                cookies++;
            case "monday":
                cookies+=5;
                break;
            case "tuesday":
            case "wednesday":
                cookies+=10;
            case "thursday":
                cookies+=5;
                break;
            case "friday":
                break;
            case "saturday":
                cookies--;
                break;
            default:
                cookies=0;


        }
        System.out.println(cookies);*/
        //String str ="";
        /*int num =20;
        switch (num){
            case 0:
                str="C# ";
                break;
            case 10:
                str+="is ";
            case 15:
                str="fun ";
            case 20:
                str+="java ";
            case 25:
                str+="is ";
                break;
            case 30:
                str+="fun";
                break;
            case 35:
                str="python";
            case 40:
                str+="90";

        }
        System.out.println(str);
        */
        int check =132;
        String str ="";
        if(check%2==0){
            str+=check;
            if(check%5==0){
                str+="132";
            }else{
                str="500";
            }
        }
    }
}
