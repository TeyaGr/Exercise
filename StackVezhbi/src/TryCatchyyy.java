import java.util.Scanner;

public class TryCatchyyy {
public static void main(String[] args) {
	try {
	int[] i= {1,2,3};
	System.out.println(i[1]);
	}catch(Exception e) {
		System.out.println("That code wont work sorry");
	}try {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = scan.nextInt();
	System.out.println(n);
	}catch(Exception e) {
		System.out.println("pls enter a number");
	}try {
	int[] array = {1,2};
	System.out.println(array[4]);
	}catch(NullPointerException e) {
		System.out.println("null");
	}
}
}
