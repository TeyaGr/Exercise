
public class Generici {
public static void main(String[] args) {
	
	Integer[ ] i = {1,2,3,4,5};
	Character[] c = {'T','E','A'};
	printMe(i);
	printMe(c);
}
	public static <T> void printMe(T[] x) {
		for(T t:x) {
			
			System.out.printf("%s",t);
		}
		System.out.println();
	}
}
