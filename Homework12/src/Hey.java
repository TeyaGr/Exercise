import java.io.File;

public class Hey {
public static void main(String[] args) {
	File f = new File("C:\\Users\\Tea\\Desktop\\java");
	File files[] = f.listFiles();
	for( File file:files) {
		if(file.exists()&&file.isDirectory()) {
			File d = new File("C:\\\\Users\\\\Tea\\\\Desktop\\\\java"+ file.getName()+"\\Hey");
			System.out.println(d.mkdirs());
			
		}
	}
}
}
