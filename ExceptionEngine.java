//Madalyn Botkin
//ExceptionEngine.java
//User has 3 different exceptions to choose from: NullPointer, ArrayIndexOutOfBounds, and Arithmetic. If either of the first two is chosen, the abortOrHandle method is called,
//	and in it the user must decide to abort or handle the exception. In the third option, if there is an Arithmetic Exception, user is prompted for new numbers, and those numbers and
//	their quotient are outputted.

import java.util.Scanner;

public class ExceptionEngine
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int input = 0;
		int numerator = 0;
		int denominator = 0;
		double quotient = 0;
		
		//the menu
		while (input != 4)
		{
			System.out.print("1) Null Pointer Exception\n2) Array Index Out Of Bounds Exception\n3) Arithmetic Exception\n4) Quit\n\n");
			input = reader.nextInt();
			
			switch (input)
			{
				case 1:
					abortOrHandle("NullPointer");
					break;
				case 2:
					abortOrHandle("ArrayIndex");
					break;
				case 3:
					System.out.print("\nEnter numerator: ");
					numerator = reader.nextInt();
					System.out.print("Enter denominator: ");
					denominator = reader.nextInt();
					
					try	//ArithmeticException
						{
							quotient = numerator / denominator;
						}
						catch(ArithmeticException e)
						{
							//the user enters a new numerator and denominator
							System.out.print("\n\n\nUh-oh. There is an arithmetic exception here.\n\nEnter new numerator: ");
							numerator = reader.nextInt();
							System.out.print("Enter new denominator: ");
							denominator = reader.nextInt();
						}
						quotient = (double)numerator / (double)denominator;	//typecast to double so it does the math right
						System.out.print("Numerator: " + numerator + "\nDenominator: " + denominator + "\nQuotient: " + quotient + "\n\n");	//output all the information
					break;
			}
		}
	}//end of main
	
	
	
	
	//determines whether the JVM should abort or handle the exception
	public static boolean abortOrHandle(String exceptionDescription)
	{
		Scanner reader = new Scanner(System.in);
		
		int choice = 0;
		
		//if it's neither a NullPointer or ArrayIndex
		if (!exceptionDescription.equals("NullPointer") && !exceptionDescription.equals("ArrayIndex"))
		{
			System.out.print("Warning: There is an exception here.");
			return false;
		}
		
		else if (exceptionDescription.equals("NullPointer") || exceptionDescription.equals("ArrayIndex"))
		{
			System.out.print("\n1) Handle the " + exceptionDescription + " exception\n2) Abort\n\n");
			int input =  reader.nextInt();
			
			switch (input)
			{
				case 1:	//user wants to handle exception (output an error message)
					if (exceptionDescription.equals("NullPointer"))
					{
						try	//NullPointer
						{
							String nullString = null;
							System.out.print(nullString.length());//causes a null pointer exception
						}
						catch(Exception e)
						{
							System.out.print("Uh-oh. There's a null pointer exception here.\n\n");
						}
					}
					
					if (exceptionDescription.equals("ArrayIndex"))
					{
						try	//ArrayIndex
						{
							String nullString = null;
							System.out.print(nullString.length());//causes a null pointer exception
						}
						catch(Exception e)
						{
							System.out.print("Uh-oh. There's an array index exception here.\n\n");
						}
					}
					break;
				case 2:	//cause an exception to stop the program from executing
					if (exceptionDescription.equals("NullPointer"))
					{
						String nullString = null;
						System.out.print(nullString.length());//causes a null pointer exception
						return false;
					}
					
					if (exceptionDescription.equals("ArrayIndex"))
					{
						int[] array = new int[3];
						System.out.print(array[4]);//causes an array index out of boundse exception 
						return false;
					}
					break;
			}
		}
			return false;
	}
}
