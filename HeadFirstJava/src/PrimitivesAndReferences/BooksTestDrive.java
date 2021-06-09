package PrimitivesAndReferences;

public class BooksTestDrive {
public static void main(String[] args) {
	

	Books [] b = new Books[3];
	b[0].title = "The Hobbit";
	b[1].title = "Lotr";
	b[2].title = "Pride and prejudice";
	b[0].author = "Tolkien";
	b[1].author = "Tolkien";
	b[2].author= "Dostoevsky";
	int x = 0;
	while(x<3) {
		b[x].getDetails();
		x++;
	}
	}
}

