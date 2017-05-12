//Madalyn Botkin
//GCD.java
//The user enters two integers. Those integers are sent to a method that finds the greatest common denominator between the two, then returns the answer.

import java.util.*;

public class GCD
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.print("Enter an integer: ");
		num1 = reader.nextInt();
		System.out.print("Enter another one: ");
		num2 = reader.nextInt();
		
		if (num2 > num1)
		{
			System.out.print(findGCD(num2, num1));	//the first integer in the parameters should be the greater number
		}
		
		else
		{
			System.out.print(findGCD(num1, num2));
		}
	}
	
	public static int findGCD(int num1, int num2)
	{
		int remainder = num1 % num2;	//find the modulo of the integers
		
		if(remainder == 0)	//if the remainder is 0, then num2(the divisor) is the GCD
		{
			return num2;
		}
		
		else
		{
			return findGCD(num2, remainder);	//keep sending the divisor and remainder until the GCD is reached
		}
	}
}
