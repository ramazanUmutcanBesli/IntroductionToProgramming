package day31_ConstructorsWithText;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount();
        account1.setInfo("Ahmet",1234566789);
        System.out.println(account1);
        account1.deposit(1000);
        account1.checkBalance();
        account1.withDraw(900);
        account1.checkBalance();
        System.out.println("------------------------------");
        BankAccount account2 =new BankAccount();
        account2.setInfo("Aygun",976543321);
        account2.deposit(10000);
        account2.checkBalance();
    }
}
