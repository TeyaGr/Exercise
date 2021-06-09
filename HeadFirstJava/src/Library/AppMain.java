package Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AppMain {
public static void main(String[] args) {
	
	
	HashMap<String,String> studentCredentials = Servise.getAllStudentsCredentials();
	Scanner s = new Scanner(System.in);
	System.out.println("Vnesi user");
	String user = s.next();
	if(studentCredentials.containsKey(user)) {
		System.out.println("Vnesi password");
		String pass = s.next();
		if(studentCredentials.get(user).contains(pass)) {
			System.out.println("Uspeshno se najavivte!!");
			HashMap<Integer,ArrayList<Book>> map = Servise.getBooks(s);
			System.out.println(map.toString());
		}
	}else {
		System.out.println("Neuspeshno se najavivte, nevalidni user i password");
	}
}


}

