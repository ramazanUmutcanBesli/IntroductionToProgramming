package Day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n=100;
        if(n%2==0){
            System.out.println("even number");// String
        }else{
            System.out.println("Odd number");// String
        }


        System.out.println("----------------------");


        //******************************
        String result1= (n%2==0)?"Even": "Odd";
        System.out.println(result1);

        System.out.println("----------------------");

        int age =11;
        if (age>=21){
            System.out.println("eligible");
        }else{
            System.out.println("Not eligible");
        }
        String result=(age>=21)? "eligible":"Not Eligible";
        System.out.println(result);


        System.out.println("------------------");
        int number =100;

        if(number>0){
            System.out.println("Positive");
        }else if(number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        int a = 4;

        String value=(number>0)?"Positive" : (number<0)? "Negative": "Zero";
        System.out.println(value);
        String today = (a==1)? "Monday": (a==2)?"Tuesday":(a==3)?"Wednesday":
                (a==4)?"Thursday":(a==5)?"Friday":(a==6)?"Saturday":(a==7)?"Sunday":"Unvalid day";
        System.out.println(
                today
        );

    }
}
