import java.util.HashSet;
import java.util.Iterator;

public class HashBownhies {
public static void main(String[] args) {
	
	HashSet<String> h = new HashSet<>();
	h.add("Orange");
	h.add("Red");
	h.add("Blue");
	System.out.println(h);
	Iterator<String> i = h.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
}
	}
}
