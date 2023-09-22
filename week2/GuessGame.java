package week2;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the interval: ");
        int A = s.nextInt();
        int attempts = 0;
        int roll = (int) Math.ceil(Math.random() * A);
        System.out.println(roll);
        System.out.print("Take your guess: ");
        while (s.hasNextInt()) {
            attempts++;
            int guess = s.nextInt();
            String ss = (attempts > 1)? "s" : "";
            if (guess == roll) {
                System.out.printf("Nice guess(in %d attempt"+ ss + ")", attempts);
                break;
            } else if (guess > roll)
                System.out.println("Guess lower");
            else if (guess < roll)
                System.out.println("Guess higher");
            System.out.print("Take your guess: ");
        }
        s.close();
    }
}
