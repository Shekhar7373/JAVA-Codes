package oops.commandcalculator;

class Calculator {
    int addition(int operator1, int operator2) {
        return operator1 + operator2;
    }

    void substraction(int operator1, int operator2) {
        System.out.println(operator1 - operator2);
    }

    void addition(double operator1, double operator2) {
        System.out.println(operator1 + operator2);
    }

    void multiplication(int operator1, int operator2) {
        System.out.println(operator1 * operator2);
    }

    void multiplication(float operator1, float operator2) {
        System.out.println(operator1 * operator2);
    }

    void division(int operator1, int operator2) {
        try {
            System.out.println(operator1 / operator2);
        } catch (ArithmeticException ae) {
            System.out.println("Error: " + ae.getMessage());
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        if (args.length < 3) {
            System.out.println("Insufficient arguments. Please provide operator1, operator2 and operation.");
            return;
        }

        int operator1 = Integer.parseInt(args[0]);
        int operator2 = Integer.parseInt(args[1]);
        String operation = args[2];

        switch (operation) {
            case "add":
                System.out.println("Result: " + c1.addition(operator1, operator2));
                break;
            case "sub":
                c1.substraction(operator1, operator2);
                break;
            case "mul":
                c1.multiplication(operator1, operator2);
                break;
            case "div":
                if (operator2 != 0)
                    c1.division(operator1, operator2);
                else
                    System.out.println("Error: Division by zero!");
                break;
            default:
                System.out.println("Invalid operation. Please use 'add', 'sub', 'mul' or 'div'.");
        }
    }
}
