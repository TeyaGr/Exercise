package Calculator;

import java.util.Scanner;

public class BasicCalc {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	double n1, n2, answer;
	System.out.println("Enter your first num.:");
	n1= scan.nextDouble();
	System.out.println("Enter your second num.:");
	n2= scan.nextDouble();
	answer = n1+n2;
	System.out.println(answer);
			
	
}
}
