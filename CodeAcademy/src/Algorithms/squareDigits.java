package Algorithms;

import java.util.Scanner;

public class squareDigits {
///123 = 9, 4
	static void digitsSquare( int num) {
		if(num==0) {
			return;
		}else {
			System.out.println(num%10*num%10);
			digitsSquare(num/10);
		}
			
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		digitsSquare(num);
	}
}
