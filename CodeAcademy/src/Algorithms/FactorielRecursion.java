package Algorithms;

import java.util.Scanner;

public class FactorielRecursion {
	///fact 3*2*1
	static int findFact ( int f) {
		if(f<1) {
			return 1;
		}else {
		return f*findFact(f-1);
		}
	}
	public static void main(String[] args) {
		
		int i = 5;
	System.out.println(findFact(i));	
	}
}