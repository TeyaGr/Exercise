package CodeAcCalc;

import java.util.Scanner;

public class Choice {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Make your operation choice:");
	System.out.println("1.Int");
	System.out.println("2.Double");
	System.out.println("3.String");
	System.out.println("4.Arrays");
	int choice = scan.nextInt();
	if(choice==1) {
		IntOperations i = new IntOperations();
		i.inputOp(scan, choice);
	}else if ( choice == 2) {
		DoubleOperations d = new DoubleOperations();
		d.inputOp(scan, choice);
	}else if(choice == 3) {
		StringOperations so = new StringOperations();
		so.inputOp(scan, choice);
		
	}else if ( choice ==4) {
		Arrays a = new Arrays();
		a.inputOp(scan, choice);
	}else {
		System.out.println("Please choose a valid operation");
	}
}
}
