package Io2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class One {
public static void main(String[] args) throws Exception {
	try {
		File file = new File("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\Ex1.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your text here:");
		String s = br.readLine();
		FileWriter fw = new FileWriter(file);
		fw.write(s);
		fw.close();
		br.close();
		System.out.println(s);
		
}catch(Exception e) {
	System.out.println("Exception");
}
}
}
