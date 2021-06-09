package OOPconcepts;

public class Rectangle implements Shape{
int length;
int width;
Rectangle(int length, int width){
	this.length=length;
	this.width=width;
}
	@Override
	public void area() {
		
		System.out.println(length*width);
		
		
	}
	public static void main(String[] args) {
		Rectangle rec = new Rectangle (12,52);
		rec.area();
	}

}
