package oops.calculator;

public class Calculator {
	public void addition(int operator1, int operator2) {
		System.out.println(operator1 + operator2);
	}

	public void substraction(int operator1, int operator2) {
		System.out.println(operator1 - operator2);
	}

	public void addition(double operator1, double operator2) {
		System.out.println(operator1 + operator2);
	}

	public void multiplication(int operator1, int operator2) {
		System.out.println(operator1 * operator2);
	}

	public void multiplication(float operator1, float operator2) {
		System.out.println(operator1 * operator2);
	}

	public void division(int operator1, int operator2) {
		try {
			System.out.println(operator1 / operator2);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
	}
}