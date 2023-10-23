package week6.ex9;

public class Sum extends BinaryOperations {

    public Sum(EvalInterface op1, EvalInterface op2) {
        super("+", op1, op2);
    }

    @Override
    protected double calculate(EvalInterface op1, EvalInterface op2) {
        return op1.toValue()+op2.toValue();
    }
    
}
