package FileExercises;

import java.io.File;

public class Ex6 {
public static void main(String[] args) {
	
	File d = new File("E:\\P90X - Extreme Home Fitness Exercise Complete Workout");
File files[] = d.listFiles();
for(File file:files) {
	if(file.isFile()) {
		String name = file.getName();
		String ext = name.substring(name.lastIndexOf(".")+1);
		File f = new File("E:\\P90X - Extreme Home Fitness Exercise Complete Workout"+"\\"+ext);
	if(f.exists()) {
		System.out.println("That file already exists");
	}else {
		System.out.println("New directory is created "+ f.mkdirs()+"because of this file "+file);
	}
}
}
}
}