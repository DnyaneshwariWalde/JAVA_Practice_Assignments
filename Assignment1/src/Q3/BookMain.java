/*3.Create a class Book which describes its Book_title and Book_price. Use getter and setter methods to get & set the Books description. 
	Implement createBooks and showBooks methods to create n objects of Book in an array.  Display the books along with its description as follows:-

	Book Title			Price
	Java Programming	Rs.350.50
	Let Us C			Rs.200.00

	Note: createBooks & showBooks should not be member functions of Book class.
*/
package Q3;

public class BookMain {

	public static void main(String[] args) {
		
		BookManager bmanager = new BookManager();
		Book barr[] = bmanager.createBooks();
		bmanager.showBooks(barr);

	}

}
