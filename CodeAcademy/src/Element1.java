
public enum Element1 {
H("Hydrogen"),
O("Oxygen"),
HE("Helium"),
Ne("Neon");
	
	private final String name;
	
private Element1(String name) {
		this.name = name;
	}
public String getName() {
	return name;
}
}
