package week6.ex9;

public class Sqrt extends UnaryOperation {

    public Sqrt(EvalInterface op) {
        super("√", op);
    }

    @Override
    protected double calculate(EvalInterface op) {
        double num = op.toValue();
        if (num < 0) return -1;
        if (num == 0 || num == 1) return num;

        double precision = 0.000001; // Define your precision level
        double guess = num;
        double previousGuess;

        do {
            previousGuess = guess;
            guess = (guess + (num / guess)) / 2.0;
        } while (Math.abs(guess - previousGuess) > precision);

        return guess;
    }   
    
    
}
