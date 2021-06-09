package Collections1;

public class Proffesion extends Person {

	private String title;
private	int experience;

Proffesion(){
	
}

public  Proffesion ( String title, int experience) {
	this.experience = experience;
	this.title = title;
}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String toString() {
		return "title= " + title + " experience= " + experience;
}
}
