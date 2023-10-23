package week6.ex9;

public class Factorial extends UnaryOperation {

    public Factorial(EvalInterface op) {
        super("!", op);
    }

    public static int fact(int n){
        if(n==0 || n== 1) return 1;
        return n * fact(n-1);
    }

    @Override
    protected double calculate(EvalInterface op) {
        return fact((int)op.toValue());
    }

}
