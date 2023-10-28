import java.util.Scanner;

public class ParseNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // reading from standard input

        String line = scan.nextLine();
        scan.close();

        scan = new Scanner(line); // reading from a String
        int sum = 0, count = 0;

        while (scan.hasNext()) { // while there is a token to be read from the string
            String word = scan.next();
            try {
                int number = Integer.parseInt(word); // try to parse the word as an integer
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Try not to use non-numeric values: "+word);
            }
        }

        scan.close();

        if (count == 0) {
            System.out.println("There are no VALID input provided!");
        } else {
            System.out.printf("Sum = %d\nCount = %d\nAverage = %.3f\n", sum, count, (float) sum / count);
        }
    }
}
