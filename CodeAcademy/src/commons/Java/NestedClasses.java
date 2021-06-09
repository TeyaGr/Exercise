package commons.Java;

class OuterClass{
	int x = 10;
	class InnerClass{
		int y = 5;
	}
}
public class NestedClasses {
	public static void main(String[] args) {
		

OuterClass oc = new OuterClass();
OuterClass.InnerClass ic = oc.new InnerClass();
	System.out.println(ic.y);
	}
	}

