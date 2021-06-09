
public class MainClass {
public static void main(String[] args) {
	
	Employee e1 = new Employee("test");
	e1.name= "Eli";
	e1.lastname="Stojanova";
	e1.years = 27;
	Owner o1 = new Owner("Code Academy", 100);
	o1.name = "Marjana";
	
	String [] array = {"Android","MySQL", "SQL"};
	
Programmer p1 = new Programmer("Java", array);
}
}
