package commons.Java;

import java.util.Scanner;

public class Skeneri {
public static void main(String[] args) {
	
	Scanner s = new Scanner (System.in);
	System.out.println("Enter a username");
	String username = s.nextLine();
	System.out.println("Hello "+" "+username);
}
}
