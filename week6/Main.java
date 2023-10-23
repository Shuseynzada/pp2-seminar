package week6;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    
    public static BigInteger factorial(int n){
        if(n==0 || n== 1) return new BigInteger("1");
        BigInteger bg = new BigInteger(n+"");
        return factorial(n-1).multiply(bg);
    };

    public static BigInteger power(int x, int n){
        if(x==0) return new BigInteger("0");
        if(x == 1 || n == 0 ) return new BigInteger("1");
        return power(x, n-1).multiply(new BigInteger(x+""));
    }
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("2.35");
        BigDecimal b = new BigDecimal("1.95");
        BigDecimal c = b.subtract(a);
        System.out.println(c);
    }
}
