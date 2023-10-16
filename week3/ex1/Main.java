package week3.ex1;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(-1, -2);
        Point p2 = new Point(1, 8);
        Point p3 = new Point(0, 3);
        Point p4 = new Point(p);
        Segment s1 = new Segment(p2, p);
        System.out.println(s1.isOnSegment(p3));
    }
}