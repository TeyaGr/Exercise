package Algorithms;

import java.util.Scanner;

public class SquareRecurs {
	
	
	
	////3 = 9 4 1
	////3*3+(3-1*3-1) itn
	static void squareRecursive ( int num) {
		if(num==1) {
			System.out.println(num);
		}else {
			System.out.println(num*num);
		squareRecursive((num-1));
		}
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	squareRecursive(num);
	
}
}


