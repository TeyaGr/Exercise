import java.io.File;

public class PDF {
public static void main(String[] args) {
	
	File f = new File("C:\\Users\\Tea\\Desktop\\java\\jj");
	File files[]= f.listFiles();
	for(File file:files) {
				if(file.isFile()&&file.getName().endsWith(".pdf")) {
					String name = file.getName();
					String ext = name.substring(0, name.lastIndexOf("."));
					File d = new File("C:\\\\Users\\\\Tea\\\\Desktop\\\\java\\" +ext);
				System.out.println("The new directory is created "+ " " + d.mkdirs()+ " " + " because of "+ " "+ file );
		}
	}			
	

}
}
