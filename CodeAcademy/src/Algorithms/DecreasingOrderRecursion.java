package Algorithms;

import java.util.Scanner;

public class DecreasingOrderRecursion {
	//10-9-8-7
	static void printOrder ( int i) {
		if(i<1) {
			return;
		}else {
			System.out.println(i);
			printOrder(i-1);
		}
	}
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int f = scan.nextInt();
	printOrder(f);
}
}
