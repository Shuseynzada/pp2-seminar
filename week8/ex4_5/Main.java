package week8.ex4_5;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(2);
        q.add(1);
        q.add(14);
        q.add(3);
        q.add(1);
        q.add(1);
        q.add(1);
        q.add(1);
        
        
        int piecesInStore = 6;
        int peopleCanBuy = 0;

        while (!q.isEmpty()) {
            int tempPiece = q.poll();
            if(piecesInStore - tempPiece >= 0){
                peopleCanBuy++;
                piecesInStore-=tempPiece;
            }
        }
        System.out.println(peopleCanBuy);
    }
}
