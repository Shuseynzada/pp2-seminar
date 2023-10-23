package week6.ex9;

public class Main {
    public static void main(String[] args) {
        Operand x = new Operand("x", 5);
        Operand y = new Operand("y", 15);
        Operand z = new Operand("z", 3);

        Sum s = new Sum(x, y);

        Factorial s2 = new Factorial(x);

        System.out.println(s2.toValue());

    }
}
