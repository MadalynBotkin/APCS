//Madalyn Botkin
//IntListInsert.java
//


import java.util.*;

class IntListInsert
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int numInts = 0;	//number of integer the user wants to enter
		int num = 0;
		Integer intObj;
		boolean inserted = false;
		
		//find out how many integers the user wants to enter
		System.out.print("How many integers do you want to enter?: ");
		numInts = reader.nextInt();
		
		//enter in the integers
		while (numInts != 0)
		{
			System.out.print("\n\nEnter an integer: ");
			num = reader.nextInt();
			
			intObj = new Integer(num);	//turn the int into an Integer wrapper object
			
			inserted = false;
			int i = 0;
			
			while (inserted == false)
			{
				if (intObj < list.get(i))
				{
					list.add(i, intObj);
					inserted = true;	//so the it doesn't get inserted multiple times
					numInts--;
				}
				
				else if (intObj != list.get(i))
				{
					list.add(intObj);
				}
				
				i++;
			}
			
			/*put it in the array list
			for (int i : list)
			{
				if (num < i && inserted == false)
				{
					
					inserted = true;	//so num doesn't get inserted multiple times
					numInts--;
				}
			}*/
			
			//System.out.print(inserted);
		}//end of while loop
	}
}
