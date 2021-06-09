package Calculator;

import java.util.Scanner;

public class CalcWithMethods {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int n1, n2,n3, choice;
	int result = 0;
	System.out.println("Enter any 2 digits");
	n1 = scan.nextInt();
	n2 = scan.nextInt();
	System.out.println("Now make your choice:");
	System.out.println("1. Substraction");

	System.out.println("2. Division");

	System.out.println("3. Multiplication");

	System.out.println("4. Addition");
	
choice = scan.nextInt();
Methods res = new Methods();
if ( choice == 1) {
	result = res.Sub(n1, n2);
}else if ( choice == 2) {
	result = res.Div(n1, n2);
}else if ( choice == 3) {
	result = res.Multi(n1, n2);
}else if ( choice == 4) {
	result = res.Add(n1, n2);
	}else {
		System.out.println("You made an unexisting choice!!!");
}
	System.out.println(result);
}
}
