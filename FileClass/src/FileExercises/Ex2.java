package FileExercises;

import java.io.File;

public class Ex2 {
public static void main(String[] args) {
	File f = new File("E:\\od desktop 25.03.20\\word\\Tei4ka.docx");
	if ( f.exists()) {
		System.out.println("That directory already exists");
	}else {
		System.out.println(f.mkdir());
	}
	System.out.println(f.getName());
	System.out.println(f.getAbsolutePath());
	System.out.println(f.getParent());
}

}
