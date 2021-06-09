import java.util.Scanner;

public class IfElse {
public static void main(String[] args) {
	/*
	Scanner grade = new Scanner (System.in);

	System.out.println("What is your score?" );
		int a= grade.nextInt();
	if(a>=91&& a<100) {
		System.out.println("You got an A");
	} else if(a<91&&a>=51) {
		System.out.println("You got a c");
		
		
	}else {
		System.out.println("You failed");
	}
	*/
	// Comparason operators
	

	
	Scanner com = new Scanner(System.in) ;
	System.out.println("Your first number is:");
	int i = com.nextInt();
	System.out.println("Your second number is:");
	int j = com.nextInt();
	boolean b = i!=j;
	System.out.println(b);
	
}
}
