import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        while (scan.hasNextInt()) {
            num = scan.nextInt();

            System.out.printf("%d! is %d\n", num, factorial(num));
        }

        scan.close();
    }

    static int factorial(int n) {
        if(n<0) throw new IllegalArgumentException("No negative number");
        if (n == 0 || n == 1) return 1;

        return factorial(n-1)*n;
    }
}