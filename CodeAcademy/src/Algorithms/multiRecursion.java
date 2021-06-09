package Algorithms;

import java.util.Scanner;

public class multiRecursion {

	//
	///5*6*7
	static int multiDigits (int num) {
		if(num<1) {
			return 1;
		}else {
	
		return num%10*multiDigits(num/10);
	}
	}
	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(multiDigits(num));
	}
}

