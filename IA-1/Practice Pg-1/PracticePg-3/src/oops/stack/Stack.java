package oops.stack;

import java.util.*;

public class Stack {
	Scanner sc = new Scanner(System.in);
	private int top;
	private int[] stack;
	private int size;

	public Stack(int size, int top) {
		this.size = size;
		this.top = top;
		this.stack = new int[size];
	}

	public void push() {
		if (top == size - 1) {
			System.out.println("Stack Overflow!");
			return;
		}
		System.out.println("Enter element to push on to stack : ");
		stack[++top] = sc.nextInt();
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack Underflow");
		}
		System.out.println("Popped element : " + stack[top--]);
	}

	public void stackTop() {
		if(top == -1) {
			System.out.println("Stack empty!!");
		}
		System.out.println("Stack top : " + stack[top]);
	}

	public void display() {
		for (int i = top; i >= 0; i--) {
            System.out.print("\t" + stack[i]);
        }
        System.out.println();
	}
}
