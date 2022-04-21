package day08_LogicalOperatorsIFstatement;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 65,
                weeklyRate = 40;

        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;


        //--------------------------

        int salaryBeforeTax = hourlyRate * weeklyRate * 52;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;


        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax-totalTax;
        System.out.println("Gross pay is : $" + salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("Federal tax= $" + federalTax);
        System.out.println("Total tax = $"+totalTax);
        System.out.println("Net income=$"+ salaryAfterTax);

    }
}
