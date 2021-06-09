import java.util.Scanner;

public class StartApp {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Choose an option");
	System.out.println("1.Int");
	System.out.println("2.Double");
	System.out.println("3.String");
	System.out.println("4.Arrays");
	int opc = scan.nextInt();
	switch(opc) {
	case 1:
		IntOperations op = new IntOperations();
		op.mathOptions(scan, opc);
		break;
	case 2:
		DoubleOperations dp = new DoubleOperations();
		dp.mathOptions(scan, opc);
		break;
	case 3 :
		StringOperations so = new StringOperations();
		so.mathOptions(scan, opc);
	case 4:
		ArraysOperations ao = new ArraysOperations();
		ao.mathOptions(scan, opc);
	}
}
}
