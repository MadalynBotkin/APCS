//Madalyn Botkin
//EvenSum.java
//

import java.util.*;

public class EvenSum
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int evenInt = 0;
		
		System.out.print("Enter an even integer: ");
		evenInt = reader.nextInt();
		
		while (evenInt % 2 != 0)
		{
			System.out.print("Try entering an even integer this time: ");
			evenInt = reader.nextInt();
		}
		
		sumNums(evenInt);
	}
	
	public static int sumNums(int currentNum)
	{
		
	}
}
