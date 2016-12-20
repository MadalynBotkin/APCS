//Madalyn Botkin
//ArrayAverage.java
//User inputs 10 numbers that are saved in an array. In another method, the average of the numbers in the array is calculated, then all numbers in array that are greater than the average are displayed.

import java.util.Scanner;

public class ArrayAverage
{
	//main method
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		
		double[] array = new double[10];	//the array
		int index = 0;	//where in the array it is
		
		
		System.out.print("Enter 10 real numbers:\n");
		
		//read in the numbers
		for (; index < array.length; index++)
		{
			array[index] = reader.nextDouble();
		}
		
		System.out.print("\n\nAverage: " + getAverage(array) + "\n\nNumbers greater than the average:\n");
		
		//find and output all numbers greater than the average
		for (double greaterNum : array)
		{
			if (greaterNum > getAverage(array))
			{
				System.out.print(greaterNum);
			}
		}
	}
	
	
	
	
	//get average method
	public static double getAverage(double[] array)
	{
		double average = 0;
		
		for (double number : array)	//go through the array and add up all its numbers
		{
			average = average + number;
		}
	
		average /= array.length;
		
		return average;
	}
}
