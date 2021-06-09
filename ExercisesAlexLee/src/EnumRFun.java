

enum levels{
	LOW, MEDIUM, HIGH;
	}

public class EnumRFun {
	enum Flavor{
		VANILLA, CHOCOLATE, STRAWBERRY;

		void getVanilla() {
			System.out.println(Flavor.VANILLA);
			// TODO Auto-generated method stub
			
		}
	
	}
public static void main(String[] args) {
	
	levels l = levels.LOW;
	System.out.println(levels.MEDIUM);
	System.out.println(l);
	switch (l) {
	case LOW:
	System.out.println("Low level");
	break;
	case MEDIUM:
	System.out.println("Medium level");
	break;
	case HIGH:
	System.out.println("High level");
	break;
	}
	Flavor f = Flavor.CHOCOLATE;
	System.out.println(f);
	f.getVanilla();
	
}
}
