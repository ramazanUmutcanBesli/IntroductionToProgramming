package week05;



public class StringReview02 {
    public static void main(String[] args) {
        /*
        length(): it does not take parameter, it returns an int num
        replace()
        toUpper or LowerCase
        substring
        charAt
        indexOf()
        lastindexof()
        equals()
        trim()

         */
        String message= "EU8 is awesome!!";
        int count= message.length();
        System.out.println("How many characters we have: "+count);
        if(message.length()==16){
            System.out.println("Happy Testing");
        }

        System.out.println(message.toUpperCase());
        System.out.println("Message after uppercase");
        System.out.println(message);
        // assign changes to a reference
        String messageTwo= message.toUpperCase();
        System.out.println(messageTwo);
        String str =" abc ";
        System.out.println(str.trim());// bastaki ve sondaki bosluklari alip yazdirmaya yarar.
        System.out.println(str);
        // can we also trim not the spaces before or after, but the one that is inside the
        // text?

        String str2 = " abc cde ";
        str2= str2.replaceAll(" ","");// text deki bir karakteri digeriyle
        // degistirmeye yarar.
        System.out.println(str2);

        String str3 = " abc cde ";
        str3 = str3.replace(" ","");
        System.out.println(str3);

        String str4 = " abc cde ";
        str4 = str4.replaceFirst(" ","");// ilk girilen karakteri verilen karakterle degistirir
        System.out.println(str4);

        //Can we trim and replacce and do upperCase and substring in the same expression
        // string methods chaining : possible YES
        String str5="EU8 Awesome";
        str5=str5.trim().replaceFirst(" ","").toUpperCase().substring(3);
        System.out.println(str5);

    }
}
