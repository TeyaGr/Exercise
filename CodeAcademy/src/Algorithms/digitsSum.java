package Algorithms;

import java.util.Scanner;

public class digitsSum {
////123- 1+2+3
	static int digitsSum(int num) {
		if(num==0) {
			return 0;
		}else
			return num%10+ digitsSum(num/10); 
	}
	public static void main(String[] args) {
		
	System.out.println("enter a number");
	Scanner s = new Scanner( System.in);
	int num = s.nextInt();
	System.out.println(digitsSum(num));
	}
}
