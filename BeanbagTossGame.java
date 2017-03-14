//Madalyn Botkin
//BeanbagTossGame.java 
//There is an 2D array of beanbags. Each beanbag has a value. When the user chooses to throw a beanbag, a position in the array is randomly generated, and whatever value is has gets added to the user's score.

import java.util.Scanner;

class Beanbag
{
	private int myRow;
	private	int myCol;
	private int myValue;
	private boolean activated;
	
	
	
	//default constructor (used for creating a matrix of blank beanbags when the program begins)
	Beanbag()
	{
		myRow = 0;
		myCol = 0;
		myValue = 0;
		activated = false;
	}
		
	//constructor that accepts all the variables (the actual beanbags that the user throws)
	Beanbag(int incomingRow, int incomingCol, int incomingValue)
	{
		myRow = incomingRow;
		myCol = incomingCol;
		myValue = incomingValue;
		activated = false;
	}
	
	
	
	
	//methods
	
	int getValue()	//returns the beanbag's value in a cell
	{
		return myValue;
	}
	
	void hitBeanbag()	//sets activated to true
	{
		activated = true;
	}
	
	boolean isActivated()	//returns whether the beanbag is activated or not
	{
		return activated;
	}
}







public class BeanbagTossGame
{
	public static void main (String [] args)
	{
		Scanner reader = new Scanner(System.in);
		char input = 'i';
		int r = 0;
		int c = 0;
		int score = 0;
		boolean emptySpot = true;
		
		//make the beanbag array
		Beanbag[][] beanbagArray = new Beanbag[5][5];
		
		//fill the array with beanbags
		for (; r < beanbagArray.length; r++)
		{
			//first and last row
			if (r == 0 || r == 4)
			{
				for (c = 0; c < beanbagArray[0].length; c++)
				{
					beanbagArray[r][c] = new Beanbag(r, c, 1);
				}
			}
			
			//second and fourth row
			if (r == 1 || r == 3)
			{
				for (c = 0; c < beanbagArray[0].length; c++)
				{
					if (c == 0 || c == 4)
					{
						beanbagArray[r][c] = new Beanbag(r, c, 1);
					}
			
					else
					{
						beanbagArray[r][c] = new Beanbag(r, c, 2);
					}
			
				}
			}
			
			//third row
			if (r == 2)
			{
				for (c = 0; c < beanbagArray[0].length; c++)
				{
					if (c == 0 || c == 4)
					{
						beanbagArray[r][c] = new Beanbag(r, c, 1);
					}
					
					if (c == 1 || c == 3)
					{
						beanbagArray[r][c] = new Beanbag(r, c, 2);
					}
			
					else if (c == 2)
					{
						beanbagArray[r][c] = new Beanbag(r, c, 3);
					}
			
				}
			}
		}	//end of row loop
		
		
		
		
		
		
		
		
		//menu
		while (input != 'q' && input != 'Q')
		{
			//output the array
			for (r = 0; r < beanbagArray.length; r++)
			{
				for (c = 0; c < beanbagArray[0].length; c++)
				{
					if (beanbagArray[r][c].isActivated() == true)	//if the beanbag is activated, output a B
					{
						System.out.print('B' + "\t");
					}
					
					else
					{
						System.out.print(beanbagArray[r][c].getValue() + "\t");	//output the value
					}
				}
				System.out.print("\n");
			}
			
			System.out.print("\n\nT- Toss a beanbag\nQ- Quit\n\n");
			input = reader.next().charAt(0);
			
			//toss a beanbag
			if (input == 't' || input == 'T')
			{
				emptySpot = true;
				
				while (emptySpot == true)
				{
					//randomly generate location of tossed beanbag in array
					r = (int)(Math.random() * 5);
					c = (int)(Math.random() * 5);
					
					if (beanbagArray[r][c].isActivated() == false)
					{
						score += beanbagArray[r][c].getValue();	//increase score
						emptySpot = false;
						beanbagArray[r][c].hitBeanbag();	//activate the beanbag
						System.out.print("\nYou hit a " + beanbagArray[r][c].getValue() + "!" + "\nScore: " + score + "\n\n");
					}
				}
			}
			
			emptySpot = false;
			
			//check if the array is already full
			for (Beanbag[] bagArray : beanbagArray)
			{
				for (Beanbag bag : bagArray)	//go through each array in the array
				{
					if (bag.isActivated() == true)
					{
						emptySpot = true;
					}
				}
			}
			
			if (emptySpot != true)	//if there are no empty slots left, quit the game
			{
				input = 'q';
			}
		}
		
		System.out.print("\n\nFinal score: " + score + "\nThanks for playing!\n\n");
		
	}//end of main
}
