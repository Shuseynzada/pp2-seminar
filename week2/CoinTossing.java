package week2;

public class CoinTossing {

    static int toss() {
        double f = Math.random() * 2;
        int res = 0;
        if (f >= 1) {
            res = 1;
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 20;
        int heads = 0;
        for(int i = 0; i < n; i++) heads += toss();

        System.out.printf("Heads - %d, Tails - %d, Probability for each: %f %f ",heads, n-heads, 1.0*heads/n, 1.0*(n-heads)/n);
    }
}
