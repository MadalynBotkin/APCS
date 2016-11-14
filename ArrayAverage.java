//Madalyn Botkin
//ArrayAverage.java
//User inputs 10 numbers that are saved in an array. In another method, the average of the numbers in the array is calculated

import java.util.Scanner;

public class ArrayAverage
{
	//main method
	public static void main (String[] args)
	{
		Scanner reader = new Scanner(System.in);
		
		double array[] = new double[100];	//the array
		int index = 0;	//where in the array it is
	
		
		System.out.print("Enter 10 real numbers:\n");
		
		//read in the numbers
		for (index = 0; index < 10; index++)
		{
			array[index] = reader.nextDouble();
		}
		
		System.out.print("Average: " + getAverage(array, index));
	}
	
	
	
	
	//get average method
	public static int getAverage(double array[], int index)
	{
		double average = 0;
		
		for (double number : array)
		{
			average += number;
		}
		
		average /= index;
		
		return average;
	}
}
