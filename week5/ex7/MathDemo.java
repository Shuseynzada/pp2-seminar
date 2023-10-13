package week5.ex7;

public class MathDemo {
    static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int sum(int[] args) {
        int res = 0;

        for (int i : args) {
            res += i;
        }

        return res;
    }

    static float mean(int[] args){
        return MathDemo.sum(args)/args.length;
    }

    static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        return n* factorial(n-1);
    }
}
