package week2;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sm = Math.min(a,b);
        int bg = Math.max(a,b);
        if(sm%2==0) sm++;
        int sum = 0;
        for(int i = sm; i <= bg; i+=2){
            sum += i;
        }

        System.out.println(sum);
        s.close();
    }
}
