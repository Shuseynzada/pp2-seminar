package week6;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("1000000.0");
        BigDecimal num2 = new BigDecimal("1.2");
        BigDecimal num3 = new BigDecimal("1000000.0");
        BigDecimal result = num1.add(num2).subtract(num3);
        System.out.println(result);
    }
}
