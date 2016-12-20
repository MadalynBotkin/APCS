//Madalyn Botkin
//StringArray.java
//Strings that the user enters will stored in an array, then the longest, shortest and alphabetically first strings will be outputted, along with their information.

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
		
		String[] stringArray;	//the string array
		int numStrings;
		int index = 0;
		int longStringIndex = 0;
		int shortStringIndex = 0;
		int firstStringIndex = 0;
		String longerString = "";
		String shorterString = "";
		String firstString = "";
		String compareString = "";

		
		
		System.out.print("How many strings do you want to enter?: ");
		numStrings = reader.nextInt();
		
		System.out.print("\nEnter strings:\n");
		stringArray = new String[numStrings + 1];	//makes the array as big as the user wants it to be
		
		//go through the array and fill it with the strings the user enters
		for (String str : stringArray)
		{
			str = reader.nextLine();
		}
		
		
		
		//find the longest string
		for (index = 0; index < stringArray.length; index++)
		{
			longerString = stringArray[index];
			compareString = stringArray[index + 1];
			
			if (compareString.length() > longerString.length())	//if the compareString is found to be longer, it becomes longerString
			{
				longerString = compareString;
				longStringIndex = index;	//keep track of the index of the longest string
			}
		}
		//output the longest string's info
		System.out.print("\n\nLongest string: " + longerString + "\nLength: " + stringArray[longStringIndex].length() + "\nIndex Position: " + longStringIndex);

		
		
		//find the shortest string
		for (index = 0; index < stringArray.length; index++)
		{
			shorterString = stringArray[index];
			compareString = stringArray[index + 1];
			
			if (compareString.length() < shorterString.length())	//if the compareString is found to be shorter, it becomes shorterString
			{
				longerString = compareString;
				shortStringIndex = index;	//keep track of the index of the shortest string
			}
		}
		//output the shortest string's info
		System.out.print("\n\nShortest string: " + shorterString + "\nLength: " + stringArray[shortStringIndex].length() + "\nIndex Position: " + shortStringIndex);

		
		//find the string that comes first alphabetically
		for (; index < stringArray.length; index++)
		{
			firstString = stringArray[index];
			compareString = stringArray[index + 1];
			
			if (compareString.compareToIgnoreCase(longerString) > 0)	//if the compareString is l
			{
				longerString = compareString;
				firstStringIndex = index;	//keep track of the index of the first string
			}
		}
		//output the first string's info
		System.out.print("\n\nAlphabetically first string: " + firstString + "\nLength: " + stringArray[firstStringIndex].length() + "\nIndex Position: " + firstStringIndex);
	}
}
