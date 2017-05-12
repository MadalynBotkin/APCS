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
		System.out.print(text);
		
		
		
		for (; index < text.length(); index++)	//traverse string
		{
			int numCharListIndex;			
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
				//find place to put the character in the arrayList
				for (Character character : charList)
				{
					if (addChar.compareTo(character) < 0)
					{
						charList.add(charList.indexOf(character), addChar);
						numCharList.set(numCharListIndex, numCharList.get(numCharListIndex) + 1);
					}
				}
			}
		}
		
		//output the lists of characters and frequencies
		System.out.print("Character:\tFrequency:\n__________\t__________");
		for (int i = 0; i < charList.size(); i++)
		{
			System.out.print(charList.get(i) + \t + numCharList.get(i));
		}
		
		
		
		
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*for (; index < text.length(); index++)	//traverse string
		{
			//compareASCII = (int) text.charAt(index);
			charObj = new Character(text.charAt(index));	//convert char to Character wrapper object
			numCharCount = 0;
			
			if (charList.size() == 0 && numCharList.size() == 0)	//if the lists are empty in the beginning
			{
				charList.add(text.charAt(index));
				numCharList.add(listIndex, 1);
			}
			
			else	//if not empty
			{
				listIndex = -1;
				duplicate = false;
				
				//find a place to put the char
				for (int i = 0; i < charList.size(); i++)
				{
					if (listIndex == -1 && duplicate == false)	//if a place nor duplicate are found yet
					{
						if (charObj < charList.get(i))	//found a place
						{
							listIndex = i;	//keep track of the index of where to place charObj
						}
						
						if (charObj == charList.get(i))	//flag if it's a duplicate
						{
							duplicate = true;
							numCharList.add(numCharList.get(i) + 1);////////////////////////////////need another
						}
					}
				}
					
				if (duplicate == false)	//don't add duplicates
				{
					if (listIndex == -1)	//if it's the greatest char yet, put it at the end
					{
						charList.add(charObj);
					}
				
					else	//a specific place was found to put it
					{
						charList.add(listIndex, charObj);
					}
				}	
			}//end of else
			
			for (Character k : charList)
			{
				System.out.print(k);
			}
			
		}//end of for loop
	}
}






I went to the grocery store and bought so many turkeys I couldn't fit them all in the cart. Not to mention I bought two thousand cans of gravy to go along with the meal.
 *i = where you are in both arrayLists
 *index = the index of where you are in the string
 *
 *get character
 *get ascii value
 *compare value to others
 *sort like IntListInsert
 *
 *
 *
 *
 *
 *
 */
