
public class Squared {

	public static int Square(int n) {

		if (n == 0) {
			return 0;
		} else {
			System.out.println(n + "*" + n + "=" + (n * n));
			return Square(n - 1);

		}
	}

	public static void main(String[] args) {

		int a = 3;
		int b = 5;
		System.out.println(Square(a));
		System.out.println();
		System.out.println(Square(b));
	}


}
