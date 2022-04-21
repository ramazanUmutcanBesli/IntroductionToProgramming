package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {
    public static void main(String[] args) {
        //Implicit Casting
        byte a =100;
        short b=a;
        //smaller primitive can be directly
        //assigned to larger primitive type
        //double> float>long>int>short>byte
        int c =b;// implicit casting
        //int c= (int)b;
        long d =c;
        float e=d;
        double f=e;
        //Explicit Casting
        /*
        larger primitives can not be directly
        assigned to smaller primitive types
         */
        double f1=10000000000000L;
        float e1=(float)f1;

        int x=55;
        short y=(short)x;
        System.out.println(x+":"+y);
        long j= 1000000;
        short k = (short)j;
        System.out.println(j+":"+k);
        double l = 2.5;
        float m = (float)l;
        double n =10.8;
        int s = (int)n;
        System.out.println(s+":"+n);
        double d1=20.5;
        short s1 = (short) d1;
        /*
        integer / integer =====> integer
        decimal / integer =====> decimal
        integer / decimal =====> decimal
        decimal / decimal =====> decimal
        a
         */

    }
}
