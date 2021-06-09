
public class Inherit {
public static void main(String[] args) {
	
	Mouse1 m1 = new Mouse1();
	m1.leftClick();
	Mouse2 m2 = new Mouse2();
	Mouse3 m3 = new Mouse3();
	System.out.println(m3.leftClick());
	
}
}
