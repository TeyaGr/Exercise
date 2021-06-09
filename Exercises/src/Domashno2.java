
public class Domashno2 {
public static void main(String[] args) {
	
	//// string size check
	
	String s1 = "Ej more kloshak ke te otepam";
	String s2 = "Luna emoe kuche hehe skupli od tvoje kirije";
	
	if (s1.length()>s2.length()) {

		System.out.println(s1);
	}else if (s2.length()>s1.length()) {
		System.out.println(s2);
		
	}else {
		System.out.println("The strings are equal");
	}
	System.out.println("----------------------------------------------------");
	//for /each array
	String arr[] = {"texas", "holdem", "pokerr"};
	for(int i = 0; i<arr.length; i++) {
		if(i%2==0) {
			System.out.println("The words with the even indexes are:");
			System.out.println(arr[i]);
		}
	}
	for(String s:arr) {
		System.out.println(s);
		
	}
	System.out.println("---------------------------------------------------");
	int arr2 [] = {1,2,3,4,5,6,7,8,9,0};
	for(int indx = 0; indx<arr2.length; indx++) {
		if(indx>arr2[indx]) {
			System.out.println(arr2[indx]);
		}
	}

	
	//pattern using 4 loop
	for (int n = 1;n<=5;n++) {
		for(int nu=0;nu<n;nu++) {
			
	
				System.out.print("*");
			}
		}
			System.out.println();
			for (int n = 4;n>=5;n--) {
				for(int nu=0;nu<n;nu++) {
					System.out.print("*");
				}
			
	}
		System.out.print("*");
}

}
