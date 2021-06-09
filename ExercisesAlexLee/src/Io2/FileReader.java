package Io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReader {
public static void main(String[] args) throws IOException {
//	File f = new File("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\Exercise1.java");
	//System.out.println(f.getName());
//	System.out.println(f.canRead());
	//System.out.println(f.canWrite());
	//System.out.println(f.getAbsolutePath());
	//System.out.println(f.getFreeSpace());
	//System.out.println(f.getUsableSpace());
	//Scanner scan = new Scanner(f);
////
	//while(scan.hasNext()) {
			//System.out.println(scan.nextLine());//
	
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\Ex1.txt");
	FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Tea\\\\Desktop\\\\java\\\\jj\\\\IO\\\\io2\\\\Ex1.txt");
	//PrintWriter pw = new PrintWriter(fos);
	//pw.println("Ke naucam li nekad ova aaaa");
	//pw.close();
	fos.write(6);
	fos.write(5);
	fos.close();
	try {
	
	System.out.println((char)fis.read());
	while(fis.read()!= -1) {
		int c= fis.read();
		fos.write(c);
		System.out.println((char)c);
	}
	}
	catch(Exception e ) {
		System.out.println("weong");
	}finally {
	if(fis!=null) {
		fis.close();
	
	}if(fos!=null) {
		fos.close();
	}
	}
}
}
