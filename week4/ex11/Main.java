package week4.ex11;

public class Main {
    public static String swapFirstAndLast(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() >= 2) {
                char firstChar = word.charAt(0);
                char lastChar = word.charAt(word.length() - 1);
                word = lastChar + word.substring(1, word.length() - 1) + firstChar;
            }
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "This is PP2 Fall 2021";
        String output = swapFirstAndLast(input);
        System.out.println(output);
    }
}
