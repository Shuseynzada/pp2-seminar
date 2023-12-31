package week6.ex9;

public class Operand implements EvalInterface {
    private double value;
    private String label;

    public Operand(String label, double value){
        this.label = label;
        this.value = value;
    }

    @Override
    public double toValue() {
        return value;
    }

    @Override
    public String toString() {
        return label;
    }

}
