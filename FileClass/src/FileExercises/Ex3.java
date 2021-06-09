package FileExercises;

import java.io.File;
import java.io.IOException;

public class Ex3 {
public static void main(String[] args) throws IOException {
	
	File f = new File("E:\\od desktop 25.03.20\\word\\Izvestaj.docx");
	System.out.println("Execute: " + f.canExecute());
	System.out.println("Read: " + f.canRead());
	System.out.println("Write: " + f.canWrite());
	System.out.println("Is it a directory?" + " " +f.isDirectory());
	System.out.println(f.getAbsoluteFile());
	System.out.println(f.getParent());
	System.out.println(f.getCanonicalPath());
	System.out.println(f.isHidden());
	System.out.println(f.getUsableSpace());
	System.out.println(f.getAbsoluteFile());
	System.out.println(f.listFiles());
 //File renamed = new File("E:\\od desktop 25.03.20\\word\\Bebuu.docx");
 //System.out.println(f.renameTo(renamed));
 System.out.println(f.getParent());
	
}
}
