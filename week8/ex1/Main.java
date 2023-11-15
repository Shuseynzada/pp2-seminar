package week8.ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(3);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(4);

        // 1b
        // System.out.println(a);
        // for (int i = 0; i < a.size(); i++) {
        // System.out.println(a.get(i));
        // }

        // for (Integer integer : a) {
        // System.out.println(integer);
        // }
        // Iterator<Integer> it = a.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        a.sort((in1, in2) -> 1*(in1 - in2));
        System.out.println(a);
    }
}
