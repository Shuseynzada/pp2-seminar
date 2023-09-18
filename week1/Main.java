package week1;

class Main {
    public static void main(String args[]) {

        // 1
        System.out.println(":1");
        System.out.println(5);

        // 2
        System.out.println(":2");
        int a = 1, b = 2, c = 3;
        int sum1 = a + b + c;
        System.out.println(sum1);
        // 3
        System.out.println(":3");
        int d = 4;
        float f = 4.5f;
        long l = 123456789000L;
        double sum2 = d + f + l;
        System.out.println(sum2);
        // 4
        System.out.println(":4");
        System.out.println(1.0 / 5 * 2 / 3 - 3.0 / 10);
        System.out.print(1.0 / 5 * 2 / 3 - 3.0 / 10);
        System.out.printf("\n%f", 1.0 / 5 * 2 / 3 - 3.0 / 10);

        // 5
        System.out.println(":5");
        int typ = 27;
        System.out.printf("%d\n",typ);
        System.out.printf("%x\n",typ);
        System.out.printf("%o\n",typ);
        System.out.printf("%b\n",typ);

        float flt = 24.345678f;
        System.out.printf("%.2f\n",flt);
        System.out.printf("%8.f\n",flt);

    }
}
