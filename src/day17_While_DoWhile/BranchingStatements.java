package day17_While_DoWhile;

public class BranchingStatements {
    public static void main(String[] args) {

        // continue; it is for skipped  the current iteration   
        // break; exits or switch the loop
        for (char i = 'A'; i <='Z' ; i++) {
            if(i=='F'){
                System.out.println(i);
                break;
            }
            System.out.println(i+" ");
        }
    }
}
