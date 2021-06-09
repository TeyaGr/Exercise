package OOPconcepts;

public class Square implements Shape{

	int side;
	Square(int side){
		this.side = side;
	}
	@Override
	public void area() {
		System.out.println(side*side);
		
	}
	public static void main(String[] args) {
		Square s = new Square(5);
		s.area();
	}
}
