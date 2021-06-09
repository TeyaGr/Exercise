import java.util.HashMap;

public class HashMapTest {
public static void main(String[] args) {
	
	HashMap <String,Integer> test = new HashMap <>();
	test.put("Tea", 1);
	test.put("Tea2", 2);
	test.put("Tea3", 3);
	test.put("Tea4", 4);

for(String i : test.keySet()) {
	System.out.println(i +test.get(i));
}
			}
}
