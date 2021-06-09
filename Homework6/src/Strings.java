import java.util.ArrayList;

public class Strings {
public static void main(String[] args) {
	
	ArrayList<String> str = new ArrayList<String>();
	str.add("hello");
	str.add("I'm a");
	str.add("String");
	str.add("welcome to");
	str.add("my program");
	for (int i=0;i<str.size();i++) {
		for(int x = 0;x <str.get(i).length();x++) {
			
		}
		System.out.println("The element is" + " " + str.get(i)+ " " + "And its size is " + " " + str.get(i).length());
	}
}
}
