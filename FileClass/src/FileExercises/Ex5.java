package FileExercises;

import java.io.File;

public class Ex5 {
public static void main(String[] args) {
	
	File d = new File("E:\\od desktop 25.03.20\\word");
	File files[]= d.listFiles();
	long sum = 0;
	for(File file :files) {
		if ( file.isFile()&& file.getName().endsWith("docx")) {
			sum+=file.length();
			
		
		}
	}
	System.out.println("The sum od the word files for that directory is "+ " "+ sum);
}
}
