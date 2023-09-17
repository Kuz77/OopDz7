package OOPDZ7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = new FileLogger("log.txt");
        Calculator calculator = new ComplexCalculator(logger);


//        ComplexNumber num1 = new ComplexNumber(2.0, 2.0);
//        ComplexNumber num2 = new ComplexNumber(3.0, 4.0);
//        System.out.println(" ");
//        System.out.println("наши числа: ");
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//        System.out.println(" ");
//
//        ComplexNumber plus = calculator.plus(num1, num2);
//        System.out.println("сумма = " + plus);
//        System.out.println(" ");
//
//        ComplexNumber multi = calculator.multi(num1, num2);
//        System.out.println("произведение = " + plus);
//        System.out.println(" ");
//
//        ComplexNumber division = calculator.division(num1, num2);
//        System.out.println("частное = " + plus);
//        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целую часть первого числа: ");
        double realPart1 = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа: ");
        double imaginaryPart1 = scanner.nextDouble();

        System.out.println("Введите целую часть второго числа: ");
        double realPart2 = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа: ");
        double imaginaryPart2 = scanner.nextDouble();

        ComplexNumber num1 = new ComplexNumber(realPart1, imaginaryPart1);
        ComplexNumber num2 = new ComplexNumber(realPart2, imaginaryPart2);

        System.out.println("Выберите операцию (1 - сложение, 2 - умножение, 3 - деление, 4 - вычитание): ");
        int choice = scanner.nextInt();

        ComplexNumber result;
        String operation = "";

        switch (choice) {
            case 1:
                result = calculator.plus(num1, num2);
                operation = "Сложение";
                break;
            case 2:
                result = calculator.multi(num1, num2);
                operation = "Умножение";
                break;
            case 3:
                result = calculator.division(num1, num2);
                operation = "Деление";
                break;
            case 4:
                result = calculator.minus(num1, num2);
                operation = "Вычитание";
                break;
            default:
                System.out.println("Некорректный выбор операции.");
                return;
        }

        System.out.println(operation + ": " + num1 + " и " + num2 + " = " + result);
    }

}

