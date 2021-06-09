import java.util.Scanner;

public class StringOperations implements MathOptions {
	public static void mathOptions(Scanner scan, int opc) {
		System.out.println("Please choose an option");
		System.out.println("1.Substring");
		System.out.println("2.Contains");
		System.out.println("3.Lenght");
		opc = scan.nextInt();
		if(opc == 1) {
		System.out.println("Enter a sentence");
		String s = scan.next();
		System.out.println("Enter the index you would like your substring to begin at");
		int a = scan.nextInt();
System.out.println(s.substring(a));
	}else if(opc == 2) {
		System.out.println("Enter a sentence");
		String s = scan.next();
		System.out.println("Enter a leter to see if the sentence contains it");
		String c = scan.next();
		System.out.println(c.contains(c));
	}else if(opc==3) {
		System.out.println("Enter a sentence");
		String s = scan.next();
		System.out.println(s.length());
	}else {
		System.out.println("That is an invalid option");
	}
	
	}
}