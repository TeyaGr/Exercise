
public class Pen {

	String type = "gel";
	String color = "blue";
	int point = 10;
	
	static boolean clicked = true;
	public static void click (){
		clicked = true;
	}
	public static void unclicked() {
		clicked = false;
	}
			
}
