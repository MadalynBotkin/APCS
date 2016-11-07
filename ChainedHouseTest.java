//Madalyn Botkin 
//ChainedHouseTest.java
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
		this("", -25, -25, new StandardPen()); 
	} 
 
	//constructor that accepts houseSize as a parameter(if user wants either large or medium) 
	public HouseDraw(String houseSize) 
	{ 
		this(houseSize, -25, -25, new StandardPen());
	}

	//constructor that accepts the x and y coordinates(if user wants particular coordinates) 
	public HouseDraw(int xPosition, int yPosition) 
	{ 
		this("small", xPosition, yPosition, new StandardPen());
	} 
	 
	//copy constructor 
	public HouseDraw(HouseDraw house)
	{ 
		this(house.houseSize, house.xPosition, house.yPosition, new StandardPen());
	}
	
	//chaining constructor
	public HouseDraw(String houseSize, int xPosition, int yPosition, StandardPen pen)
	{
		this.houseSize = houseSize;
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.pen = pen;
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
		
		if (houseSize.equals("medium"))
		{
			sideLength = 200; 
			drawPerimeter(sideLength); 
			drawRoof(sideLength);
		}
		
		if (houseSize.equals("large"))
		{
			sideLength = 300;
			drawPerimeter(sideLength); 
			drawRoof(sideLength);
		}
	}
	
	public void drawPerimeter(int sideLength)//draws the walls and ceiling of house 
	{ 
		pen.up();
		pen.move(xPosition, yPosition);
		pen.setDirection(90);
		pen.down(); 
		pen.move(sideLength);
		pen.turn(-90);
		pen.move(sideLength);
		pen.turn(-90);
		pen.move(sideLength);
	} 
	 
	public void drawRoof(int sideLength)//draws the roof of the house 
	{ 
		double roofLength = (sideLength / (Math.pow(2, .5)));	//calculate the length of a roof side
		
		pen.up();
		pen.move(xPosition, yPosition);
		pen.setDirection(90);
		pen.move(sideLength);
		pen.down();
		pen.turn(-45);
		pen.move(roofLength);
		pen.turn(-90);
		pen.move(roofLength);
	} 
} 








public class ChainedHouseTest 
{ 
	public static void main(String [] args) 
	{ 
		Scanner reader = new Scanner(System.in); 
		
		HouseDraw house = null;
		HouseDraw houseCopy = null;
		 
		int x = -25;	//the x-coordinate
		int y = -25;	//the x-coordinate
		String size = "small";
		String next = "";	//actually does nothing; just lets user view the size and coordinates before starting the loop again
		
		
		while (size.equals("small") || size.equals("medium") || size.equals("large") || size.equals("new coordinates") || size.equals("copy house")) 
		{ 
			System.out.print("What kind of house do you want to see?\n Small\n Medium\n Large\nNew Coordinates\nCopy House\nEnd\n\n"); 
			size = reader.nextLine(); 
			
			//user wants small sized house
			if (size.equals("small")) 
			{
				x = -25;
				y = -25;
				house = new HouseDraw();	//call the default constructor
				
				
				house.sethouseSize(size);//send the size variable to setHouseSize
				house.setxPosition(x);
				house.setyPosition(y);
					
				System.out.print("\nSize: " + house.getSize(size) + "\nX-Coordinate: " + house.getxPosition() + "\nY-Coordinate: " + house.getyPosition());
				house.draw();
				System.out.print("\n\nPress Enter to continue");
				next = reader.nextLine();
			} 
			 
			//user wants either a medium or large sized house
			if (size.equals("medium") || size.equals("large")) 
			{ 
				house = new HouseDraw(size);//send size to the HouseDraw constructor 
				
				house.sethouseSize(size);//send the size variable to setHouseSize
				house.setxPosition(x); 
				house.setyPosition(y); 
					
				System.out.print("\nSize: " + house.getSize(size) + "\nX-Coordinate: " + house.getxPosition() + "\nY-Coordinate: " + house.getyPosition()); 
				house.draw();
				System.out.print("\n\nPress Enter to continue");
				next = reader.nextLine();
			}
			
			//user enters new coordinates
			if (size.equals("new coordinates"))
			{
				System.out.print("X-Coordinate: ");
				x = reader.nextInt();
				System.out.print("Y-Coordinate: ");
				y = reader.nextInt();
				
				house = new HouseDraw(x, y);//call the x y coordinate constructor
				house.setxPosition(x);	//send x to the setxPosition method
				house.setxPosition(y);	//send y to the setyPosition method
				
				System.out.print("\nSize: " + house.getSize(size) + "\nX-Coordinate: " + house.getxPosition() + "\nY-Coordinate: " + house.getyPosition());
				house.draw();
				System.out.print("\n\nPress Enter to continue");
				next = reader.nextLine();
			}
			
			//user wants a copy of the house
			if (size.equals("copy house"))
			{
				 houseCopy = new HouseDraw(house);	//copy constructor
				 System.out.print("\nSize: " + house.getSize(size) + "\nX-Coordinate: " + house.getxPosition() + "\nY-Coordinate: " + house.getyPosition());
				 house.draw();
				 System.out.print("\n\nPress Enter to continue");
				 next = reader.nextLine();
			}
			
			if (size.equals("end"))
			{
				System.out.print("\nGoodbye");
			}
			
		}
	}
}
