package OOPDZ7;

public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    @Override
    public String toString() {
        return "ComplexNumber{" +
                "realPart=" + realPart +
                ", imaginaryPart=" + imaginaryPart +
                '}';
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber plus(ComplexNumber other) {
        double realResult = this.realPart + other.realPart;
        double imaginaryResult = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public ComplexNumber multi(ComplexNumber other) {
        double realResult = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double imaginaryResult = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public ComplexNumber division(ComplexNumber other) {
        double denominator = other.realPart * other.realPart + other.imaginaryPart * other.imaginaryPart;
        double realResult = (this.realPart * other.realPart + this.imaginaryPart * other.imaginaryPart) / denominator;
        double imaginaryResult = (this.imaginaryPart * other.realPart - this.realPart * other.imaginaryPart) / denominator;
        return new ComplexNumber(realResult, imaginaryResult);
    }
    public ComplexNumber minus(ComplexNumber other) {
        double realResult = this.realPart - other.realPart;
        double imaginaryResult = this.imaginaryPart - other.imaginaryPart;
        return new ComplexNumber(realResult, imaginaryResult);
    }

}
