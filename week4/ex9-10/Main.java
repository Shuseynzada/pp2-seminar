package week4.ex9;

public class Main {
    public static String sortString(String input) {
        
        StringBuilder sortedBuilder = new StringBuilder(input);
        
        for (int i = 0; i < sortedBuilder.length() - 1; i++) {
            for (int j = i + 1; j < sortedBuilder.length(); j++) {
                if (sortedBuilder.charAt(i) > sortedBuilder.charAt(j)) {
                    // Swap characters if they are out of order
                    char temp = sortedBuilder.charAt(i);
                    sortedBuilder.setCharAt(i, sortedBuilder.charAt(j));
                    sortedBuilder.setCharAt(j, temp);
                }
            }
        }
        String sortedString = sortedBuilder.toString();
        
        return sortedString;
    }

    static boolean isAnagram(String s1, String s2){
        if(sortString(s1).equals(sortString(s2))) return true;
        return false;
    }

    public static void main(String[] args) {
        String str1 = "silent", str2 = "listen";    
        System.out.println(isAnagram(str1, str2));
    }
}
