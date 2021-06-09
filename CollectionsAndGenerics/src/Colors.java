import java.util.ArrayList;

public class Colors {
public static void main(String[] args) {
	
	
	ArrayList<String> colors = new ArrayList<String>();
	colors.add("Pink");
	colors.add("Blue");
	colors.add("Red");
	colors.add("Peach");
	colors.add("Beige");
	System.out.println(colors);
	////vtor nachin na pechatenje
	for ( String color:colors) {
		System.out.println(colors);
	}
	// vmetnuvanje element na daden index
	
	colors.add(3, "black");
	System.out.println(colors);
	colors.remove(5);
	System.out.println(colors);
	//retrieve an element of a specific index
	System.out.println(colors.get(4));
	
	
}
}
