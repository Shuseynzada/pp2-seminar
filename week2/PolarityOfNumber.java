package week2;

import java.util.Scanner;

public class PolarityOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        if(a>0) System.out.println("Positive");
        if(a==0) System.out.println("Neutral");
        if(a<0) System.out.println("Negative");
        s.close();
    }
}
