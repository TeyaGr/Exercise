
public class Methods {

	public static void main(String[] args) {
		welcome();
		multiply(5,10);
		multiply(5,100);
		multiply(10,10);
		multiply(15,10);
		multiply(20,10);
	divide(50,60);
	divide(600,60);
	String string = caps ("Shuting");
	String s = caps ("Get out of my car");

	System.out.println(string + s);
	int[] awesomeaRRAY = gimmeArrayFromInts(3,7,1);
	}
	public static void welcome () {
		System.out.println("Welcome to our calculator");
	}
	public static void multiply (int a , int b) {
		System.out.println ( a*b);
		
	}
	public static int divide ( int a , int b) {
		System.out.println(a/b);
		return a/b;
		
	}
	public static String caps (String s ) {
return s.toUpperCase();
}
	public static int [] gimmeArrayFromInts ( int a, int b, int c) {
		int [] array = new int [3];
		array[0] = a;
		array[1] = b;

		array[2] = c;
return array;
		
	}
}
