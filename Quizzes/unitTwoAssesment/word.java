package unitTwoAssesment;

public class word {
    public static void main(String[] args) {
        String word= "     Winter is coming    ";
        word=word.trim();
        System.out.println(word.length());

        String a= "123";
        String b = 5+4+a + 2+2;
        System.out.println(b);

        String result = 3425 > (9*1000) ? "garden": "patio";
        result.substring(2);
        System.out.println(result);

        System.out.println("-------------");

        String str = "the fox ran under the bridge";
        str = str.substring(4,17);
        str.toUpperCase();
        System.out.println(str+"ground");

        String s =" the game was tied at 2-2";
        String s2 = s.substring(5);
        int index1=s.indexOf("game");
        int index2=s2.indexOf("game");
        if(index1==index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }
        String z="popcorn";

        char chars[] =new char[26];
        int[] g={1,2,3};
        System.out.println(g);
    }
}
