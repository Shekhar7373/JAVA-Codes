package oops.practiceprogram;

import java.util.Scanner;

import oops.calculator.Calculator;

public class CalculatorDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		try (Scanner sc = new Scanner(System.in)) {
			boolean choose = true;
			while (choose) {
				System.out.println(
						"\n1 - Addition(int)\n2 - Addition(float)\\n3 - Multiplication(int)\\n4 - Multiplication(float)\n5 - Division\nEnter your option:");

				switch (sc.nextInt()) {
				case 0:
					System.out.println("Exiting...");
					choose = false;
					break;
				case 1:
					System.out.println("Enter two numbers : "); {
					c1.addition(sc.nextInt(), sc.nextInt());
				}
					break;

				case 2:
					System.out.println("Enter two numbers : "); {
					c1.addition(sc.nextFloat(), sc.nextFloat());
				}
					break;
				case 3:
					System.out.println("Enter two numbers : "); {
					c1.multiplication(sc.nextInt(), sc.nextInt());
				}
					break;
				case 4:
					System.out.println("Enter two numbers : "); {
					c1.multiplication(sc.nextFloat(), sc.nextFloat());
				}
					break;
				case 5:
					System.out.println("Enter two numbers : "); {
					c1.multiplication(sc.nextFloat(), sc.nextFloat());
				}
					break;

				default:
					System.out.println("Invalid Input!!");
					break;
				}
			}
		}

	}
}
