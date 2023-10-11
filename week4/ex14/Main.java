package week4.ex14;

public class Main {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "abcxxfga";

        int count = countAndPrintMatchingSubstrings(str1, str2);
        System.out.println("Number of matching substrings: " + count);
    }

    public static int countAndPrintMatchingSubstrings(String str1, String str2) {
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String substring = str1.substring(i, j);
                if (str2.contains(substring) && str1.substring(i).equals(str2.substring(i, i + substring.length()))) {
                    count++;
                }
            }
        }

        return count;
    }
}
