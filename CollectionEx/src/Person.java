
public class Person {

	private String name;
	private String lastname;
	private int years;
	private Proffesion proffesion;
	public Person(String string, String string2, int i, String string3) {
		// TODO Auto-generated constructor stub
	}

	public Proffesion getProffesion() {
		return proffesion;
	}

	public void setProffesion(Proffesion proffesion) {
		this.proffesion = proffesion;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	
	public String toString() {
		return " " + name +   " " + lastname + " " +  years +  " " + proffesion;
}
}
