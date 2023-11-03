package week8.ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("week8/ex3/names.txt"))) {
            LinkedHashSet<String> lhs = new LinkedHashSet<>();
            String line;
            while ((line = br.readLine()) != null) {
                lhs.add(line);
            }
            System.out.println(lhs);

            List<String> a = new ArrayList<>(lhs);
            a.sort(new StringComparator());
            System.out.println(a);
        } catch (IOException e) {
            e.printStackTrace();
        } 
          

    }
}

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
    
}