//Madalyn Botkin
//TimeTest.java
//The TimeTest class tests all the constructors and methods of the TimeConvert class.

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
		hour = 0;
		minute = 0;
		meridiem = "";
	}
	
	//accept hour and meridiem from main
	public TimeConvert(int hour, String meridiem)
	{
		this.hour = hour;
		this.meridiem = meridiem;
		minute = 0;
	}
	
	//accept hour, meridiem, and minutes from main
	public TimeConvert(int hour, String meridiem, int minute)
	{
		this.hour = hour;
		this.meridiem = meridiem;
		this.minute = minute;
	}
	
	//copy constructor
	public TimeConvert(TimeConvert time)
	{
		hour = time.hour;
		minute = time.minute;
		meridiem = time.meridiem;
	}


	
	
	
	//methods/////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//setters
	
	//validates and set the variables
	public void setTime(int hour, int minute, String meridiem)
	{
		this.hour = hour;
		this.minute  = minute;
		this.meridiem = meridiem;
		
		if (this.minute < 0 || this.minute >= 60)	//if the minute is less than 0 or greater than 60, set to 0
		{
			this.minute = 0;
		}
		
		//if the meridiem is not valid, set it to e for error
		if (!this.meridiem.equals("u") && !this.meridiem.equals("am") && !this.meridiem.equals("pm"))
		{
			this.meridiem = "e";
			this.hour  = 0;
		}
		
		//if universal time and if the hour exceeds the 23 hour time period, set it to 0
		if (this.meridiem.equals("u") && (this.hour < 0 || this.hour > 23))
		{
			this.hour  = 0;
		}
		
		//if am and hour is invalid
		if (this.meridiem.equals("am") && (this.hour < 0 || this.hour > 12))
		{
			this.hour  = 0;
		}
		
		//if pm and hour is invalid
		if (this.meridiem.equals("pm") && (this.hour < 0 || this.hour > 12))
		{
			this.hour  = 0;
		}
	}
	
	//validates and sets the hour
	void setHour(int hour)
	{
		this.hour = hour;
		
		//if invalid
		if (hour < 0 || hour > 23)
		{
			hour  = 0;
		}
	}
	
	//validates and sets the minute
	void setMinute(int minute)
	{
		this.minute = minute;
		
		//if invalid
		if (minute < 0 || minute < 60)
		{
			minute = 0;
		}
	}
	
	//validates and sets the meridiem
	void setMeridiem(String meridiem)
	{
		this.meridiem = meridiem;
		
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
	String getMeridiem()
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
		if (meridiem.equals("pm") && hour != 12)	//12:00 pm = 12:00 u
		{
			return (hour + 12) + ":" + minute + " u";
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
			if (hour < 12)
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
			
			if (hour > 12)
			{
				return (hour - 12) + ":" + minute + " pm";
			}
			
			//if it's noon
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
		
		//four different times
		TimeConvert time1;	//default
		TimeConvert time2;
		TimeConvert time3;	
		TimeConvert time4;	//incorrect
		TimeConvert time5;	//copy of time3
		
		
		//time1
		time1 = new TimeConvert();	//default time
		
		System.out.print("Time1 (default): " + time1.getMinute() + ":" + time1.getHour() + " " + time1.getMeridiem());
		
		
		//time2
		hour = 2;
		meridiem = "pm";
		
		time2 = new TimeConvert(hour, meridiem);
		
		time2.setMeridiem(time2.getMeridiem());
		time2.setMinute(time2.getMinute());
		time2.setHour(time2.getHour());
		
		System.out.print("\n\nTime2:\nStandard: " + time2.toStandardString());
		System.out.print("\nUniversal: " + time2.toUniversalString());
		
		
		//time3
		hour = 22;
		minute = 35;
		meridiem = "u";
		
		time3 = new TimeConvert(hour, meridiem, minute);
		
		time3.setTime(time3.getHour(), time3.getMinute(), time3.getMeridiem());
		
		System.out.print("\n\nTime3:\nStandard: " + time3.toStandardString());
		System.out.print("\nUniversal: " + time3.toUniversalString());
		
		
		//time4
		hour = 42;
		minute = -23;
		meridiem = "hi";
		
		time4 = new TimeConvert(hour, meridiem, minute);
		
		time4.setTime(time4.getHour(), time4.getMinute(), time4.getMeridiem());
		
		System.out.print("\n\nTime4:\nStandard: " + time4.toStandardString());
		System.out.print("\nUniversal: " + time4.toUniversalString());
		
		
		//time5
		time5 = new TimeConvert(time3);
	
		System.out.print("\n\nTime5:\nStandard: " + time5.toStandardString());
		System.out.print("\nUniversal: " + time5.toUniversalString());
	}
}
