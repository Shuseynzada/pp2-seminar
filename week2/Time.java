package week2;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sec = s.nextInt();
        System.out.printf("%02d:%02d:%02d", sec/3600, (sec%3600)/60, sec%60);
        s.close();
    }
}
