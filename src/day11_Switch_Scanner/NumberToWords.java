package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        int number =7;
        boolean validable= number==1||number==2||number==3||number==4||number==5
                ||number==6||number==7||number==8||number==9;
        String result1="";
        if(validable){
            if(number==1){
                result1="one";
            }else if(number==3){
                result1="three";
            }else if(number==4){
                result1="vier";
            }else if(number==5){
                result1="fünf";
            }else if(number==6){
                result1="sechs";
            }else if(number==7){
                result1="sieben";
            }else if(number==8){
                result1="acht";
            }else {
                result1="Neun";
            }
        }else{
            result1="invalid number";

        }
        System.out.println(result1);


        System.out.println("-------------");

        String result =(number<=9&&number>=0)? (number==1)?"One": (number==2)?"Two":
                (number==3)?"Three": (number==4)?"Four":(number==5)?"Five": (number==6)?"six"
                        : (number==7)?"Seven": (number==8)?"Eight":"Neun":"Invalid number";
        System.out.println(result);
    }
}
