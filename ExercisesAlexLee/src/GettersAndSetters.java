
public class GettersAndSetters {

	
	String name;
	int age;
	String ocupation;
	
	public static void main(String[] args) {
		GettersAndSetters p = new GettersAndSetters();
		p.age = 18;
		p.name = "Pablo";
		p.ocupation = " Driver";
		System.out.println(p.age + p.name + p.ocupation);
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOcupation() {
		return ocupation;
	}

	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}
	public static void printDetails ( String name, String ocupation, int age) {
		System.out.println(name + ocupation + age);
	}
}
