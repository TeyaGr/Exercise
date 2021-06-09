
public class Split {
public static void main(String[] args) {
	
	String s = "Banana - Apple - Orange - Pear";
	String fruits [] = s.split("-");
	for (String string : fruits) {
	System.out.println(string);
}
	
	///// so ogranichuvachki delimetar
	
	String str = "Banana - Apple - Orange - Pear - Watermelon- melon- oreocookies?";
	String fruits2 [] = str.split("-", 6);
	for (String string : fruits2) {
	System.out.println(string);
}
}
}