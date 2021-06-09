
public class Proffesion {

	private String title;
	private int experience;
	
	public Proffesion() {
		
	}

	public Proffesion(String title, int experience) {
		super();
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
}
