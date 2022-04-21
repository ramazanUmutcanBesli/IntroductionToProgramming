package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initals("umutcan", "besli");
        System.out.println("------------------------");
        domain("cydeo@gmail.com");
        System.out.println("-------------------------");

        String[] emails = {"jsoh@gmail.com", "Jim@gmail.com", "umut@cydeo.com", "gulsen@amazon.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("-------------------------");
        nameOfMonth(111);
        System.out.println("--------------------------");
        nameOfDay(2);

    }


    //1. create a method that can display the initials of the person,   initials(String firstName,String LastName)
    public static void initals(String firstName, String LastName) {
        String initial = firstName.toUpperCase().charAt(0) + "." + LastName.toUpperCase().charAt(0) + ".";
        System.out.println(initial);
    }

    //2. create a method that can display the domain of the email. domain(String email)
    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    //3.Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "January" : (number == 2) ? "Feb" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "may" :
                    (number == 6) ? "June" : (number == 7) ? "Juli" : (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "Oktober" :
                            (number == 11) ? "November" : "December";
        } else {
            name = "invalid";
        }
        System.out.println("Month name = " + name);
    }
    // 4. create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String name="";
        if(number>=1&&number<=7){
            name=(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thursday":(number==5)?"Freiday":
                    (number==6)?"Saturday":"Sunday";
        }else{
            name="invalid";
        }
        System.out.println("Day name of Week : " + name);
    }

}
