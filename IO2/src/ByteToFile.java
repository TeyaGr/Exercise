import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteToFile {
public static void main(String[] args) throws IOException {
	try {
	FileOutputStream fos = new FileOutputStream("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\ByteToFile.txt");
	fos.write(85);
	fos.write(44);
	fos.write(5);

	fos.close();
	System.out.println("Success");
	}
	catch (Exception e){
		System.out.println("Erroorrrr");
	}
		
	}
}


