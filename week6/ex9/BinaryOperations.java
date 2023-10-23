package week6.ex9;

public abstract class BinaryOperations implements EvalInterface {
    private EvalInterface op1, op2;
    private String label;

    public BinaryOperations(String label, EvalInterface op1, EvalInterface op2){
        this.op1 = op1;
        this.op2 = op2;
        this.label = label;
    }

    protected abstract double calculate(EvalInterface op1, EvalInterface op2);

    @Override
    public double toValue() {
        return calculate(op1, op2);
    }

    @Override
    public String toString() {
        return label;
    }
    
}
