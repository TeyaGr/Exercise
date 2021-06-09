import java.io.File;

public class Happy {
public static void main(String[] args) {
	
	File f = new File("C:\\Users\\Tea\\Desktop\\java\\library (1)\\library");
	File files[]= f.listFiles();
	for(File file : files) {
		if(file.canExecute()&& file.canRead()&& file.canWrite()) {
			System.out.println(file.getName()+ " "+"Happy");
		}
	}
}
}
