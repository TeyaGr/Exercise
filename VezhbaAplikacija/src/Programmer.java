
public class Programmer extends Employee implements HumanBehaviour {
private String speciality;
public String getSpeciality() {
	return speciality;
}
public void setSpeciality(String speciality) {
	this.speciality = speciality;
}
public String[] getTechnologies() {
	return technologies;
}
public void setTechnologies(String[] technologies) {
	this.technologies = technologies;
}
private String[] technologies;

String s = super.
public Programmer (String specialty, String[] technologies) {
	super();
	this.speciality=speciality;
	this.technologies = technologies;
	}
@Override
public void printPosition() {
	// TODO Auto-generated method stub
	System.out.println(super.position);
	
}
@Override
public int calculateYears(int year) {
int i = super.years - year;
return i;
}
@Override
public String fieldOfExpertise(String name, String lastname) {
	String str = name + " "+ lastname + " " + speciality;
	return str;
}

	
}
