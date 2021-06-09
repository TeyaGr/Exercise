import java.io.File;

public class Ex4 {
public static void main(String[] args) {
	
	File directory = new File("C:\\Users\\Tea\\Desktop\\java\\algorithams");
	long sum=0;
	File[] files = directory.listFiles();
	for (File file:files) {
		if(file.isFile()) {
			sum+=file.length();
		}else {
			System.out.println("File "+ " " + file + " " + "is directory");
			
		}
		System.out.println("Sum"+sum);
	}
}
}
