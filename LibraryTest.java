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
		//generic book
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
		return title + " by " + author;
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
	
	public boolean borrowBook(Book inc_borrowedBook)
	{
		//check if the patron has room for more books and if they do, give them one
		if (myBook1 == null)
		{
			myBook1 = inc_borrowedBook;
			return true;
		}
		
		if (myBook2 == null)
		{
			myBook2 = inc_borrowedBook;
			return true;
		}
		
		if (myBook3 == null)
		{
			myBook3 = inc_borrowedBook;
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	//check if the book reference is not null, and equals the incoming title, and if title is found, set the reference to null and return true
	public boolean returnBook(String inc_title)
	{
		if (myBook1 != null)
		{
			
		}
		
		if (myBook2 != null)
		{
			
		}
		
		if (myBook3 != null)
		{
			
		}
		
		else
		{
			return false;
		}
	}
	
	public boolean hasBook()
	{
		
	}
	
	//returns list of patron's books and whether they have it, or borrowed it, or have returned it
	public String toString()
	{
		return "Patron:\n\nName: " + name + "\nBooks Checked Out: " + myBook1 + ", " + myBook2 + ", " + myBook3;
	}
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
		
		
		//patron.borrow(book2);///////////////////////////////////////////////////////////////////////////
		//the books
		
		book1 = new Book();	//create book1
		
		System.out.print("Book 1:\n\nTitle: " + book1.getTitle() + "\nAuthor: " + book1.getAuthor() + "\nBook1: " + book1.toString());
		
		
		
		book2 = new Book("", "Best Pie Recipes");	//create book2
		
		System.out.print("\n\nBook 2:\n\nTitle: " + book1.getTitle() + "\nAuthor: " + book1.getAuthor() + "\nBook2: " + book1.toString());
		
		
		
		book3 = new Book("S.P. Ace", "Lunar Expedition");	//create book3
		
		System.out.print("\n\nBook 3:\n\nTitle: " + book1.getTitle() + "\nAuthor: " + book1.getAuthor() + "\nBook3: " + book1.toString());
		
		
		
		
		
		//the patrons
		
		
		
		
		
		//patron1 = new Patron();	//create patron1
		
		//patron.borrowBook(book2);	//patron1 wants to check out a cooking book
		
		//System.out.print("\n\nPatron 1:\n\nName: " + patron.getName() + "\n" + patron.toString());
		
		
		
		
		
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
