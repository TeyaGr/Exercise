package Collections1;

public class Person {

	private String name;
	private String lastname;
	private int years;
	private Proffesion proffesion;
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
	public Proffesion getProffesion() {
		return proffesion;
	}
	public void setProffesion(Proffesion proffesion) {
		this.proffesion = proffesion;
	}
	
	
	Person(){
		
	}
	public Person ( String name,String lastname, Proffesion proffesion, int years) {
		this.lastname= lastname;
		this.name = name;
		this.years = years;
		this.proffesion = proffesion;
		
				
				
	}
	public String toString() {
		return " " + name + " "+ lastname+" " + years+ " " + proffesion;
	}
}
