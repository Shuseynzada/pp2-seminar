package week3.ex5;

public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, -2);
        ComplexNumber num2 = new ComplexNumber(4, -3);
        System.out.println(num1.sub(num2).toFormula());
    }
}
