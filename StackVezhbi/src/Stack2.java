import java.util.Stack;

public class Stack2 {
public static void main(String[] args) {
	Stack <String>games = new Stack <String>();
	games.add("Call of duty ghost");
	games.add("Guitar hero");
	games.add("Super monkey ball");
	System.out.println ( games.pop());
	System.out.println ( games);
	System.out.println ( games.pop());
	System.out.println ( games);
	System.out.println ( games.peek());
	////////////////////
	Stack <Character>tower = new Stack <Character>();
	tower.add('R');
	tower.add('B');
	tower.add('Y');
	System.out.println (tower.peek());
	System.out.println (tower.contains('b'));
	System.out.println (tower.get(0));
	System.out.println (tower.get(2));
	System.out.println (tower.set(1,'Y'));
	System.out.println (tower.size());
	;
}
}
