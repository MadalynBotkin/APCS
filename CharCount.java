//Madalyn Botkin
//CharCount.java
//

import java.util.*;

class charCount
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		ArrayList<Character> charList = new ArrayList<Character>();	//the characters in a string
		ArrayList<Integer> numCharList = new ArrayList<Integer>();	//the number of times each character occurs
		String text;
		Character charObj;
		int index = 0;	//index of where you are in the string
		int listIndex = -1;	//index of where you are in the ArrayLists
		int listASCII;	//the ASCII value of a character in the ArrayList
		int compareASCII;	//the ASCII value of the character that's being compared to elements in the ArrayList
		int numCharCount = 0;
		boolean duplicate = false;
		Character charObj;
	
		System.out.print("Enter a sentence or even a paragraph: ");
		text = reader.nextLine();
		
		text = text.toUpperCase();	//convert all characters to uppercase letters
		System.out.print(text);
		
		for (; index < text.length(); index++)	//traverse string
		{
			compareASCII = (int) text.charAt(index);
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
						if ( charObj < charList.get(i))	//found a place///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						{
							listIndex = i;	//keep track of the index of where to place intObj
						}
						
						if (intObj.intValue() == list.get(i).intValue())	//flag if it's a duplicate
						{
							duplicate = true;
						}
					}
				}
					
				if (duplicate == false)	//don't add duplicates
				{
					if (placeIndex == -1)	//if it's the largest integer yet, put it at the end
					{
						list.add(intObj);
					}
				
					else	//a place was found to put it
					{
						list.add(placeIndex, intObj);
					}
				}

				
				
				
				
			}
			
		}//end of for loop
	}
}






/*I went to the grocery store and bought so many turkeys I couldn't fit them all in the cart. Not to mention I bought two thousand cans of gravy to go along with the meal.
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
