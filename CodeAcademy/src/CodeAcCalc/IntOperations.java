package CodeAcCalc;

import java.util.Scanner;

public class IntOperations implements InputOptions {

	@Override
	public void inputOp(Scanner scan, int choice) {
		System.out.println("Choose an operation");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("Dividion");
		choice = scan.nextInt();
		System.out.println("Enter 2 numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		switchOperations(choice, a, b);
	}

	private void switchOperations(int choice, int a, int b) {
		switch (choice) {
		case 1:
			System.out.println(add(a, b));
			break;
		case 2:
			System.out.println(sub(a, b));
			break;
		case 3:
			System.out.println(mult(a, b));
			break;
		case 4:
			System.out.println(div(a, b));
			break;
		default:
			System.out.println("Choose a valid operation");
		}
	}

	private int add(int a, int b) {
		int result = a + b;
		return result;
	}

	private int sub(int a, int b) {

		int result = a - b;
		return result;
	}

	private int mult(int a, int b) {
		int result = a * b;
		return result;
	}

	private int div(int a, int b) {
		int result = a / b;
		return result;
	}
}
