
public class SquareOfDigits {
	public static int sod(int n) {
		if (n == 0) {
			return 0;

		} else {
      System.out.println((n%10)*(n%10));
		return	sod(n/10);
      
		
		}
		
	}


public static void main(String[] args) {
	
int a=123;
int b=345;

System.out.println(sod(a));
System.out.println();
System.out.println(sod(b));

}
}