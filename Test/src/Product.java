
public class Product {

	    
	  private  String name;
	   private int quantity;
	    
	    public Product(String name) {
	        this.name = name;
	        this.quantity = 1;
	    }

		public String getName() {
			return name;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
	
	}
		public static void main(String[] args) {
			Product p = new Product("Test") ;
			if(p.getQuantity()<0) {
				p.setQuantity(1);
			}
				
			
		}
}
