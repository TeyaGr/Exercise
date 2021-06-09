import java.util.HashMap;
import java.util.Scanner;



public class HashMapCounter {
	public static void main(String[] args) {
		// banana
		// b - 1
		// a - 3
		// n - 2
		// 1. string vo array
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("Add your word");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String[] array = s.split("");

		// bukva po bukva
		for (String key : array) {
			// dali vo mapata ja ima taa bukva
			if (map.containsKey(key)) {
				// map.put kje napravime update
				// map.get(key) ni vrakja value
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}

			/*
			 * if (!map.containsKey(key)) { map.put(key, 1); } else { map.put(key,
			 * map.get(key) + 1); }
			 */
		}

		for (String key : map.keySet()) {
			System.out.println("Key: " + key + " Value: " + map.get(key));
		}

	}
}