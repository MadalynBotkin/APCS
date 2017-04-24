//Madalyn Botkin
//EvenSum.java
//User enters an even integer which is sent to a recursive method that finds the sum of all the even integers less than the specified even integer.

import java.util.*;

public class EvenSum
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int evenInt = 0;
		
		System.out.print("Enter an even integer: ");
		evenInt = reader.nextInt();
		
		//keeps asking for an even integer until the user does so
		while (evenInt % 2 != 0)
		{
			System.out.print("Try entering an even integer this time: ");
			evenInt = reader.nextInt();
		}
		
		System.out.print("\nSum of all even numbers less than " + evenInt + ": " + sumNums(evenInt));
	}
	
	public static int sumNums(int currentNum)
	{
		currentNum -= 2;	//don't add the evenInt itself
		int sum = currentNum;
		
		if (currentNum > 0)
		{
			sum += sumNums(currentNum);	//sum up all even integers below the evenInt
		}
		
		return sum;
	}
}
