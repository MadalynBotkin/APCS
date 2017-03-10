//Madalyn Botkin
//DogCompare.java
//The DogCompare class will test the constructor and all methods of the Dog class. Using DogCompare, the user can have 5 dogs, find specific dogs, and add and delete them.
//	This new version of DogTracker uses for each loops and a compareTo method that can compare Dog objects to each other.

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
			barkString += "bark ";
		}
		
		return barkString;
	}
	
	//method to compare dogs to each other
	public int compareTo(Dog dog)
	{
		int searchDogSum = (name.compareTo(dog.getName()) + age + weight + numBarks);
		
		//if the dog being sought is not there
		if (dog == null)
		{
			return -1;
		}
		
		//if the 2 dogs are identical, return 0
		if (searchDog.getName().equals(dog.getName()) && searchDog.getAge() == dog.getAge() && searchDog.getWeight() == dog.getWeight())
		{
			return 0;
		}
		
		//if the dog being sought is less than the dog it's being compared to, return -1
		if (searchDog.getName().compareTo(dog.getName()) < 0 || searchDog.getAge() < dog.getAge() || searchDog.getWeight() < dog.getWeight())
		{
			return -1;
		}
		
		//if the dog being sought is greater than the dog it's being compared to, return 1
		if (searchDog.getName().compareTo(dog.getName()) > 0 || searchDog.getAge() > dog.getAge() || searchDog.getWeight() > dog.getWeight())
		{
			return 1;
		}
		
		return -1;
	}
}










public class DogCompare
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		Dog[] dogArray = new Dog[2];	//the array of 5 dogs//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		String name = "";
		int age = 0;
		int weight = 0;
		int numBarks = 0;
		int menuOption = 0;
		String findName = "";
		int index = 0;
		boolean found = false;
		Dog searchDog = new Dog(name, age, weight, numBarks);	//create a dog to compare to other dogs
		
		//loops until user enters 5 for quit
		while (menuOption != 5)
		{
			System.out.print("\nEnter a number to choose from menu:\n\n1) Enter Initial Dog Data\n2) Find a Dog\n3) Insert/Add New Dog\n4) Delete an Existing Dog :(\n5) Quit\n\n");
			menuOption = reader.nextInt();
			
			switch (menuOption)
			{
				case 1:
					//loops 5 times, once for each dog in the array
					for (; index < 2; index++)//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					{
						System.out.print("\n\nNew dog:\n\nName: ");
						reader.nextLine();	//clean out reader
						name = reader.nextLine();
						System.out.print("Age: ");
						age = reader.nextInt();
						System.out.print("Weight: ");
						weight = reader.nextInt();
						System.out.print("Number of barks: ");
						numBarks = reader.nextInt();
						
						dogArray[index] = new Dog(name, age, weight, numBarks);	//put a new dog in the array
					}
					break;
				case 2:
					System.out.print("\nEnter dog's name: ");
					reader.nextLine();	//clean out reader
					name = reader.nextLine();
					System.out.print("Enter dog's age: ");
					age = reader.nextInt();
					System.out.print("Enter dog's weight: ");
					weight = reader.nextInt();
					System.out.print("Enter dog's number of barks: ");
					numBarks = reader.nextInt();
					
					index = 0;
					
					searchDog = new Dog(name, age, weight, numBarks);	//create a dog to compare to other dogs
					for (Dog dog : dogArray)
					{
						//if dog is found, output all its data
						if (searchDog.compareTo(dog) == 0)
						{
							System.out.print("\n\n" + dog.getName() + " has been found\nName: " + dog.getName() + "\nAge: " + dog.getAge() + "\nWeight: " + dog.getWeight() + "\nNumber of barks: " + dog.getBarks() + "\n\n");
							found = true;
						}
						
						//if the dog was never found
						else if (searchDog.compareTo(dog) != 0 && found == false && index == dogArray.length - 1)
						{
							System.out.print("Sorry, " + searchDog.getName() + " has not been found");
						}
						
						else
						{
							System.out.print("Blah!");
						}
						
						index++;
					}
					
					
					
					/*
					//loops until dog is found or until the whole array has been searched with no result
					for (index = 0; index < 5 && !findName.equals(name); index++)
					{
						//if dog is found, output all its data
						if (findName.equals(dogArray[index].getName()))
						{
							System.out.print(dogArray[index].getName() + " has been found\nName: " + dogArray[index].getName() + "\nAge: " + dogArray[index].getAge() + "\nWeight: " + dogArray[index].getWeight() + "\nNumber of barks: " + dogArray[index].getBarks() + "\n\n");
						}	
						
						//if the dog was never found
						else if (index == 4 && !findName.equals(dogArray[index].getName()))
						{
							System.out.print("Sorry, " + dogArray[index].getName() + " has not been found");
						}
					}*/
					break;
				case 3:
					//find an empty slot in the array
					//loops until empty space is found or if whole array is found to be full
					for (index = 0; index < 2 && dogArray[index] != null; index++)//////////////////////////////////////////////////////////////////////////////////////////////////
					{
						//if empty space found, enter in a new dog
						if (dogArray[index] == null)
						{
							System.out.print("\n\nNew dog:\n\nName: ");
							reader.nextLine();	//clean out reader
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
						else if (index == 1)///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						{
							System.out.print("Sorry, but there is no more room for another dog.");
						}
					}
					break;
				case 4:
					System.out.print("\nEnter dog's name: ");
					reader.nextLine();	//clean out reader
					name = reader.nextLine();
					System.out.print("Enter dog's age: ");
					age = reader.nextInt();
					System.out.print("Enter dog's weight: ");
					weight = reader.nextInt();
					System.out.print("Enter dog's number of barks: ");
					numBarks = reader.nextInt();
					
					index = 0;
					
					Dog searchDog2 = new Dog(name, age, weight, numBarks);	//create a dog to compare to other dogs
					for (Dog dog : dogArray)
					{
						//if dog is found, output all its data
						if (searchDog2.compareTo(dog) == 0)
						{
							dogArray[index] = null;	//make that dog object null
							System.out.print("\nThe dog has been deleted.");
							found = true;
						}
						
						//if the dog was never found
						else if (searchDog2.compareTo(dog) != 0 && found == false && index == dogArray.length - 1)
						{
							System.out.print("\nSorry, " + searchDog2.getName() + " has not been found");
						}
						
						index++;
					}
					
					/*search array for dog
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
					}*/
					break;
			}//end of switch
		}//end of while loop
	}//end of main
}//end of DogTracker
