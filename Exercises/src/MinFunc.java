
public class MinFunc {

	
	public static int minFunction ( int a, int b) {
		int min;
		if (a>b) {
			min = b;
		}else {
			min = a;
		}

		return min;
	}
	public static void maxFunction(int i, int j) {
		int max;
		if ( i>j) {
			max = i;
		}else {
			max=j;
		}System.out.println("The maximum number is " + max);
	}
	public static void main(String[] args) {
		
		
		System.out.println("The minimum value is " + " " + minFunction(10,12));
		maxFunction(25,38);
	}
}
