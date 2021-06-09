
public class IfElse {
public static void main(String[] args) {
	
	String str1 = ("hello friend");
	String str2 = ("my fav. colour is pink");
	int string1 = str1.length();
	int string2 = str2.length();
	
	if(str1.length()>str2.length()) {
		System.out.println("The longer string is: " + str1);
	}
	else if(str1.length()<str2.length()) {
		System.out.println("The longer string is:" + str2);
	}
	else {
		System.out.println("Both strings are equal length");
		
	}
}
}
