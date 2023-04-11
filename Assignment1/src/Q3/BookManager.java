package Q3;

import java.util.Scanner;

public class BookManager {
	
	Scanner sc = new Scanner(System.in);
	public Book[] createBooks() {
		
		System.out.println("Enter how many books do you want");
		int n = sc.nextInt();
		
		Book barr[] = new Book[n];
		
		for(int i=0;i<barr.length;i++)
		{
			System.out.println("Enter Book Id:");
			int bookId = sc.nextInt();
			System.out.println("Enter Book Title");
			String bookname = sc.next();
			System.out.println("Enter Book Price");
			double bookprice = sc.nextDouble();
			
			Book bobj = new Book(bookId, bookname, bookprice);
			barr[i] = bobj;		
		}
		return barr;

	}
	
	public void showBooks(Book bobj[]) {
		System.out.println("\t\t\tDisplay Books");
		System.out.println("\t\t\t\tBook Details");
		for(int i=0;i<bobj.length;i++)
		{
			
			System.out.println("\t\t\tBook Id\t\t:\t"+bobj[i].getBookId());
			System.out.println("\t\t\tBook Title\t:\t"+bobj[i].getBookname());
			System.out.println("\t\t\tBook Price\t:\t"+bobj[i].getBookprice());
			System.out.println("\n\t___________________________________________________________________________________");   

		}
		
	}

}
