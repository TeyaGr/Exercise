import java.util.HashSet;
import java.util.Iterator;

public class HashNum {
public static void main(String[] args) {
	
	HashSet<Integer> h = new HashSet<>();
	HashSet<Integer> s = new HashSet<>();
	int [] array = {1,2,5,5,6,7,8,9,10};
	Iterator<Integer> it = h.iterator();
	for(Integer i :array) {
		h.add(i);
	}
	System.out.println(h);
		for(int i=1;i<11;i++) {
			s.add(i);
		}
		
		System.out.println(s);
	}

}
