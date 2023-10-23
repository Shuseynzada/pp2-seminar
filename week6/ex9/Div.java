package week6.ex9;

public class Div extends BinaryOperations {

    public Div(EvalInterface op1, EvalInterface op2) {
        super("/", op1, op2);
    }

    @Override
    protected double calculate(EvalInterface op1, EvalInterface op2) {
        return op1.toValue() / op2.toValue();
    }
    
}