package week5.ex9;
public class InvalidAmountException extends RuntimeException {

    public InvalidAmountException() {
        super("Invalid amount provided");
    }

    public InvalidAmountException(String message) {
        super(message);
    }
}
