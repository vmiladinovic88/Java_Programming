package Week2.Day04_concetenation;

public class PrimitiveTypeCastings {

    public static void main(String[] args) {

        // -----------implicit casting----------

        byte a = 15;
        short b = a;

        System.out.println(b);

        int c = a;

        System.out.println(c);


        long d = 3000L;
        float f = d;

        // ------------Explicit Casting-----------

        int x = 100;

        byte y = (byte) x;

        System.out.println(y);

        float z = 20.8F;
        short q = (short)z;

        System.out.println(z);
        System.out.println(q);

        double n1 = 2.5;
        byte n2 = (byte) n1;

        System.out.println(n1);//n1=2.5
        System.out.println(n2);

        System.out.println("----------------");

        int num = 500;
        byte result = (byte) num; // explicit casting

        System.out.println(result);

        int r = 50000;
        short t = (short)r;

        System.out.println("r = " + r);
        System.out.println(t);

        double u = 3000.5;
        int p = (int)u;

        System.out.println(u);
        System.out.println(p);

        int o = 100;

        double d1 = o;

        System.out.println(o);
        System.out.println(d1);






    }

}
