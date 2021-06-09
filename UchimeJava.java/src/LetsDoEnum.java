
public class LetsDoEnum {

	enum Flavors{
		CHOCOLATE, VANILA, STRAWBERRY;
	}
	public static void main(String[] args) {
		
		Flavors f = Flavors.CHOCOLATE;
		
		if(f == f.CHOCOLATE) {
			System.out.println("Chocolate");
			
	}

	}
}
