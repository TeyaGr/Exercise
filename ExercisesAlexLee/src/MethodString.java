
public class MethodString {
public static void main(String[] args) {
	
	String str = "Hello I am a string";
	System.out.println(getLenght(str));
	System.out.println(contains(str));
	System.out.println(getSubstring(str));

}
	
	
	
	public static int getLenght(String s) {
		return s.length();
	}
	public static boolean contains ( String s) {
		return s.contains("f");
	}
	public static String getSubstring ( String s) {
return s.substring(3);
}
}