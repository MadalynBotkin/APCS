//Madalyn Botkin
//DogCompare.java
//

import java.util.Scanner;

class Dog
{
	private String name;
	private int age;
	private int weight;
	private int numBarks;
	
	//constructor that accepts all the variables
	public Dog(String name, int age, int weight, int numBarks)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.numBarks = numBarks;
	}
	
	
	
	//methods
	
	//returns the dog's name
	public String getName()
	{
		return name;
	}
	
	//returns the dog's age
	public int getAge()
	{
		return age;
	}
	
	//returns the dog's weight
	public int getWeight()
	{
		return weight;
	}
	
	//returns a string of how many barks the dog did
	public String getBarks()
	{
		String barkString = "";
		
		//add "bark" to the string for as many barks the dog did
		for (int barks = numBarks; barks > 0; barks--)
		{
			barkString+="bark ";
		}
		
		return barkString;
	}
}

public class DogTracker
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		Dog[] dogArray = new Dog[5];	//the array of 5 dogs
		
		String name = "";
		int age = 0;
		int weight = 0;
		int numBarks = 0;
		int menuOption = 0;
		String findName = "";
		int index = 0;
		
		
		//Dog dog = new Dog(name, age, weight, numBarks);
		
		//loops until user enters 5 for quit
		while (menuOption != 5)
		{
			System.out.print("Enter a number to choose from menu:\n\n1) Enter Initial Dog Data\n2)Find a Dog\n3)Insert/Add New Dog\n4) Delete an Existing Dog :(\n5) Quit\n\n");
			menuOption = reader.nextInt();
			
			switch (menuOption)
			{
				case 1:
					//loops 5 times, once for each dog in the array
					for (; index < 5; index++)
					{
						System.out.print("\n\nNew dog:\n\nName: ");
						name = reader.nextLine();
						System.out.print("Age: ");
						age = reader.nextInt();
						System.out.print("Weight: ");
						weight = reader.nextInt();
						System.out.print("Number of barks: ");
						numBarks = reader.nextInt();					
						
						dogArray[index] = new Dog(name, age, weight, numBarks);	//put a new dog in the array
					}
				case 2:
					System.out.print("Enter dog's name: ");
					findName = reader.nextLine();
					
					//loops until dog is found or until the whole array has been searched with no result
					for (index = 0; index < 5 && !findName.equals(name); index++)
					{
						//if dog is found, output all its data
						if (findName.equals(dogArray[index].getName()))
						{
							System.out.print(name + " has been found\nName: " + dogArray[index].getName() + "\nAge: " + dogArray[index].getAge() + "\nWeight: " + dogArray[index].getWeight() + "\nNumber of barks: " + dogArray[index].getBarks());
						}	
						
						//if the dog was never found
						else if (index == 5)
						{
							System.out.print("Sorry, " + dogArray[index].getName() + " has not been found");
						}
					}
				case 3:
					//find an empty slot in the array
					//loops until empty space is found or if whole array is found to be full
					for (index = 0; index < 5 && dogArray[index] != null; index++)
					{
						//if empty space found, enter in a new dog
						if (dogArray[index] == null)
						{
							System.out.print("\n\nNew dog:\n\nName: ");
							name = reader.nextLine();
							System.out.print("Age: ");
							age = reader.nextInt();
							System.out.print("Weight: ");
							weight = reader.nextInt();
							System.out.print("Number of barks: ");
							numBarks = reader.nextInt();					
						
							dogArray[index] = new Dog(name, age, weight, numBarks);	//put a new dog in the array
						}
						
						//if no empty space was found
						else if (index == 5)
						{
							System.out.print("Sorry, but there is no more room for another dog.");
						}
					}
				case 4:
					System.out.print("Enter dog's name: ");
					findName = reader.nextLine();
					
					//search array for dog
					for (index = 0; index < 5 && !findName.equals(name); index++)
					{
						//if dog is found, delete it
						if (findName.equals(dogArray[index].getName()))
						{
							dogArray[index] = null;	//make that dog object null
							System.out.print("The dog has been deleted.");
						}	
						
						//if the dog was never found
						else if (index == 5)
						{
							System.out.print("Sorry, " + dogArray[index].getName() + " has not been found");
						}
					}
			}//end of switch
		}//end of while loop
	}//end of main
}//end of DogTracker
