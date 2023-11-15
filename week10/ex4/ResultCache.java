package week10.ex4;

import java.util.HashMap;
import java.util.Map;

public class ResultCache {
    private static HashMap<String, Character> cache = new HashMap<>();

    public static void main(String[] args) {
        for (String arg : args) {
            char ans = ResultCache.getMostFrequent(arg);
            System.out.println(ans);
        }
    }

    public static char getMostFrequent(String s) {
        return getExtremeFrequent(s, true);
    }

    public static char getLeastFrequent(String s) {
        return getExtremeFrequent(s, false);
    }

    private static char getExtremeFrequent(String s, boolean isFindingMost) {
        if (cache.containsKey(s)) return cache.get(s);

        HashMap<Character, Integer> m = new HashMap<>();
        for (char ch : s.toCharArray()) {
            int times = m.getOrDefault(ch, 0);
            m.put(ch, times + 1);
        }

        char extChar = s.charAt(0);

        for (Map.Entry<Character, Integer> entry : m.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if ((isFindingMost && value > m.get(key)) || (!isFindingMost && value < m.get(key)))
                extChar = key;
        }

        cache.put(s, extChar);
        return extChar;

    }

}
