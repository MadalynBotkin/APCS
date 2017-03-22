//Madalyn Botkin
//IntListInsert.java
//There is an arrayList of Integers. The user specifies how many integers to be entered into the arrayList, and then enters them. As the integers are being entered, they are placed in order, but no duplicates are added to the arrayList.


import java.util.*;

class IntListInsert
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int numInts = 0;	//number of integer the user wants to enter
		int num = 0;
		int placeIndex = -1;
		Integer intObj;
		boolean duplicate;
		
		//find out how many integers the user wants to enter
		System.out.print("How many integers do you want to enter?: ");
		numInts = reader.nextInt();
		
		
		
		
		
		
		
		
		//enter the integers
		while (numInts > 0)
		{
			System.out.print("\nEnter an integer: ");
			num = reader.nextInt();
			
			intObj = new Integer(num);	//turn the int into an Integer wrapper object
			
			if (list.size() == 0)	//if the list is empty in the beginning
			{
				list.add(intObj);
			}	
			
			else	//if not empty
			{
				placeIndex = -1;
				duplicate = false;
				
				//find a place to put the integer
				for (int i = 0; i < list.size(); i++)
				{
					if (placeIndex == -1 && duplicate == false)	//if a place nor duplicate are found yet
					{
						if (intObj.intValue() < list.get(i).intValue())	//found a place
						{
							placeIndex = i;	//keep track of the index of where to place intObj
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
			numInts--;
		}
	
		//output
		System.out.print("\n\nIndex:\t\t");
		for (int i = 0; i < list.size(); i++)	//output indices
		{
			System.out.print(i + "\t");
		}
		
		System.out.print("\nInteger:\t");
		for (Integer k : list)	//output integers
		{
			System.out.print(k + "\t");
		}
	}
}
