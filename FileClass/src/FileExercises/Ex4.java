package FileExercises;

import java.io.File;

public class Ex4 {
	File directory = new File("E:\\od desktop 25.03.20\\word");
	long sum = 0;

	File[] files = directory.listFiles();{
	//File can be file
	//File can be directory
	for (File file : files) {
		if (file.isFile() && file.exists()) {
			System.out.println("File " + file.getName() + " " + file.length());
			sum += file.length();
		} else {
			System.out.println("File " + file.getName() + " is directory");
		}
	}

	System.out.println("Sum " + sum);

}
}