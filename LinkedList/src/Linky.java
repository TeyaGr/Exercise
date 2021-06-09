import java.util.LinkedList;

public class Linky {
public static void main(String[] args) {
	
	LinkedList linky = new LinkedList();
	linky.add("Rob");
	linky.add("Hose");
	linky.add("Alex");
	System.out.print(linky.getFirst());
	System.out.println(linky);
	System.out.println(linky.getFirst());
	System.out.println(linky.contains("o"));
	System.out.println(linky.removeLast());
	System.out.println(linky.removeLastOccurrence("e"));
	linky.add(1);
	linky.add(76);
	linky.add(55);
	System.out.println(linky);
}

}
