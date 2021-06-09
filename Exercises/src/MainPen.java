
public class MainPen {
public static void main(String[] args) {
	
	Pen p = new Pen();
	p.unclicked();
	System.out.println (p.color);
	System.out.println (p.point);
	System.out.println (p.type);
	System.out.println (p.clicked);
	p.click();

	
}
}
