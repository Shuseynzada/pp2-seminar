package week10.ex5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueChars {
    static HashMap<String, ArrayList<Character>> cacheMap = new HashMap<>();

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(getUniqueChars(arg));
        }
    }

    public static ArrayList<Character> getUniqueChars(String s) {
        if(cacheMap.containsKey(s)) return cacheMap.get(s);
        HashMap<Character, Integer> hm = new HashMap<>();
        ArrayList<Character> resList = new ArrayList<>();

        for (Character ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if( entry.getValue() == 1) resList.add(entry.getKey());  
        }

        cacheMap.put(s, resList);
        return resList; 
    }
}
