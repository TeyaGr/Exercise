package Metodi;

public class MethodExample {

	//Metod koj ke naogja koj broj e pogolem
	public static int biggerNum(int a, int b) {
		int bigger=0;
		if(b>a) {
		bigger = b;
		
	}else if(a>b) {
		bigger = a;
	}else {
		System.out.println("The numbers are equal");
	}
		return bigger;
}
	public static void main(String[] args) {
		System.out.println(biggerNum(3,5));
	}
}