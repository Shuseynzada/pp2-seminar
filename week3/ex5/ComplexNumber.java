package week3.ex5;

public class ComplexNumber {
    private double x, y;

    ComplexNumber(double real, double imag) {
        this.x = real;
        this.y = imag;
    }

    boolean equals(ComplexNumber number) {
        return this.x == number.x && this.y == number.y;
    }

    String toFormula() {
        char sign = (this.y >= 0) ? '+' : '-';
        return String.format("%f %c %fi\n", this.x, sign, Math.abs(this.y));
    }

    double re() {
        return this.x;
    }

    double imag() {
        return this.y;
    }

    ComplexNumber conjugate() {
        return new ComplexNumber(x, -y);
    }

    double abs() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(number.x + this.x, number.y + this.y);
    }

    ComplexNumber sub(ComplexNumber number) {
        return new ComplexNumber(this.x - number.x, this.y - number.y);
    }

    ComplexNumber mult(ComplexNumber number) {
        return new ComplexNumber(number.x * this.x - number.y * this.y, number.x * this.y - number.y * this.x);
    }
}
