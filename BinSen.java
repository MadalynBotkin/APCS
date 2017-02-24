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
		int searchNum = 0;	//the number the user wants to find in the array
		int compCount = 0;	//comparison count
		int left = 0;	//leftmost index of binary search
		int right = 0;	//rightmost index of binary search
		int midpoint = 0;	//midpoint of binary search
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
				found = true;
			}
			
			if (i == 14 && found == false)	//if the number was never found
			{
				System.out.print("\n\n" + searchNum + " could not be found.\nComparisons Done: " + compCount);
			}
		}
		
		found = false;
		
		//binary search
		right = array.length - 1;
		midpoint = (left + right) / 2;
		
		while()
		{
			//if the number is found
			if (searchNum == array[midpoint])
			{
				found = true;
			}
			
			//need to adjust the search up
			if (searchNum > array[midpoint])
			{
				left = midpoint;
			}
			
			//need to adjust the search down
			if (searchNum < array[midpoint])
			{
				right = midpoint;
			}
		}
		
		//if the 
		if (found == false)
		{
			
		}	
	}
}
