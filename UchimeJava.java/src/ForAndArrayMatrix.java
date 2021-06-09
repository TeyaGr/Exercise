
public class ForAndArrayMatrix {

	public static void main(String[] args) {
		
		int arr[]= {3,4,5,6,7,8,55};
		
		for(int i:arr) {
			System.out.println(i);
		}
		
		for (int a = 0; a<arr.length; a++) {
			if (arr[a]%2==0) {
				System.out.println(arr[a]);
				
			}
		}
		
		for (int a = 0; a<arr.length; a++) {
			if(a>arr[a]) {
				System.out.println(arr[a]);
			}
		}
		

			int ar[] = {3,10,14,15,42,77,80};
			for (int b = 0; b<ar.length;b++) {
				if (ar[b]%5==0) {
					System.out.println(ar[b]);
				}
			}
			
			/*Matrix i for loop */
			
			int multi[][] = {{1,2,3,4,5},{12,23,34,56}};// multi array ili matrix
			
			for (int i =0; i<multi.length;i++) {
				for (int j =0; j<multi[i].length; j++) {
					multi[i][j]=multi[i][j]+1;
					System.out.print (multi[i][j]+" ");
				}
			}
		
			System.out.println();
				
			
			
			
		
	}
}
