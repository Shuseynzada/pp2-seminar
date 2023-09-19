package week2;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a%4 == 0) System.out.println("It is a lap year");
        else System.out.println("Not a lap year");

        s.close();
    }
}
