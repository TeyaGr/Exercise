package FileExercises;

import java.io.File;

public class Ex1 {
public static void main(String[] args) {
	
	File file = new File("E:\\od desktop 25.03.20\\word\\Izvestaj.docx");
	System.out.println(file.getName());
	System.out.println(file.canRead());
	System.out.println(file.canWrite());
	
}
}
