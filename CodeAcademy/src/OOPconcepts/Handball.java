package OOPconcepts;

public class Handball extends Sport{
	
	public void getMessage() {
		System.out.println("Its handball tiimemee");
	}
	public static void main(String[] args) {
		Handball player = new Handball();
    player.getMessage();
	}
	
}
