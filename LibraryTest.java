//Madalyn Botkin
//LibraryTest.java
//LibraryTest will test all the constructors and methods of the Book and Patron classes

import java.util.Scanner;

//the Book class
class Book
{
	private String author;
	private String title;
	
	//default constructor
	public Book()
	{
		author = "Somebody";
		title = "Any Old Book";
	}
	
	//constructor that accepts and sets Book's author and title
	public Book(String inc_author, String inc_title)
	{
		author = inc_author;
		title = inc_title;
	}
	
	
	//methods
	
	//returns author
	public String getAuthor()
	{
		return author;
	}
	
	//returns title
	public String getTitle()
	{
		return title;
	}
	
	//returns list of the Book's variables
	public String toString()
	{
		return author + title;
	}
}





//the Patron class
class Patron
{
	private String name;
	private Book myBook1;
	private Book myBook2;
	private Book myBook3;
	
	//default constructor
	public Patron()
	{
		name = "Bob";
		
		myBook1 = null;
		myBook2 = null;
		myBook3 = null;
	}
	
	//constructor that accepts the patron's name and sets the books to null
	public Patron(String inc_name)
	{
		name = inc_name;
		
		myBook1 = null;
		myBook2 = null;
		myBook3 = null;
	}
	
	
	//methods
	
	public String getName()
	{
		return name;
	}
	
	//
	//public boolean borrowBook()
	//{
	//	return ;
	//}
	
	//check if the book reference is not null, and equals the incoming title, and if title is found, set the reference to null and return true
	//public boolean returnBook()
	//{
		
	//}
}





//LibraryTest and main
public class LibraryTest
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		
		String author = "";
		String title = "";
		String option = "";	//the option the user enters (choices displayed in menu)
		
		//3 different books
		Book book1;
		Book book2;
		Book book3;
		
		//3 different patrons
		Patron patron1;
		Patron patron2;
		Patron patron3;
		
		System.out.print("Patron 1: ");
		option = reader.nextLine();
		
		
		
		
		
		
		
		
		
		
		/*if the user doesn't want a specific book
		if (option.equals("any"))
		{
			book = new Book();	//call constructor
			author = book.getAuthor();	//get the author
			title = book.getTitle();	//get the title
			
			System.out.print("\nAuthor: " + author + "\nTitle: " + title + "\n");	//output the book's information
		}
		
		//if user wants to specify the particular book they want
		if (option.equals("specific"))
		{
			System.out.print("\nAuthor: ");
			author = reader.nextLine();
			System.out.print("\nTitle: ");
			title = reader.nextLine();
			
			book = new Book(author, title);
			
			
		}*/
	}
}