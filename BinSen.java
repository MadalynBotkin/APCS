//Madalyn Botkin
//BinSen.java
//

import java.util.Scanner;

public class BinSen
{
	public static void main(String [] args)
	{
		int[] array = new int[15];
		int ranNum = (int)(Math.random() * 10) + 1;	//randomly generated number
		int arrayNum = ranNum;
		int searchNum = 0;
		int compCount = 0;	//comparison count
		boolean found = false;	//whether searchNum has been found or not
		Scanner reader = new Scanner(System.in);
		
		//fill the array with multiples of ranNum
		for (int i = 0; i < array.length; i++)
		{
			array[i] = arrayNum;
			arrayNum = arrayNum + ranNum;
		}
		
		System.out.print("Position:\t");
		
		//output the positions
		for (int i : array)
		{
			System.out.print((i / ranNum - 1) + "\t");
		}
		
		System.out.print("\nValue:\t\t");
		
		//output the array
		for (int i : array)
		{
			System.out.print(i + "\t");
		}
		
		
		
		System.out.print("\n\nWhat integer do you want to find?: ");
		searchNum = reader.nextInt();
		
		//sequential search
		for (int i = 0; i < array.length; i++)
		{
			compCount++;
			if (array[i] == searchNum)
			{
				System.out.print("\n\nSequential Search:\n*******************\nSearch Number: " + searchNum + "\nPosition in Array: " + i + "\nComparisons to Find it: " + compCount);
			}
			
			if (i == 14 && array[i] != searchNum)
			{
				
			}
		}
		
		//binary search
		
	}
}
