package Factory;

public class ComputerFactory {

	public static Computer getComputer(String type) {
		if(type.equals("PC")) {
			return new PC("2 GB", "500GB", "2.4GHz");
		}if(type.equals("Server")) {
			return new Server("16 GB", "2GB", "5.5GHz");
		} else {
			return null;
		
		}
	}
}
