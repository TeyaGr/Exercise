package OOPconcepts;

public class Programmer implements PersonInf {

	String name;
	String lastname;
	int age;
	
	Programmer(String name, String lastname, int age){
		this.name=name;
		this.lastname=lastname;
		this.age=age;
	}
	public void PersonInfo() {
		// TODO Auto-generated method stub
		System.out.println(name+ " "+ lastname+" "+ age);
	}
public static void main(String[] args) {
	Programmer Tea = new Programmer("Tea","Grombanovska",24);
	Tea.PersonInfo();
}
}
