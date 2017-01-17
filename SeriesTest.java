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
	
	int getPrevious()
	{
		
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
	
	int getPrevious()
	{
		
	}
}

class ByInterval implements Series
{
	ByInterval(int interval)
	{
		this.interval = interval;
	}
	
	int currentValue;
	int interval;
}





public class SeriesTest
{
	public static void main (String [] args)
	{
		
	}
}

//394
