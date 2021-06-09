
public class MethodString {

	public static int stringLenght(String s) {
		s = "Hello I'm a string ";
		return s.length();
	}
	public static String subString( String s) {
		return s.substring(2);
	}
	public static boolean contains ( String s) {
		return s.contains("f");
	}
	public static void main(String[] args) {
		String s = "Hello i'm a string ";
		System.out.println(stringLenght(s));
		System.out.println(subString(s));
		System.out.println(contains(s));
	}
}
