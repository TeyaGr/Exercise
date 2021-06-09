import java.util.LinkedList;
import java.util.Queue;

public class Veterinarian {
    public void accept(String petName) {
    	
      Queue<String> q = new LinkedList<String>();
      q.add(petName);
      System.out.println(q);
      q.add(petName);
      System.out.println(q);
    }

    public String heal() {
      Queue<String>q = new LinkedList<String>();
      while(!q.isEmpty()) {
			return q.poll();
		}
return null;
    }
    
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.accept("Barkley");
        veterinarian.accept("Mittens");
        System.out.println(veterinarian.heal());
        System.out.println(veterinarian.heal());
    }
}