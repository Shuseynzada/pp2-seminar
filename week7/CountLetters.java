import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] counts = null;
        String word;

        do {
            boolean skip = false;
            counts = new int[26];
            System.out.print("Enter a word, preferrably only english letters (0 to exit): ");
            word = scan.nextLine();
            word = word.toLowerCase();
            if (word.trim().equals("0"))
                break;
            for (int i = 0; i < word.length(); i++){
                try {
                    counts[word.charAt(i) - 'a']++;     
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("It is not an english letter");
                    skip = true;
                }
            }
            if(skip) continue;
            System.out.println("Here are the letters:");
            for (int i = 0; i < counts.length; i++)
                if (counts[i] != 0)
                    System.out.println("\t"+(char) (i + 'a') + ": " + counts[i]);
        } while (true);
        scan.close();
    }
}