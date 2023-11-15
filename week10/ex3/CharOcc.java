package week10.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class CharOcc {
    public static void main(String[] args) {

        for (char i = 'a'; i < 'z'; i++) {
            System.out.print(i);
        }
        System.out.println();

        for (String arg : args) {
            System.out.println(getOccurences(arg));
        }
    }

    public static TreeMap<Character, ArrayList<Integer>> getOccurences(String s) {
        TreeMap<Character, ArrayList<Integer>> hm = new TreeMap<>(Collections.reverseOrder());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ArrayList<Integer> ar = hm.get(ch);

            if (ar == null) {
                ar = new ArrayList<>();
            }

            ar.add(i);
            hm.put(ch, ar);
        }
        return hm;
    }
}