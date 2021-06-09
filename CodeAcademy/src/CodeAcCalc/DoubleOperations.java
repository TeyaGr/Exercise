package CodeAcCalc;

import java.util.Scanner;

public class DoubleOperations implements InputOptions {

	@Override
	public void inputOp(Scanner scan, int choice) {
		System.out.println("Choose an operation");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("Dividion");
		choice = scan.nextInt();
		System.out.println("Enter 2 numbers");
		Double a = scan.nextDouble();
				Double b = scan.nextDouble();
				switchOperations(choice, a, b);
	}
		private void switchOperations(int choice, Double a , Double b) {
		switch(choice){
		case 1:
			System.out.println(add( a,  b));
			break;
		case 2 :
			System.out.println(sub(a,b));
			break;
		case 3 :
			System.out.println(mult(a,b));
			break;
		case 4 :
			System.out.println(div(a,b));
			break;
		default:
			System.out.println("Choose a valid operation");
		}
	}



private Double add(Double a, Double b) {
	Double result = a+b;
	return result;
}
private Double sub(Double a, Double b) {
	Double result = a-b;
	return result;
}
private Double mult(Double a, Double b) {
	Double result = a*b;
	return result;
}
private Double div(Double a, Double b) {
	Double result = a/b;
	return result;
}
		
	}


