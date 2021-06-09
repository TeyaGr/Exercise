import java.util.HashMap;

public class MapSquare {

	public static void main(String[] args) {
		
		HashMap <Integer, Integer> square = new HashMap<>();
		int [] array = {1,2,3,4,5,6,7,8};
		
		for (Integer i :array) {
			square.put(i, i*i);
			
		}
		for (Integer i :square.keySet()) {
			System.out.println ( " Key: "+ i + "and its square"+ square.get(i));
	}
}
}