package week2;

public class Calc {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.printf("%d %d",a / b, a % b);

        
    }
}
