//Madalyn Botkin
//ExceptionEngine.java
//

import java.util.Scanner;

public class ExceptionEngine
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int input = 0;
		int numerator = 0;
		int denominator = 0;
		
		//the menu
		while (input != 4)
		{
			System.out.print("1) Null Pointer Exception\n2) Array Index Out Of Bounds Exception\n3) Arithmetic Exception\n4) Quit\n\n");
			input = reader.nextInt();
			
			switch (input)
			{
				case 1:
					abortOrHandle("NullPointer");
				case 2:
					abortOrHandle("ArrayIndex");
				case 3:
					System.out.print("\nEnter numerator: ");
					numerator = reader.nextInt();
					System.out.print("Enter denominator: ");
					denominator = reader.nextInt();
			}
			try {java.lang.Thread.sleep(100);} catch(Exception e) {}
		}
	}//end of main
	
	//determines whether the JVM should abort or handle the exception
	public static boolean abortOrHandle(String exceptionDescription)
	{
		Scanner reader = new Scanner(System.in);
		
		int choice = 0;
		
		if (!exceptionDescription.equals("NullPointer") && !exceptionDescription.equals("ArrayIndex"))
		{
			System.out.print("Shamalamadingdong!");
			return false;
		}
		
		else if (exceptionDescription.equals("NullPointer") || exceptionDescription.equals("ArrayIndex"))
		{
			System.out.print("\n1) Handle the " + exceptionDescription + " exception\n2) Abort\n\n");
			int input =  reader.nextInt();
			
			switch (input)
			{
				case 1:
					
					
					return true;
				case 2:
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
			}
		}
			return false;
	}
}
