package FirstLectureYay;

public class BooleanTry {
public static void main(String[] args) {
	
	int a = 4;
	int b = 5;
	final int DIVIDER =2;
	boolean isDivisible;

	if (a%DIVIDER == 0) {
		isDivisible = true;
	}else {
		isDivisible=false;
	}
	System.out.println(isDivisible);
}
}
