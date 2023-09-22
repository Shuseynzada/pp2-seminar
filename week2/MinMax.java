package week2;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNextDouble()){
            double a = s.nextDouble();
            double b = s.nextDouble();
            System.out.printf("max-%f min-%f\n", Math.max(a, b), Math.min(a, b));
        }
        s.close();
    }
}
