//****************************************************************************************
//Bookshelf.java                              Author: Erik Boswell
//
//Can browse through book classes, set book information, and get book information
//****************************************************************************************

public class Bookshelf 
{
	
	public static void main (String[] args)
	{
		Book book1 = new Book ("Moby Dick", "Captain Ahab", "Richard Bentley", 1851);
		Book book2 = new Book ("The Cat in the Hat", "Dr. Seuss", "Thing 1", 1957);
		Book book3 = new Book ("Romeo and Juliet", "William Shakespeare", 
				"Simon and Schuster", 982);
		Book book4 = new Book ("To Kill a Hummingbird", "Harper Lee", 
				"J. B. Lippincott & Co.", 1960);
		
		System.out.println(book1.get_Author());
		book1.set_Author("Herman Melville");
		System.out.println("Revised to:");
		System.out.println(book1.get_Author());
		
		System.out.println();
		
		System.out.println(book2.get_Publisher());
		book2.set_Publisher("Random House");
		System.out.println("Revised to:");
		System.out.println(book2.get_Publisher());
		
		System.out.println();
		
		System.out.println(book3.get_CRD());
		book3.set_CRD(1982);
		System.out.println("Revised to:");
		System.out.println(book3.get_CRD());
		
		System.out.println();
		
		System.out.println(book4.get_Title());
		book4.set_Title("To Kill a Mockingbird");
		System.out.println("Revised to:");
		System.out.println(book4.get_Title());
		
		System.out.println();
		System.out.println();
		System.out.println(book1);
		System.out.println();
		System.out.println(book2);
		System.out.println();
		System.out.println(book3);
		System.out.println();
		System.out.println(book4);
		
	}
	

}
