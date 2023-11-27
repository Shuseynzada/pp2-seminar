package week10.ex2;

import java.util.Collections;
import java.util.LinkedList;

public class AdditionAndSort {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            sortedAdd((int)(Math.random()*100), l);
        }
        long endTime = System.currentTimeMillis();

        System.out.println(l);
        System.out.println("Time spent for constructing the list: " + (endTime - startTime) + " milliseconds");
    }

    public static void addSort(int x, LinkedList<Integer> l) {
        l.add(x);
        Collections.sort(l);
    }

    public static void sortedAdd(int x, LinkedList<Integer> l) {
        int i = 0;

        while (i < l.size() && l.get(i) < x) {
            i++;
        }

        l.add(i, x);
    }
}
