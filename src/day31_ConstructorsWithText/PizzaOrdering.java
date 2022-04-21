package day31_ConstructorsWithText;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {
        // create 100 pizza objects: size- 'S' cheese topping 2 pepperoni topping 3
        // create 100 more pizza objects size M chese 3 pepperoni 4
        // ceate 100 more pizza objects size L chese 4 pepperoni 5
        ArrayList<Pizza> pizzas =new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Pizza smallPizza =new Pizza('S',2,3);
            Pizza mediumPizza =new Pizza('M',3,4);
            Pizza largePizza =new Pizza('L',4,5);
            pizzas.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));

        }
        System.out.println("Total number of pizza: "+pizzas.size());
        double totalPrice=0;
        for (Pizza each : pizzas) {
            totalPrice+=each.calcCost();

        }
        System.out.println("totalPrice = " + totalPrice);
    }
}
