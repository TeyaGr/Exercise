import java.util.ArrayList;

public class EvenPosition {

	
	static void printEvenPosition(ArrayList<Integer> num) {
		for (int i = 1;i<num.size();i++) {
			if(i%2==0) {
				
				System.out.println(num.get(i));
			}
		}
			}

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(22);
		num.add(8);
		num.add(13);
		num.add(255);
		num.add(155);
		num.add(88);
		printEvenPosition(num);
		
	}
}
