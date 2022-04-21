package day35_EncapsulationTasks.candyTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {
        ArrayList<Candy> candies=new ArrayList<>();
        Candy candy1=new Candy("XXL",22,2.3,true);
        Candy candy2=new Candy("AAB",21,2.22,false);
        Candy candy3=new Candy("BBC",31,1,true);
        Candy candy4=new Candy("MMM",2,3,true);
        Candy candy5=new Candy("YYV",11,0,false);
        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));
        for (Candy each : candies) {
            System.out.println(each.getBrand()+" is "+each.getPrice());
        }
        System.out.println(candy5);
    }

}
