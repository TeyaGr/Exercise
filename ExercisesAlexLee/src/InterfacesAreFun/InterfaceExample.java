package InterfacesAreFun;
interface WaterBottle {
	String color = "Blue";
	
	void fillUp();
		
	
}
public class InterfaceExample implements WaterBottle{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(color);
		
	}

	@Override
	public void fillUp() {
		// TODO Auto-generated method stub
		
	}

}
