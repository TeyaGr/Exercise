package FileExercises;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap11 {
public static void main(String[] args) {
	
	HashMap<String,String> up = new HashMap<>();
	up.put("Teai5ka", "5641");
	up.put("Teai5", "564");
	up.put("Tea", "233889");
	up.put("TMakalo", "Makarska");
	up.put("LetiBudva", "ZimiKop");
	HashMap <String,String> map = new HashMap<>();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Kolku useri kje vnesete? ");
	int input = scanner.nextInt();

	for (int i = 0; i < input; i++) {
		System.out.println("Vnesi username ");
		String s = scanner.next();
		// proveruvame dali ima user so takov username
		if (map.containsKey(s)) {
			System.out.println("Vnesi password ");
			String pass = scanner.next();
			// proveruvame dali vneseniot password e ist so value to za toj user
			if (pass.equals(map.get(s))) {
				System.out.println("Uspeshno se najavivte! :)");
			} else {
				System.out.println("Vnesovte pogreshen password! :(");
			}
		} else {
			System.out.println("Nema korisnik so takvo username! :/");
		}
	}
}
}