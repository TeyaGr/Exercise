import java.util.Stack;
public class Palindrome {
public static void main(String[] args) {
	
	/// zbor sho se chita isto od napred i pozadi
	//12321
	//abccba
	
	Stack<String> stack = new Stack<String>();
	String s = "elile";
	// niza od stringot
	String [] array = s.split("");
	// stavame vo stack
	 for ( String string:array) {
		 stack.push(string);
		 
	 }
	 // kreirame reverse string so vadenje od stack
	 
	 String tmp = "";
	 while ( !stack.isEmpty()) {
		 tmp +=stack.pop();
	 }
	 // sporeduvame 
	 System.out.println (tmp.equals(s));
}
}
