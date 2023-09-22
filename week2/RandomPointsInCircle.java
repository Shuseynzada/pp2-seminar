package week2;

public class RandomPointsInCircle {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 0; i < n; i++) {
            double roll = Math.random();
            System.out.print(Math.sin(2*roll*Math.PI));
            System.out.print(" : ");
            System.out.println(Math.cos(2*roll*Math.PI));
        }
    }
}
