
public class Employee extends Human {

	protected String position;
	
	public Employee() {
		super(); // so ova se prstapba do objektite od parent klasata
	}
	
	public Employee( String position) {
		this.position = position;
	}
}
