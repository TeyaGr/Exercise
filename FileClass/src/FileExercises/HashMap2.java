package FileExercises;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap2 {
public static void main(String[] args) {
	
	HashMap<String,Integer> map = new HashMap<>();
	Scanner s = new Scanner(System.in);
	String st=s.next();
	String[] array = st.split("");
	for ( String key : array) {
		if(map.containsKey(key)) {
			map.put(key, map.get(key)+1);
		}else {
			map.put(key, 1);
		}
	}
	for(String key:map.keySet()) {
		System.out.println(key + map.get(key));
	}
}
}
