import java.util.Scanner;

public class DoubleOperations implements MathOptions {

	public void mathOptions(Scanner scan, int opc) {
			System.out.println("Choose an operation");
			System.out.println("1 Addition");
			System.out.println("2 Substraction");
			System.out.println("3 Multiplication");
			System.out.println("4 Division");

			opc = scan.nextInt();
			System.out.println("Please enter 2 numbers");
			double first = scan.nextInt();
			double second = scan.nextInt();
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
	private static double addition(double first, double second) {
		double result = first + second;
		return result;
	}
	private static double substraction(double first, double second) {
		double result = first - second;
		return result;
	}
	private static double multiplication(double first, double second) {
		double result = first *second;
		return result;
	}
	private static double division(double first, double second) {
		double result = first / second;
		return result;
	}
	
}
