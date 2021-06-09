
public class DomashnaDva {

	public static void main(String[] args) {

		int a = 58;
		int b = 21;
		int c = 30;

		final int DIVIDER = 10;
		boolean IsDevisible = false;
		
		if (a % DIVIDER == 0) {
			IsDevisible = true;
			
		}
		System.out.println(IsDevisible);
		if ( b% DIVIDER == 0) {
			IsDevisible = true;
			
		}
		System.out.println(IsDevisible);
		if (c% DIVIDER==0){
			IsDevisible=true;
		
		}
		System.out.println(IsDevisible);
		

	}
}
