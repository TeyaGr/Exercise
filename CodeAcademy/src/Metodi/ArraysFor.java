package Metodi;

public class ArraysFor {
public static void main(String[] args) {
	
	int [] numbers = {3,10,14,15,40,77,80};
	for(int i = 0;i<numbers.length;i++) {
		if(numbers[i]%3==0) {
			System.out.println(numbers[i]);
			
		}
		
			System.out.println(numbers[i]);
	}
	System.out.println("------------------------");
	///////
	evenNumbers(numbers);
	biggerIndex(numbers);
}
static void evenNumbers (int[] a) {
	for(int i = 0;i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.print(a[i]+" ");
		}
	}
	
}
static void biggerIndex(int[] a) {
	for(int i = 0;i<a.length;i++) {
		if(i>a[i]) {
			System.out.println(a[i]);
		}
	}
}
}

	

