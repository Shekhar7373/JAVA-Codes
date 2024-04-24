package oops.demo;

import oops.stack.Stack;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack(10, -1);
		try (Scanner sc = new Scanner(System.in)) {
			boolean choose = true;
			while (choose) {
				System.out.print("\n1 - push\n2 - pop\n3 - stacktop\n4 - display\n0 - exit\nEnter your option:");

				switch (sc.nextInt()) {
				case 0:
					System.out.println("Exiting...");
					choose = false;
					break;
				case 1:
					s.push();
					break;

				case 2:
					s.pop();
					break;
				case 3:
					s.stackTop();
					break;
				case 4:
					s.display();
					break;

				default:
					System.out.println("Invalid Input!!");
					break;
				}
			}
		}
	}
}
