
public class ReturnStatements {
public static void main(String[] args) {
	printAMessage();
	add(5,10);
	int sum = sum(10,15);
	System.out.println(sum);
	String shout = caps("Hello baby light my fire");
	System.out.println(shout);
	int [] awesomeArray = gimmeArrayFromInts(3,7,1);
	System.out.println(awesomeArray[1]);
}
public static void printAMessage() {
	System.out.println("This is our first method!!!");
}
public static void add(int a, int b) {
	System.out.println(a+b);
}
public static int sum( int i,int j) {
	return i + j;
}
public static String caps ( String s) {
	return s.toUpperCase();
}
public static int[] gimmeArrayFromInts(int a, int b, int c) {
	int [] array = new int [3];
	array[0]= a;
	array[1]=b;
	array[2]=c;
	return array;
}
}
