package PersonVezhba;

public class Person {

	private String name;
	private String lastname;
	private int years;
	private Proffesion proffesion;
	
	public Person() {

	}

	public <Proffesion> Person(String name, String lastname, int years, PersonVezhba.Proffesion proffesion) {
		this.name = name;
		this.lastname = lastname;
		this.years = years;
		this.proffesion =  proffesion;
	}
	public String toString() {
		return name+lastname+years+proffesion;
	}
}
