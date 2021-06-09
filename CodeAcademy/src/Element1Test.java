
public class Element1Test {

	
	public static void main(String[] args) {
		String value = "Oxygen";
		
		boolean contains = false;
		
		for (Element1 e:Element1.values()) {
	if(e.getName()==value) {
		
		System.out.println(e.name()+e.getName());
		contains = true;
		break;
		
	}else {
		System.out.println(e.name()+e.getName());
		contains = false;
	}
System.out.println(contains);
}

}
}