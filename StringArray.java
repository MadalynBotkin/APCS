//Madalyn Botkin
//StringArray.java
//

import java.util.Scanner;
	
public class StringArray
{
	String string;
	
	//constructor to hold the user's input
	public StringArray(String string)
	{
		this.string = string;
	}
	
	public static void main (String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		String stringArray[];	//the string array
		int numStrings;
		
		
		System.out.print("How many strings do you want to enter?: ");
		numStrings = reader.nextInt();
		
		System.out.print("Enter strings:\n");
		stringArray = new String[numStrings + 1];	//makes the array as big as the user wants it to be
		
		//go through the array and fill it with the strings the user enters
		for (String str : stringArray)
		{
			str = reader.nextLine();
		}
		
		
		
		//find the longest string
		for (; ; )
		//traverse
	}
}
