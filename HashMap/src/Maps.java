import java.util.HashMap;

public class Maps {
public static void main(String[] args) {
	// prviot Integer se odnesuva na klucot, vtoriot na value-to
	HashMap<Integer,Integer> map = new HashMap<>();
	// kew i value mozhe od razlicen tip da se ne mora dvete integer
	HashMap<Integer,String> map2 = new HashMap<>();

	for ( int i = 1; i<=10; i ++) {
		map.put(i, i);
		System.out.println(map);
	}
	for(Integer i : map.keySet()) { // map.keySet ni gi vrakja site buckets(parovi) od mapata
		System.out.println("Key:"+ i + " Value:"+ map.get(i));
	}
	for(Integer i:map.keySet()) {
		System.out.println(i);
		
	}
	for(Integer i:map.values()) {
		System.out.println("Value:" +"" +i);
}
	
	////////////////////////////////////////////////////////////////////////////
	
	map2.put(2, "Maloposle");
	map2.put(2, "Maloposle");
	map2.put(3, "hello");
	map2.put(3, "pucki");
	map2.put(6, "kdemce");
	for(Integer i :map2.keySet()) {
		System.out.println(i+map2.get(i));
	}
	for (String s :map2.values()) {
		System.out.println(s);

	}
}
}
