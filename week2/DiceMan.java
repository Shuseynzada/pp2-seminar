package week2;

import java.util.Scanner;

public class DiceMan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your guess: ");
            int temp = s.nextInt();
            if (temp == 0)
                break;
            int roll1 = (int) Math.ceil(Math.random() * 6);
            int roll2 = (int) Math.ceil(Math.random() * 6);
            System.out.printf("%d %d\n", roll1, roll2);
            if (temp > 6 || temp < 0)
                System.out.println("Impossible number");
            else if (temp == roll1 || temp == roll2)
                System.out.println("You won");
            else
                System.out.println("Computer won");
        }
        s.close();
    }
}
