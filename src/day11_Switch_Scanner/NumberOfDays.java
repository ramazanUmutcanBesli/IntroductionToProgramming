package day11_Switch_Scanner;

public class NumberOfDays {
    /*
    28 Days: 2
    30 Days : 4, 6, 9, 11
    31 Days: 1, 3,5, 7, 8, 10,12

     */


    public static void main(String[] args) {
        int year =2000;
        int number=2;
        String result="";
        if(number>=1 && number<=12){// number:1-12
            switch(number){
                case 2:
                    result=(year%4==0)? "29 days": "28 days";
                    break;
                case 4: case 6: case 9: case 11:
                    result="30 days";
                    break;
                default:
                    break;

            }
        }else{
            result="Invalid number";
        }
        System.out.println(result);
    }
}
