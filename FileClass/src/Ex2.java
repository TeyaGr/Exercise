import java.io.File;
import java.util.Scanner;

public class Ex2 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	File dir = new File (s);
	
	if(dir.exists()) {
		System.out.println("A directory with that name already exists");
		
	}else {
		dir.mkdir();
		System.out.println("Our new directory is "+ " "+ dir.getName());
	}
}
}
