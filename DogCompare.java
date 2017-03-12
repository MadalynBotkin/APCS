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
	
	//returns the dog's weight
	public int getNumBarks()
	{
		return numBarks;
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
		//if the dog being sought is not there
		if (dog == null)
		{
			return -1;
		}
		
		//compare the sum of the dogs' information to each other
		int searchDogSum = (name.compareTo(dog.getName()) + age + weight);
		int dogSum = (dog.getName().compareTo(name) + dog.getAge() + dog.getWeight());
		
		return searchDogSum - dogSum;
	}
}










public class DogCompare
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
		int saveIndex = 0;
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
					for (; index < 5; index++)
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
					//information of the searchDog
					System.out.print("\nEnter dog's name: ");
					reader.nextLine();	//clean out reader
					name = reader.nextLine();
					System.out.print("Enter dog's age: ");
					age = reader.nextInt();
					System.out.print("Enter dog's weight: ");
					weight = reader.nextInt();
					System.out.print("Enter dog's number of barks: ");
					numBarks = reader.nextInt();
					found = false;
					
					index = 0;
					
					searchDog = new Dog(name, age, weight, numBarks);	//create a dog to compare to other dogs
					
					for (Dog dog : dogArray)
					{
						//if dog is found, set found to true
						if (searchDog.compareTo(dog) == 0)
						{
							found = true;
						}
					}
					
					if (found == true)
					{
						System.out.print("\n\n" + searchDog.getName() + " has been found\nName: " + searchDog.getName() + "\nAge: " + searchDog.getAge() + "\nWeight: " + searchDog.getWeight() + "\nNumber of barks: " + searchDog.getBarks() + "\n\n");
					}
					
					//if the dog was never found
					else
					{
						System.out.print("\nSorry, " + searchDog.getName() + " has not been found.\n");
					}
			
					break;
				case 3:
					found = false;
					index = 0;
					//find an empty slot in the array
					//loops until empty space is found or if whole array is found to be full
					for (Dog dog: dogArray)
					{
						//if dog is found, set found to true
						if (searchDog.compareTo(dog) == -1)
						{
							if (found == false)
							{
								found = true;
								saveIndex = index;	//save the index
							}
							found = true;
						}
						index++;
					}
					
					//if empty space found, enter in a new dog
					if (found == true)
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
						System.out.print("\n");				
						
						dogArray[saveIndex] = new Dog(name, age, weight, numBarks);	//put a new dog in the array
					}
				
					//if no empty space was found
					else
					{
						System.out.print("\nSorry, but there is no more room for another dog.\n");
					}
					
					break;
				case 4:
					//information of the searchDog
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
							System.out.print("\n" + name + " has been deleted.\n");
							found = true;
						}
						
						//if the dog was never found
						else if (searchDog2.compareTo(dog) != 0 && found == false && index == dogArray.length - 1)
						{
							System.out.print("\nSorry, " + searchDog2.getName() + " has not been found.\n");
						}
						
						index++;
					}
				
					break;
			}//end of switch
		}//end of while loop
	}//end of main
}//end of DogTracker
