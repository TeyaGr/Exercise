import java.util.HashSet;

public class Compare {
public static void main(String[] args) {
	
	HashSet<Integer> set1 = new HashSet<>();
	HashSet<Integer> set2 = new HashSet<>();

	int[] array1 = { 1, 1, 2, 3, 1, 4, 5, 6, 5, 6, 8, 9, 10 };
	int[] array2 = { 1, 1, 2, 3, 1, 4, 5, 6, 5, 6};
	
	for ( Integer i : array1) {
		set1.add(i);
	}
	for ( int i : array2) {
		set2.add(i);
	}
	if ( set1.equals(set2)) {
		System.out.println("The sets are equal");
	}else {
		System.out.println("The sets are not equal");
	}
	System.out.println(set1.containsAll(set2) && set2.containsAll(set1));
}
}
