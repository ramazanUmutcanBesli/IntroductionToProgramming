package day08_LogicalOperatorsIFstatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 25;
        String citizen = "USA";
        boolean isNeglable = age >= 18 || citizen == "USA";
        System.out.println(isNeglable);


        System.out.println("----------------------------------");
        String name2 = "josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;
        boolean isEligible2 = creditScore >= 700 && age >= 21 && income == 60000;
        System.out.println(name2 + " is eligible for loan: " + isEligible2);
        System.out.println("------------------------------------");
        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age >= 18 && (gender == 'M' || gender == 'F');
        //                      21>=18 && ('F' == 'M'|| 'F' == 'F')
        //                      true          false     true
        //                              true        true
        //                                     true
        System.out.println(name3 + " is eligible to register: " + isEligible3);
        System.out.println("------------------------------------------");
        String name4 = "James",
                countryOfBirth = "UK";
        boolean marriedToUSCitize = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitize == true;
        //                      false             || false
        System.out.println(name4 + " is eligible to apply for US citizenShip: " + isEligible4);
        // in logical or operator only one expression needs to be true in order to
        // return true
        // in logical and operator, both expressions need to be true in order to
        // return true

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome < 60000;
        System.out.println(student + "is eligible to take Scholarship: " + isEligible5);
        System.out.println("---------------------------------------");
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);


    }
}
