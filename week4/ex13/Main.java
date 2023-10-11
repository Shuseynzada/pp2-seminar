package week4.ex13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();

        // Loop through the word and print all possible slices
        for (int i = 1; i < word.length(); i++) {
            String firstPart = word.substring(0, i);
            String secondPart = word.substring(i);
            System.out.println(firstPart + " " + secondPart);
        }

        // Print the original word
        System.out.println(word);

        scanner.close();
    }
}
