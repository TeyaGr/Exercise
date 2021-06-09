package PrimitivesAndReferences;

import java.awt.print.Book;


public class ObjectsAndArrays {
public static void main(String[] args) {
	

	
Book b = new Book();
Book c = new Book();
Book d = c;
readBook(b, d, d);

/////arrays
// i arrays se objekti 
int[] nums = new int[7];
nums[0] = 3;
nums[1] =6 ;
nums[2] = 9;
nums[3] = 12;
nums[4] = 15;
nums[5] = 18;
nums[6] = 21;
for ( Integer i : nums) {
	System.out.print(i+" ");
}



}

	public static  void readBook(Book d , Book b, Book c) {
		
		System.out.println("I have been read");
	
}
}