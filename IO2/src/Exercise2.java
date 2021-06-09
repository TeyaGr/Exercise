import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise2 {
public static void main(String[] args) throws IOException {
	
	FileOutputStream fos = null;
	FileInputStream fis = null;
	try {
		fis = new FileInputStream("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\ByteToFile.txt");
		fos = new FileOutputStream("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\output.txt");
		int c=fis.read();
		while(c!= -1) {
			System.out.println(c + " " +(char)c);
			fos.write(c);
			
		}
		
	}catch(Exception e ) {
		System.out.println("Exception");
	
		}finally {
	if(fis!=null) {
		fis.close();
	}
	
}
}
}
