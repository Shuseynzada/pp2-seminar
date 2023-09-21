package week2;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0, l = 0;
        while(s.hasNextInt()){
            int temp = s.nextInt();
            sum += temp;
            l++;
        }
        s.close();
        System.out.println(1.0 * sum / l);
    }
}
