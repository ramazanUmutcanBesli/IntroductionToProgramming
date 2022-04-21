package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        // Car 1 info wıth use setInfo() method
        Car car1 =new Car();
        car1.setInfo("Mercedes","C classe","Black",2018,215.3);

        Car car2 =new Car();
        car2.brand="BMW";
        car2.model="4er Serıes";
        car2.color="Blue";
        car2.year=2006;
        car2.price=75.3;
        Car car3=new Car();
        car3.setInfo("Audı","A5","Grau",2014,16.5);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        car1.drive();
        car2.start();
        car3.stop();

        // Car[] cars ={ car1, car2,car3};

        ArrayList<Car> carList =new ArrayList<>();
        carList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(carList);
        for (Car each: carList){
            System.out.println(each.brand + " : "+ each.price);
        }
        System.out.println("------------------------------");
        /* Recall

        Mercedes 1995-1997
        BMW : 2005 -2008
         */
        carList.removeIf(p->p.brand.equals("BMW")&&p.year>= 2005 && p.year<=2008);
        carList.removeIf(p->p.brand.equals("Audı")&& p.year>=1995&& p.year<=2015);
        System.out.println(carList);
    }
}
