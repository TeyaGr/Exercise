import java.util.Scanner;

public class IntOperations implements MathOptions {

	public static void mathOptions(Scanner scan, int opc) {
		System.out.println("Choose an operation");
		System.out.println("1 Addition");
		System.out.println("2 Substraction");
		System.out.println("3 Multiplication");
		System.out.println("4 Division");

		opc = scan.nextInt();
		System.out.println("Please enter 2 numbers");
		int first = scan.nextInt();
		int second = scan.nextInt();
		switch (opc) {
		case 1:
			System.out.println(addition(first,second));
			break;
		case 2:
			System.out.println(substraction(first,second));
			break;
		case 3:
			System.out.println(multiplication(first,second));
			break;
		case 4:
			System.out.println(division(first,second));
			break;
	}
	
	
	}
	private static void switchOperations(int opc, int first, int second ) {
		switch (opc) {
		case 1:
			System.out.println(addition(first,second));
			break;
		case 2:
			System.out.println(substraction(first,second));
			break;
		case 3:
			System.out.println(multiplication(first,second));
			break;
		case 4:
			System.out.println(division(first,second));
			break;
	}
	}
private static int addition(int first, int second) {
	int result = first + second;
	return result;
}
private static int substraction(int first, int second) {
	int result = first - second;
	return result;
}
private static int multiplication(int first, int second) {
	int result = first *second;
	return result;
}
private static int division(int first, int second) {
	int result = first / second;
	return result;
}
}

