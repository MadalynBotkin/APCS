//Madalyn Botkin
//BeanbagTossGame.java 
//

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
