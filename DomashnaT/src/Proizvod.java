
public class Proizvod {

public static int MultiplyNumber(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n%10 * MultiplyNumber(n/10);
		}
}
public static void main(String[] args) {
	int i = 123;
	int j =234;
	int k = 893;

	System.out.println(MultiplyNumber(i));
	System.out.println(MultiplyNumber(j));
	System.out.println(MultiplyNumber(k));
}
}
