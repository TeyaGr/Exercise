import java.util.ArrayList;

public class ArrayOne {
public static void main(String[] args) {
	
	ArrayList<Integer> evenPos = new ArrayList<>();
	evenPos.add(1);
	evenPos.add(5);
	evenPos.add(6);
	evenPos.add(12);
	evenPos.add(33);
	Even(evenPos);
	Sum(evenPos);
}
		public static void Even(ArrayList<Integer> list) {	
	for ( int i = 0; i<list.size();i++) {		
		if(list.get(i)%2==0){
			System.out.println(list.get(i));
		}
	}
		}
	public static void Sum(ArrayList<Integer> list) {
		int sum = 0;
		for(Integer in : list) {
			sum+=in;
			System.out.println(sum);
	}
	}
}
