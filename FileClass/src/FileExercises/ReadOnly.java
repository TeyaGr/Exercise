package FileExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadOnly {
public static void main(String[] args) throws FileNotFoundException {
	
	File f = new File("C:\\Users\\Tea\\Desktop\\java\\library (1)\\library\\Author.java");
	Scanner s = new Scanner(f);
	System.out.println(s.nextLine());
	while(s.hasNextLine()) {
		System.out.println(s.nextLine());
	}
}
}
