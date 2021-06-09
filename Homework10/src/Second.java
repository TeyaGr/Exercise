import java.util.HashMap;
import java.util.Scanner;

public class Second {
public static void main(String[] args) {
	
	HashMap <String, String> name = new HashMap<>();
	name.put("Eli", "eli@gmail.com");
	name.put("Tea", "tgrombanovska@yahoo.com");
	name.put("Martin", "mg@yahoo.com");
	name.put("Maja", "mai4kai@gmail.com");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name:");
	String s = scan.nextLine();
	if (name.containsKey(s)) {
		System.out.println(s  +" " + name.get(s));
	}else {
		System.out.println ( " The username does not exit");
	}
}
}

