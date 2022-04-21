package Day10_NestedIf;

public class NestedIFIntro {
    public static void main(String[] args) {
        int score = 5;
        if(score>=0&& score<=100){
            if (score >=60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid");
        }


        System.out.println("-----------------");

        int age=25;
        boolean hasId=true;
        if (hasId){ // if The person has ID
            if(age>=21){// if the person is 21 years old or older
                System.out.println("eligible to buy alcohol");
            }else { // if the person is less than 21 years old
                System.out.println("not eligible to buy alcohol");
            }
        }else{
            System.out.println("You can not buy alcohol");
        }

        System.out.println("-------------------------");

        int number =2;

        if(number>=1 && number<=7){
            // 7 Options
            if(number==1){
                System.out.println("Monday");
            }else if(number==2){
                System.out.println("Tuesday");
            }else if (number==3){
                System.out.println("Wednesday");
            }else if(number==4){
                System.out.println("Thursday");
            }else if(number==5){
                System.out.println("Friday");
            }else if (number==6){
                System.out.println("saturday");
            }else{
                System.out.println("sunday");
            }
        }else{// if the number is not valid
            System.out.println("Invalid Number");
        }

    }
}
