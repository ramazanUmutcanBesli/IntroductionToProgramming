package day11_Switch_Scanner;

import java.util.Scanner;

public class Browsers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String browserName= scan.next();
        String result="";
        boolean validBrowser=browserName=="chrome"|| browserName=="firefox"
                || browserName=="opera"|| browserName=="safari"||
                browserName=="edge";
        if(validBrowser){
            // 5 Options
            if(browserName=="chrome"){
                result="chrome is selected";
            }else if(browserName=="firefox"){
                result="firefox is selected";

            }else if (browserName=="opera"){
                result ="Opera browser is selected";
            }else if(browserName=="safari"){
                result="Safari browser is selected";

            }else{
                result ="edge browser is selected";
            }
        }else{
            result ="Invalid Browser Name";
        }

        System.out.println(result);


        System.out.println("-------------------");





    }
}
