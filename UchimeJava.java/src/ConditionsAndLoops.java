
public class ConditionsAndLoops {

	public static void main(String[] args) {
		
		int a = 10;
		do {
		System.out.println(a);
			a--;
			}
			while(a<=5);	
		
		int b = 65; 
	int c = 138; 
	if (a>b && a>c) {
		System.out.println( "The biggest number is " + a);
		
	}
	else if (b>a && b>c){
		System.out.println("The biggest number is :" + b);
		
		
	}
	else
		System.out.println("The biggest number is" + c );
	 ;
	
	if( c==8) {
		
		System.out.println ("c e togash 8");
		
}
		
	else {
		System.out.println(" " +
	"i c ne e 8");
	}

	int beerNum = 99;
	String beer = "bootles of beer on the wall";
	while (beerNum>0) {
		System.out.println(beerNum + " " + beer );
		beerNum--;
		
	}
	if (beerNum==1) {
		beer = "bootle of beer on the wall";
		System.out.println(beerNum + " "+ beer);
	}
	else {
		System.out.println("No more bottles of beer left");
	}
	
	String str1 = "Zdr kakosi";
	String str2 = "Zostomace seljak?";
	
	if (str1.length()>str2.length()) {
		System.out.println(str1);
	}
		else if(str2.length()>str1.length()) {
			System.out.println(str2);
			
		}
		else 
			System.out.println("ednakvi se");
	
	}
}


	
	
	
		
	