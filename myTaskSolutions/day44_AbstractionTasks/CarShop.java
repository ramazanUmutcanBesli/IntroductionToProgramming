package day44_AbstractionTasks;

public class CarShop {
    public static void main(String[] args) {
        Toyota toyota= new Toyota("RAV4",2008,10000,"black");
        Audi audi=new Audi("A5",2015,20000,"Gray");
        Tesla tesla=new Tesla("AA",2018,30000,"white");
        CydeoCar cydeoCar=new CydeoCar("First",2022,50000,"green");
        System.out.println(toyota);
        System.out.println(audi);
        System.out.println(tesla);
        System.out.println(cydeoCar);
        audi.autoPark();
        tesla.autoPark();
        tesla.selfDrive();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();

    }
}
