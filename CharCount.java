//Madalyn Botkin
//CharCount.java
//The user enters a sentence or paragraph. Each unique character in the text is stored in an arrayList. In a parallel arrayList, a count
//	of how many times each character occurs in text is stored. Then, both arrays are displayed.

import java.util.*;

class charCount
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		ArrayList<Character> charList = new ArrayList<Character>();	//the characters in a string
		ArrayList<Integer> numCharList = new ArrayList<Integer>();	//the number of times each character occurs
		String text;
		int index = 0;	//index of where you are in the string
		boolean duplicate = false;
		System.out.print("Enter a sentence or even a paragraph: ");
		text = reader.nextLine();
		
		text = text.toUpperCase();	//convert all characters to uppercase letters
		
		
		
		for (; index < text.length(); index++)	//traverse string

		{
			int numCharListIndex = 0;			
			Character addChar  = new Character(text.charAt(index));	//wrap the char into a Character
			
			for (Character character : charList)	//compare the char to the chars in the array list
			{
				//find out if that character is already in the char arrayList
				if (addChar == character)
				{
					duplicate = true;	//flag it if it's a duplicate
					numCharListIndex = charList.indexOf(character);	//save the index of the duplicate to use later
				}
			}
			
			//if that character is already on the list, just add to the count of that character in the other list
			if (duplicate == true)
			{
				numCharList.set(numCharListIndex, numCharList.get(numCharListIndex) + 1);
			}
			
			//if it hasn't been added yet, add it
			else
			{
				boolean added = false;
				//find place to put the character in the arrayList
				for (Character character : charList)
				{
					if (addChar.compareTo(character) < 0)
					{
						charList.add(charList.indexOf(character), addChar);
						numCharList.set(numCharListIndex, numCharList.get(numCharListIndex) + 1);
						added = true;
					}
				}
				
				if (added == false)
				{
					charList.add(addChar);
					numCharList.set(numCharListIndex, numCharList.get(numCharListIndex) + 1);
				}
			}
		}
		
		//output the lists of characters and frequencies
		System.out.print("Character:\tFrequency:\n");
		for (int i = 0; i < charList.size(); i++)
		{
			System.out.print(charList.get(i) + "\t" + numCharList.get(i));
		}
	}
}
