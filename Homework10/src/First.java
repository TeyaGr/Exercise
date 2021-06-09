import java.util.HashMap;

public class First {
public static void main(String[] args) {
	
	String [] s = {"Anna", "eat", "banana", "eat", "apple", "and", "banana"};
	HashMap<String,Integer> map = new HashMap <>();
	for(String i :s) {
		if (map.containsKey(i)) {
			map.put(i, map.get(i)+1);
		}
		else {
			map.put(i, 1);
		}
		
	}
	for ( String i:map.keySet()) {
		System.out.println("The word" + " " + i + " " + "appears" + " " + map.get(i)+ " " + " time(s) in this text");
	}
}
}
