
public class SingleObject {

	private static SingleObject  object = new SingleObject();
	private SingleObject(){
	}
	static SingleObject getInstance() {
		return object;
	}
	public void getMessage() {
		
		System.out.println("Hello, Im a singleton object");
	}
}
