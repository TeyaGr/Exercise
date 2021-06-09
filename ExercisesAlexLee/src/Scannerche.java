import java.util.Scanner;
public class Scannerche {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Welcome to out year book, what is your name?");
	String name = scan.next();
	System.out.println("How old are you?");
	int age = scan.nextInt();
	System.out.println("What would you like to put as your yearbook quote?");
	String quote = scan.next();
	quote+=scan.nextLine();
	System.out.println(name + age  + quote);
}
}
