//****************************************************************************************
//Book.java                              Author: Erik Boswell
//
//Sets data for books in bookshelf.java and retrieves book data for bookshelf.java
//****************************************************************************************

public class Book 
{
	
	private String title;
	private String author;
	private String publisher;
	private int crd;
	
	public Book (String Title, String Author, String Publisher, int CRD)
	{
		title = Title;
		author = Author;
		publisher = Publisher;
		crd = CRD;
	}
	
	//************************************************************************************
	//Set of commands for revising individual information on books
	//************************************************************************************
	
	public void set_Title(String Title_Revision)
	{
		title = Title_Revision;
	}

	public void set_Author(String Author_Revision)
	{
		author = Author_Revision;
	}
	
	public void set_Publisher(String Publisher_Revision)
	{
		publisher = Publisher_Revision;
	}
	
	public void set_CRD(int CRD_Revision)
	{
		crd = CRD_Revision;
	}
	
	//************************************************************************************
	//Set of commands for retrieving individual information from books
	//************************************************************************************
	
	public String get_Title()
	{
		return title;
	}
	
	public String get_Author()
	{
		return title + " written by " + author;
	}
	
	public String get_Publisher()
	{
		return title + " published by " + publisher;
	}
	
	public String get_CRD()
	{
		return title + " copyrighted in " + crd;
	}
	
	//************************************************************************************
	//Command to return all book information
	//************************************************************************************
	
	public String toString()
	{
		return title + "\n\t" + "written by " + author + "\n\t" + "published by " + 
				publisher + "\n\t" + "Copyright " + crd;
	}
	
}
