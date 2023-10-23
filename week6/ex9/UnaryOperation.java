package week6.ex9;

public abstract class UnaryOperation implements EvalInterface {
    private EvalInterface op;
    private String label;

    public UnaryOperation(String label, EvalInterface op){
        this.op = op;
        this.label = label;
    }

    protected abstract double calculate(EvalInterface op);
    
    @Override
    public double toValue(){
        return calculate(op);
    }
    @Override
    public String toString(){
        return label;
    }
}
