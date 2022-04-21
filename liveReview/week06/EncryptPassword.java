package week06;

import java.util.Scanner;

public class EncryptPassword {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("give me password:");
        String password= scan.next();
        String encryptPassword="";
        for (int i = 0; i < password.length(); i++) {
            encryptPassword+=password.charAt(i)+"x";
        }
        System.out.println(encryptPassword);
    }


}
