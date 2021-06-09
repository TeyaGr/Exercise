import java.util.LinkedList;

public class ReverseList {
////A B C D
	// D C B
	public static void main(String[] args) {
		
		LinkedList<Character> list = new LinkedList<Character>();
		LinkedList<Character> result = new LinkedList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		System.out.println(list);
		for ( Character character :result) {
			if ( character != 'A'&& character != 'E') {
				System.out.println(character);
				result.addFirst(character);
			}
		}
		System.out.println(result);
	}
}
