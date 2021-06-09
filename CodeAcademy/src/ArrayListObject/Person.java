package ArrayListObject;



public class Person {
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", age=" + age + ", proffesion=" + proffesion + "]";
	}
	private String name;
	private String lastname;
	private int age;
	private Proffesion proffesion;
	
	public Person() {
		
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Proffesion getProffesion() {
		return proffesion;
	}
	public void setProffesion(Proffesion proffesion) {
		this.proffesion = proffesion;
	}
	public Person(String name, String lastname, int age, Proffesion proffesion) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.proffesion = proffesion;
	}
}
