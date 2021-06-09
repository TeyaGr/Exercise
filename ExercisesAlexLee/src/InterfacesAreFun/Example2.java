package InterfacesAreFun;

public class Example2 implements Interface{
public static void main(String[] args) {
	
	Example2 i = new Example2();
	System.out.println(i.flavor);
	i.openBag();
}
	@Override
	public void openBag() {
		System.out.println("The bag is opened");
		
		

	}

}
