
public class MinValue {
public static void main(String[] args) {
	
	int[] array = { 5, 7, 3, 9, 4, 5, 2, 1, 7, 8 };

	// sporedba na dva sosedni
	// prv element da e min

	// int min = array[0];
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < array.length; i++) {
		if (array[i] < min) {
			min = array[i];
		}

		if (array[i] > max) {
			max = array[i];
		}System.out.println("Minimum: " + min);
	System.out.println("Maximum: " + max);
	}

	
}
}
