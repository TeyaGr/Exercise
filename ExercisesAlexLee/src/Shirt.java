// learning about constuctors
public class Shirt {
 public static int size;
 public static String color;
 
	Shirt(int newSize, String newColor){
		size = newSize;
		color = newColor;
	}
	public static void putOn() {
		System.out.println("Shirt is on");


	}
	public static void putOff() {
		System.out.println("Shirt is off");
	}
	public static void Display() {
		System.out.println(size + color);
	}
}
