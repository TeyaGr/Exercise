package Car;

public class CarFactory {
static String color;
 static String model;
 
 CarFactory(){
	 System.out.println("These are the cars in our factories");
 }
 CarFactory ( String color, String model) {
	 this.model = model;
	 this.color = color;
	 
 }
 public static void properties() {
	 System.out.println(model + color);
 }
}
