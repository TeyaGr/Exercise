
public class Static {
//int a = 5;
	static int a = 5;
	static int month = 12; // konstanta, ne se menja nikad, taka mozheme da ja koristime vo site metodi
public static void main(String[] args) {
	
	int b = 10;
	//System.out.println(a+b);//  dava greshka, nemozhe da kompajlira promenliva shto ne e static
	
//	Static s = new Static(); // mora da se sozdade objekt Static za da se dojde do a
//	System.out.println(s.a + b);
	// ili ednostavno se koristi zborcheto static
	
	System.out.println ( a);
	System.out.println("There are "+ " " + month + " " + " months in a year");
}
}
