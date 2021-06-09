package commons.Java;

public class Wrappers {
public static void main(String[] args) {
	
	Integer myInt = 5;
	System.out.println(myInt);
	System.out.println(myInt.intValue());
	
	Integer wi = 10;
	int i = 10;
	System.out.println(wi.floatValue());
	System.out.println(wi.lowestOneBit(1));
	System.out.println(wi.toString());
	System.out.println(wi.compareTo(i));
	System.out.println(i);
	
}
}
