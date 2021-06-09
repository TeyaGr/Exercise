package Generics;

public class GenericMethd {

	public static <E> void printArray(E[] someArray) {
		for (E e : someArray) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		printArray(intArray);
		Character [] charArray = {'a','b','c','d'	};
		
		printArray(charArray);
		String[] strArray= {"Hello","It's","Me"};
		printArray(strArray);
}
}