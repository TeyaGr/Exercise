import java.util.HashMap;

public class Proba {
public static void main(String[] args) {
	
	String [] s = {"Anna", "eat", "banana", "eat", "apple", "and", "banana"};
	HashMap<String,Integer> map = new HashMap <>();
	for(String i :s) {
			map.put(i, map.get(i)+5);
		
		
	}
	for ( String i:map.keySet()) {
		System.out.println(i+ map.get(i));
	}
}
}