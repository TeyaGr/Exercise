package Io2;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two extends Homewonr13 {
public static void main(String[] args) throws IOException {
	try {
	File file = new File ("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\Ex1.txt");
	BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
	System.out.println("Enter the new location");
	File f= new File(bf.readLine());
	if(f.isDirectory()&&f.exists()) {
	System.out.println("The new file location is:"+"\""+f+"\\Ex1.txt\"");
	}else {
		System.out.println("Please enter a valid location");
	}
}catch(Exception e ) {
	System.out.println("Exception");
}
}
}
