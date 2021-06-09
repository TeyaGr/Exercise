import java.util.ArrayList;

public class SumOfElements {


	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(1);
		list.add(15);
		list.add(2899);
		list.add(1200);
		int sum=0;
		for( int i =0;i<list.size();i++) {
			sum+=list.get(i);
		}
		System.out.println(sum);
	}
}
