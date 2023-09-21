package week2;

import java.util.Scanner;

public class Harmonic {

    static double harmonicSeries(int a){
        if(a==0) return 0;
        return harmonicSeries(a-1)+1.0/a;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        double sum = 0;
        // for(int i = 1; i <= n; i++){
        //     sum += 1.0/i;
        // }

        sum = harmonicSeries(n);

        System.out.println(sum);
    }
}
