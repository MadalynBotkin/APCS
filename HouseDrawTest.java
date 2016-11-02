//Madalyn Botkin 
//HouseDrawTest.java 
//HouseDrawTest class will test the HouseDraw class and all of its methods. 

import java.util.Scanner; 
import TurtleGraphics.StandardPen; 
class HouseDraw 
{ 
	//x and y determine the bottom left coordinates of the house
	private int xPosition;
	private int yPosition;
	private String houseSize;
	private StandardPen pen;
 
	//constructors///////////////////////////////////////////////////////////
 
	//default no-args constructor(sets houseSize to "small")(if user wants a small house)
	public HouseDraw() 
	{ 
		houseSize = "small"; 
		xPosition = -25; 
		yPosition = -25; 
		pen = new StandardPen();//each constructor creates a new pen 
	} 
 
	//constructor that accepts houseSize as a parameter(if user wants either large or medium) 
	public HouseDraw(String size) 
	{ 
		houseSize = size; 
		//coordinates default to bottom left corner 
		xPosition = -25; 
		yPosition = -25; 
		pen = new StandardPen(); 
	} 
	 
	//constructor that accepts the x and y coordinates(if user wants particular coordinates) 
	public HouseDraw(int x, int y) 
	{ 
		xPosition = x; 
		yPosition = y; 
		houseSize = "small"; 
		pen = new StandardPen(); 
	} 
	 
	//copy constructor 
	public HouseDraw(HouseDraw inc_house) 
	{ 
		xPosition = inc_house.xPosition;
		yPosition = inc_house.yPosition;
		houseSize = inc_house.houseSize;
		pen = inc_house.pen;
			
		pen = new StandardPen(); 
	} 
	 
	 
	 
	 
	 
	//methods///////////////////////////////////////////////////// 
	public void setxPosition(int x)	//set the x coordinate
	{ 
		xPosition = x; 
	} 
	 
	public void setyPosition(int y) //set the y coordinate
	{ 
		yPosition = y; 
	} 
	 
	public void sethouseSize(String size) 	//set the house size
	{ 
		houseSize = size; 
	} 
	 
	public int getxPosition() 
	{ 
		return xPosition; 
	} 
	 
	public int getyPosition() 
	{ 
		return yPosition; 
	} 
	 
	public String getSize(String size) 
	{ 
		return houseSize; 
	} 
	 
	public void draw()//uses the 2 helper methods below to drawline
	{ 
		int sideLength = 0; 
	 
		if (houseSize.equals("small")) 
		{ 
			sideLength = 100; 
			drawPerimeter(sideLength); 
			drawRoof(sideLength); 
		} 
	} 
		 
	public void drawPerimeter(int sideLength)//draws the walls and ceiling of house 
	{ 
		pen.up(); 
		pen.move(xPosition, yPosition); 
		pen.down(); 
		pen.move(sideLength); 
		//pen.up(); 
		//pen.move(xPosition, yPosition); 
		//pen.turn(225); 
		//pen.down(); 
		//pen.move(sideLength); 
		//pen.turn(90); 
		//pen.move(sideLength); 
		//pen.turn(90); 
		//pen.move(sideLength); 
	} 
	 
	public void drawRoof(int sideLength)//draws the roof of the house 
	{ 
		//pen.up(); 
		//pen.move(xPosition, yPosition); 
		//pen.turn(225); 
		//pen.move(sideLength); 
		//pen.down(); 
		//pen.turn(90); 
		//pen.move(sideLength); 
	} 
} 
	 
	 
public class HouseDrawTest 
{ 
	public static void main(String [] args) 
	{ 
		Scanner reader = new Scanner(System.in); 
		
		HouseDraw house = null;
		HouseDraw houseCopy = null;
		 
		int x = -25; 
		int y = -25; 
		String size = "small"; 
		 
		 
		while (size == "small" || size == "medium" || size == "large" || size == "new coordinates" || size == "copy house") 
		{ 
			System.out.print("What kind of house do you want to see?\n Small\n Medium\n Large\nNew Coordinates\nCopy House\n\n"); 
			size = reader.nextLine(); 
			
			//user wants small sized house
			if (size.equals("small")) 
			{
				x = -25;
				y = -25;
				house = new HouseDraw();//call the no args constructor 
				 
				house.sethouseSize(size);//send the size variable to setHouseSize 
				size = house.getSize(size);//get the size from getSize method to test it 
				house.setxPosition(x); 
				house.setyPosition(y); 
				x = house.getxPosition(); 
				//System.out.print(size + x); 
				house.draw(); 
			} 
			 
			//user wants either a medium or large sized house
			if (size.equals("medium") || size.equals("large")) 
			{ 
				house = new HouseDraw(size);//send size to the HouseDraw constructor 
				house.sethouseSize(size);//send size to setHouseSize 
				house.draw();
				size = house.getSize(size);
				System.out.print("Size: " + size); 
			} 
			
			//user enters new coordinates
			if (size.equals("new coordinates"))
			{ 
				house = new HouseDraw(size);//send size to the HouseDraw constructor
				x = reader.nextInt();
				house.setxPosition(x);
				house.setxPosition(y);
				house.draw();
				size = house.getSize(size);
				System.out.print("Size: " + size);  
			}
			
			if (size.equals("copy house"))
			{ 
				 houseCopy = new HouseDraw(house);	//copy constructor
			}
			
		} 
	} 
}
