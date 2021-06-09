import java.util.LinkedList;

public class First {
public static void main(String[] args) {
	
	LinkedList <String> list= new LinkedList<>();
	String s = "Hello dear students. My name is Code Academy";
	String[] st = s.split(" ");
	for(String string:st) {
		System.out.println(string);
		if(string.length()%3==0) {
			list.addFirst(string);
		}else {
			list.addLast(string);
	}
	
	}System.out.println(list);
}
}

