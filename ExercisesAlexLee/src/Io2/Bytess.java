package Io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Bytess {
public static void main(String[] args) throws FileNotFoundException {
	try {
	byte[] Bytes = {65,66,67,68,69};
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\Ex1.txt");
	for(int i =0;i<Bytes.length;i++) {
		fos.write(Bytes[i]);
	}
	fos.close();
	FileInputStream fis = new FileInputStream("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\Ex1.txt");
	int size = fis.available();
	for(int i = 0;i<size;i++ ) {
		System.out.println((char)fis.read());
	}
	fis.close();
}
	catch(Exception e) {
		
	}
}
}