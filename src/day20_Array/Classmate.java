package day20_Array;

public class Classmate {
    public static void main(String[] args) {
        String [] classmates=new String[10];
        classmates[0]="Ali";
        classmates[1]="Vel,";
        classmates[2]="Ayse";
        classmates[3]="Ahmet";
        classmates[4]="Hatice";
        classmates[5]="Gülay";
        classmates[6]="Halil";
        classmates[7]="Metin";
        classmates[8]="Umut";
        classmates[9]="Dilan";
        for (String classmate : classmates) {
            System.out.println(classmate);
        }
    }
}
