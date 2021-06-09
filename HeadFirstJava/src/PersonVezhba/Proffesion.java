package PersonVezhba;

public class Proffesion {
private String title;
private int experience;
Proffesion(){
	
}
Proffesion( String title, int experience){
	this.title = title;
	this.experience = experience;
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
