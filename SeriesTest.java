//Madalyn Botkin
//SeriesTest.java
//SeriesTest tests the classes ByTwos, ByFives and ByInterval (which all implement the Series interface) and all their constructors and methods.

class ByTwos implements Series
{
	int currentValue;
	
	//default constructor
	ByTwos()
	{
		currentValue = 0;
	}
	
	public int getPrevious()	//the last iteration (-2)
	{
		currentValue -= 2;
		return currentValue;
	}
	
	//Series interface implementation
	public int getNext()	//the next iteration (+2)
	{
		currentValue += 2;
		return currentValue;
	}
	public void reset()	//sets currentValue to 0
	{
		currentValue = 0;
	}
	public void setStart(int startValue)	//Set currentValue to the startValue taken in from main
	{
		currentValue = startValue;
	}
}

class ByFives implements Series
{
	int currentValue;
	
	//default constructor
	ByFives()
	{
		currentValue = 0;
	}
	
	public int getPrevious()	//the last iteration (-5)
	{
		currentValue -= 5;
		return currentValue;
	}
	
	//Series interface implementation
	public int getNext()	//the next iteration (+5)
	{
		currentValue += 5;
		return currentValue;
	}
	public void reset()	//sets currentValue to 0
	{
		currentValue = 0;
	}
	public void setStart(int startValue)	//Set currentValue to the startValue taken in from main
	{
		currentValue = startValue;
	}
}

class ByInterval implements Series
{
	//constructor that takes in interval as a parameter
	ByInterval(int interval)
	{
		this.interval = interval;
	}
	
	int currentValue;
	int interval;
	
	//Series interface implementation
	public int getNext()	//the next iteration (+interval)
	{
		currentValue += interval;
		return currentValue;
	}
	public void reset()	//sets currentValue to 0
	{
		currentValue = 0;
	}
	public void setStart(int startValue)	//Set currentValue to the startValue taken in from main
	{
		currentValue = startValue;
	}
	
	public int getPrevious()	//the last iteration (-interval)
	{
		currentValue -= interval;
		return currentValue;
	}
}





public class SeriesTest
{
	public static void main (String [] args)
	{
		Series seriesTest1;
		int startValue = 2;
		
		
		//testing ByTwos implementation
		
		seriesTest1 = new ByTwos();	//use the ByTwos class
		seriesTest1.reset();
		seriesTest1.setStart(startValue);
		
		System.out.print("ByTwos:\n\nStarting value: " + startValue + "\nSeries: ");
		
		System.out.print(seriesTest1.getNext());	//use getNext
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print(", " + seriesTest1.getNext());
		}
		
		System.out.print("\nSeries backwards: " + ((ByTwos)seriesTest1).getPrevious());	//use getPrevious
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print(", " + ((ByTwos)seriesTest1).getPrevious());
		}
		
		
		
		//testing ByFives implementation
		
		startValue = 5;
		
		seriesTest1 = new ByFives();	//use the ByFives class
		seriesTest1.reset();
		seriesTest1.setStart(startValue);
		
		System.out.print("\n\n\nByFives:\n\nStarting value: " + startValue + "\nSeries: ");
		
		System.out.print(seriesTest1.getNext());	//use getNext
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print(", " + seriesTest1.getNext());
		}
		
		System.out.print("\nSeries backwards: " + ((ByFives)seriesTest1).getPrevious());	//use getPrevious
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print(", " + ((ByFives)seriesTest1).getPrevious());
		}
		
		
		//testing ByInterval implementation
		
		int interval = 7;
		startValue = 7;
		
		seriesTest1 = new ByInterval(interval);	//use the ByInterval class
		seriesTest1.reset();
		seriesTest1.setStart(startValue);
		
		System.out.print("\n\n\nByInterval:\n\nStarting value: " + startValue + "\nSeries: ");
		
		System.out.print(seriesTest1.getNext());	//use getNext
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print(", " + seriesTest1.getNext());
		}
		
		System.out.print("\nSeries backwards: " + ((ByInterval)seriesTest1).getPrevious());	//use getPrevious
		
		for (int i = 0; i < 4; i++)
		{
			System.out.print(", " + ((ByInterval)seriesTest1).getPrevious());
		}
	}
}
