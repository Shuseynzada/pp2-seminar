package week2;

import java.util.Scanner;

public class ArmstrongNumbers {

    static int intLen(int a) {
        int n = Math.abs(a);
        int res = 0;
        while (n > 0) {
            n /= 10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = (s.hasNextInt()) ? s.nextInt() : n1;
        s.close();
        for (int i = n1; i <= n2; i++) {
            int sum = 0;
            int len = intLen(i);
            int tempN = i;
            while (tempN > 0) {
                int t = tempN % 10;
                tempN /= 10;
                sum += Math.pow(t, len);
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}
