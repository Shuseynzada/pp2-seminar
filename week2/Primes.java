package week2;

public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean res = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                res = false;
                break;
            }
        }
        System.out.println(res);
    }
}
