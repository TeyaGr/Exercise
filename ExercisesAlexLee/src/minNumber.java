
public class minNumber {

	
	public static int minNumber ( int n1, int n2) {
		int min = 0;
		if (n1>n2) {
			min=n2;
		}else if (n2>n1) {
			min=n1;
		}else {
			System.out.println ( "The numbers are even");
		}
		return min;
	}
	public static void main(String[] args) {
		
		int min = minNumber(5,5);
		System.out.println(min);
	}
}
