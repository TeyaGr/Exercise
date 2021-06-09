package ArrayListObject;

public class Proffesion {
	private String title;
	private int exp;

	public Proffesion () {
		
	}
	public Proffesion(String title, int exp) {
		super();
		this.title = title;
		this.exp = exp;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Proffesion [title=" + title + ", exp=" + exp + "]";
	}
}
