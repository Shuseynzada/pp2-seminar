package week2;

public class Digits {
    public static void main(String[] args) {
        int n = Math.abs(215);
        int sum = 0, product = 1, leng = 0;
        while(n != 0){
            int t = n%10;
            sum += t;
            product *= t;
            leng ++;
            n/=10;
        }

        double average = 1.0*sum / leng;

        System.out.println(sum);
        System.out.println(product);
        System.out.println(average);
    }
}
