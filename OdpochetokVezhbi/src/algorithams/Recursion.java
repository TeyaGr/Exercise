package algorithams;

public class Recursion {
public static void main(String[] args) {

System.out.println(factoriel(5));
dec(5);
digitsSum(12345);
squareRec(3);
square(4);
}


	public static int factoriel(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*factoriel(n-1);
		}
	}
public static void dec ( int n) {
	if(n<1) {
		return;
	}else {
		System.out.println(n);
		dec(n-1);
	}
	
}
/////12345 = 1+2+3+4+5
public static int digitsSum(int n) {
	if (n==0) {
		return 0;
	}else {
		System.out.println(n%10 + " ");
		return (n%10 + digitsSum(n/10));
	}
}
static int squareRec ( int n) {
	if(n==0) {
		return 0;
	}else {
		System.out.println(n*n);
		return squareRec(n-1);
	}
	}
	public static void square(int n) {
	if(n==0) {
		return;
	}else {
		System.out.println(n*n);
		square(n-1);
	}
	
}
}
