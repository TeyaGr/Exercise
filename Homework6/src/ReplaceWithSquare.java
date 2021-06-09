import java.util.ArrayList;

public class ReplaceWithSquare {

	public static void main(String[] args) {
		
		ArrayList<Integer> sq = new ArrayList<Integer>();
		sq.add(25);
		sq.add(3);
		sq.add(5);
		sq.add(2);
		sq.add(4);
		for(int i:sq) {
			int square  = 0;
			square = sq.get(i)*sq.get(i);
			// ne znam tuka zalaviv malce kako dda go smenam i isprintam
		}
		
		
	}
}
