package Metodi;

public class Homework2Ex1 {

	public static int findLength( String s) {
		int length = s.length();
		return length;
	}
	public static String subString (String s) {
		String sub = s.substring(3);
		return sub;
	}
	public static boolean containsF (String s) {
		boolean contains = s.contains("f");
		return contains;
	}
	public static void contains(String s) {
		boolean contains = s.contains("I");
		System.out.println(contains);
	}
	public static void main(String[] args) {
		String s = "Hello, I am a String!";
		System.out.println(findLength(s));
		System.out.println(subString(s));
		System.out.println(containsF(s));
		contains(s);
	}

		
	
}
