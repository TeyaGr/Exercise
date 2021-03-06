package CodeAcCalc;

import java.util.Scanner;

public class StringOperations implements InputOptions {
	public void inputOp(Scanner scan, int choice) {
		System.out.println("Choose an option");
		System.out.println("1.Substring");
		System.out.println("2.length");
		System.out.println("3. Check if it contains a letter");
		 choice = scan.nextInt();
		System.out.println("You can enter your sentence now");
		String s = scan.next();
	}
	
	private void SwitchOperations (String s, int choice , Scanner scan) {
		switch(choice) {
		case 1:
			System.out.println("Where should the substring start ");
			int i = scan.nextInt();
			System.out.println(findSubstring(s,i));
			break;
		case 2:
			System.out.println(findLength(s));
			break;
		case 3:
			System.out.println(contains(s,scan));
		}
		
	}
	
	
	
	private String findSubstring (String s,int i) {
		
		String sub = s.substring(i);
		return sub;
	}
	private int findLength ( String s) {
		int length = s.length();
		return length;
	}
	private boolean contains ( String s, Scanner scan) {
		System.out.println("Enter your character");
		String c = scan.next();
		boolean contains = s.contains(c);
		return contains;
	}
}
