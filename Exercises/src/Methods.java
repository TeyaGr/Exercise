
public class Methods {

	
	public static void main(String[] args) {
		
		welcome();
		multiply (50,38);
		multiply (36,550);
		multiply(28,38);
		devide(10,15);
		sum(5, 10);
		}
	public static void welcome() {
	System.out.println("Welcome to my calculator");
	}
public static void multiply(int a, int b) {
			System.out.println (a*b);
	}

	public static void devide(int a, int b) {
	System.out.println(a/b);	
	
	}
	public static int sum ( int m, int n) {
		int c = m+n;
		
		System.out.println(c);
		return c;
	}
	}


