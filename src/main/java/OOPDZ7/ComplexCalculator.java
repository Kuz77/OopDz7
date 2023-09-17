package OOPDZ7;

public class ComplexCalculator implements Calculator {
    private Logger logger;

    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber plus(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.plus(num2);
        logger.log("Addition: " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber multi(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.multi(num2);
        logger.log("Multiplication: " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber division(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.division(num2);
        logger.log("Division: " + num1 + " / " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber minus(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.minus(num2);
        logger.log("Minus: " + num1 + " / " + num2 + " = " + result);
        return result;
    }


}
