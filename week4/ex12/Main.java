package week4.ex12;

public class Main {
    public static int findSubstringIndex(String string, String sub) {
        int stringLength = string.length();
        int subLength = sub.length();

        for (int i = 0; i <= stringLength - subLength; i++) {
            int j;
            for (j = 0; j < subLength; j++) {
                if (string.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == subLength) {
                return i; 
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String string = "Hello, World!";
        String sub = "World";

        int index = findSubstringIndex(string, sub);

        if (index != -1) {
            System.out.println("Substring found at index " + index);
        } else {
            System.out.println("Substring not found");
        }
    }
}
