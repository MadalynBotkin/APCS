//Madalyn Botkin
//StringArray.java
//

import java.util.Scanner;
	
public class StringArray
{
	String string;
	
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
		
		stringArray = new String[numStrings];
		
		for (String str : stringArray)
		{
			
		}
	}
}
