package week2;

public class Fact {

    static int fact(int n) {
        if(n == 0 || n == 1) return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if(a < 0) {
            System.out.println("Negative integers doesn't have factorial");
            return;
        }

        System.out.println(fact(a));
    }
}
