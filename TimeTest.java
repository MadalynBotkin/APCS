//Madalyn Botkin
//TimeTest.java
//

import java.util.Scanner;

class TimeConvert
{
	private int hour;
	private int minute;
	private String meridiem;
	
	//constructors///////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//default constructor
	public TimeConvert()
	{
		//hour = 0;
		//minute = 0;
		//meridiem = "";
	}
	
	//accept hour and meridiem from main
	public TimeConvert(int inc_hour, String inc_meridiem)
	{
		hour = inc_hour;
		meridiem = inc_meridiem;
		minute = 0;
	}
	
	//accept hour, meridiem, and minutes from main
	public TimeConvert(int inc_hour, String inc_meridiem, int inc_minute)
	{
		hour = inc_hour;
		meridiem = inc_meridiem;
		minute = inc_minutes;
	}
	
	//copy constructor
	public TimeConvert(TimeConvert inc_time)
	{
		hour = inc_time.hour;
		minute = inc_time.minute;
		meridiem = inc_time.meridiem;
	}
	
	//chaining constructor
	public TimeConvert(int hour, int minute, String meridiem)
	{
		
	}
	
	
	
	
	//methods/////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//setters
	
	//set the variables
	public void setTime(int inc_hour, int inc_minute, String inc_meridiem)
	{
		hour = inc_hour;
		minute  = inc_minute;
		meridiem = inc_meridiem;
		
		if (minute < 0 || minute < 60)	//if the minute is less than 0 or greater than 60, set to 0
		{
			minute = 0;
		}
		
		//if the meridiem is not valid, set it to 0
		if (!meridiem.equals("u") || !meridiem.equals("am") || !meridiem.equals("pm"))
		{
			meridiem = null;
		}
		
		//if universal time and if the hour exceeds the 23 hour time period, set it to 0
		if (meridiem.equals("u") && (hour < 0 || hour > 23))
		{
			hour  = 0;
		}
		
		//if am and hour is invlaid
		if (meridiem.equals("am") && (hour < 0 || hour > 23))
		{
			hour  = 0;
		}
		
		//if pm and hour is invalid
		if (meridiem.equals("pm") && (hour < 0 || hour > 23))
		{
			hour  = 0;
		}
	}
	
	//sets the hour
	void setHour(int inc_hour)
	{
		hour = inc_hour;
		
		//if invalid
		if (hour < 0 || hour > 23)
		{
			hour  = 0;
		}
	}
	
	//sets the minute
	void setMinute(int inc_minute)
	{
		minute = inc_minute;
		
		//if invalid
		if (minute < 0 || minute < 60)
		{
			minute = 0;
		}
	}
	
	//sets the meridiem
	void setMeridiem(String inc_meridiem)
	{
		meridiem = inc_meridiem;
		
		//if invalid
		if (!meridiem.equals("u") || !meridiem.equals("am") || !meridiem.equals("pm"))
		{
			meridiem = "e";	//e for error
		}
	}
	
	
	
	//getters
	
	//return the hour
	int getHour()
	{
		return hour;
	}
	
	//return the minute
	int getMinute()
	{
		return minute;
	}
	
	//return the meridiem
	String getMerdiem()
	{
		return meridiem;
	}
	
	
	
	
	//tos
	
	//returns string of the time. If the time is still in standard format, convert to universal
	String toUniversalString()
	{	
		//if am
		if (meridiem.equals("am"))
		{
			if (hour == 12)	//12:00 am = 0:00 u
			{
				//return the time
				return "0:" + minute + " u";
			}
			
			else
			{
				//return the time
				return hour + ":" + minute + " u";
			}
		}
		
		//if pm
		if (meridiem.equals("pm"))
		{
			if (hour != 12)	//12:00 pm = 12:00 u
			{
				return (hour + 12) + ":" + minute + " u";
				//hour = hour + 12;
			}
		}
		
		//return the time
		else
		{
			return hour + ":" + minute + " " + meridiem;
		}
	}
	
	//returns string of the time. If the time is still in universal, convert to standard format
	String toStandardString()
	{	
		if (meridiem.equals("u"))
		{
			//if it's am
			if (hour > 12)
			{
				//if it's midnight
				if (hour == 0)
				{
					return 12 + ":" + minute + " am";
				}
				
				else
				{
					return hour + ":" + minute + " am";
				}
			}
			
			//if it's pm
			if (hour < 12)
			{
				return (hour - 12) + ":" + minute + " pm";
			}
			
			else
			{
				return hour + ":" + minute + " pm";
			}
		}
		
		//return the time
		else
		{
			return hour + ":" + minute + " " + meridiem;
		}
	}
}












class TimeTest
{
	public static void main(String [] args)
	{
		Scanner reader = new Scanner(System.in);
		
		int hour = 0;
		int minute = 0;
		String meridiem = "";
		
		TimeConvert time = new TimeConvert();
		TimeConvert timeCopy = new TimeConvert(time);	//copied from the original time
		
		
		System.out.print();
		//time.setTime(hour, minute, meridiem);	set the variables
	}
}
