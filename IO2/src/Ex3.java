import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex3 {
public static void main(String[] args) {
	try {
		byte []bytes = {65,66,67,68,69};
				FileOutputStream fos = new FileOutputStream("C:\\Users\\Tea\\Desktop\\java\\jj\\IO\\io2\\ByteToFile.txt");
				for(int i =0;i<bytes.length;i++) {
					fos.write(i);
				}
				fos.close();
				FileInputStream fis = new FileInputStream ("C:\\\\Users\\\\Tea\\\\Desktop\\\\java\\\\jj\\\\IO\\\\io2\\\\ByteToFile.txt");
				int size = fis.available();
				for(int i =0;i<bytes.length;i++) {
					System.out.println((char)fis.read()+ " ");
				
}
fis.close();

}catch(Exception e) {
	System.out.println("Error");
}
}
}
