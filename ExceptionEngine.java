//Madalyn Botkin
//ExceptionEngine.java
//

import java.util.Scanner;

public class ExceptionEngine
{
	static Scanner reader = new Scanner(System.in);
	
	public static void main (String [] args)
	{
		int input = 0;
		
		//the menu
		while (input != 4)
		{
			System.out.print("1) Null Pointer Exception\n2) Array Index Out Of Bounds Exception\n3) Arithmetic Exception\n4) Quit");
			input = new reader.nextInt();
			
			switch (input)
			{
				case 1:
					abortOrHandle("NullPointer");
				case 1:
					abortOrHandle("ArrayIndex");
			}
		}
	}//end of main
	
	//determines whether the JVM should abort or handle the exception
	public static boolean abortOrHandle(String exceptionDescription)
	{
		int choice = 0;
		
		if (!exceptionDescription.equals("NullPointer") && !exceptionDescription.equals("ArrayIndex"))
		{
			System.out.print("Shamalamadingdong!");
			return false;
		}
		
		else if (exceptionDescription.equals("NullPointer") || exceptionDescription.equals("ArrayIndex"))
		{
			System.out.print("1) Handle the " + exceptionDescription + " exception\n2) Abort");
			int input =  reader.nextInt();
			
			switch (input)
			{
				case 1:
					return true;
				case 2:
					return false;
			}
		}
		
		else	//is this else necessary?
		{
			return false;
		}
	}
}
