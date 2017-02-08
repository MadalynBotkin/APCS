//Madalyn Botkin
//EmployeeTest.java
//EmployeeTest will test the class and subclasses and all their methods.

abstract class Employee
{
	protected String firstName;
	protected String lastName;
	protected int SSN;
	
	
	//constructors
	
	//default constructor
	Employee()
	{
		firstName = "";
		lastName = "";
		SSN = 0;
	}
	
	//constructor that accepts the variables as parameters
	Employee(String firstName, String lastName, int SSN)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}
	
	
	//setters
	
	//set firstName
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	//set lastName
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	//set SSN
	public void setSSN(int SSN)
	{
		this.SSN = SSN;
	}
	
	
	//getters
	
	//get firstName
	public String getFirstName()
	{
		return firstName;
	}
	
	//get lastName
	public String getLastName()
	{
		return lastName;
	}
	
	//get SSN
	public int getSSN()
	{
		return SSN;
	}
	
	
	//others
	
	abstract public double calcPay();	//to be written in all the other classes
		
	public String toString()
	{
		return "";
		//return "Name: " + getFirstName();
	}
		
}//end of Employee class

class SalariedEmp extends Employee
{
	protected double weeklySalary;
	
	//constructors
	
	//default constructor
	public SalariedEmp()
	{
		super();
	}
	
	//constructor that accepts the variables as parameters
	public SalariedEmp(String firstName, String lastName, int SSN, double weeklySalary)
	{
		super(firstName, lastName, SSN);	//these variables need to be sent up to the Employee class to get set, because SalariedEmp doesn't do that
		this.weeklySalary = weeklySalary;
	}
	
	
	//methods
	
	//set weeklySalary
	public void setWeeklySalary(double weeklySalary)
	{
		this.weeklySalary = weeklySalary;
	}
	
	//calculate how much the employee gets paid
	public double calcPay()
	{
		return weeklySalary;
	}
		
	public String toString()	//return all of its information
	{
		return "Name: " + super.getFirstName() + " " + super.getLastName() + "\nSocial Security Number: " + super.getSSN() + "\nPay: $" + calcPay() + "\n";
	}
}//end of SalariedEmp

class HourlyEmp extends Employee
{
	protected double hourlyWage;
	protected int hoursPerWeek;	//the number of hours worked per week
	
	//constructors
	
	//default constructor
	public HourlyEmp()
	{
		super();
	}
	
	//constructor that accepts the variables as parameters
	public HourlyEmp(String firstName, String lastName, int SSN, double hourlyWage, int hoursPerWeek)
	{
		super(firstName, lastName, SSN);	//send up to Employee class
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	
	//methods
	
	//set hourlyWage
	public void setHourlyWage(double hourlyWage)
	{
		this.hourlyWage = hourlyWage;
	}
	
	//set hoursPerWeek
	public void setHoursPerWeek(int hoursPerWeek)
	{
		this.hoursPerWeek = hoursPerWeek;
	}
	
	//calculate how much the employee gets paid
	public double calcPay()
	{
		return hourlyWage * hoursPerWeek;	//the hourly wage times how many hours the employee worked during the week
	}
	
	public String toString()	//return all of its information
	{
		return "Name: " + super.getFirstName() + " " + super.getLastName() + "\nSocial Security Number: " + super.getSSN() + "\nPay: $" + calcPay() + "\n";
	}
}//end of HourlyEmp

class CommissionEmp extends Employee
{
	protected double commRate;	//the commission rate
	protected double weeklyGrossSales;
	
	//constructors
	
	//default constructor
	public CommissionEmp()
	{
		super();
	}
	
	//constructor that accepts the variables as parameters
	public CommissionEmp(String firstName, String lastName, int SSN, double commRate, double weeklyGrossSales)
	{
		super(firstName, lastName, SSN);	//send up to Employee class
		this.commRate = commRate;
		this.weeklyGrossSales = weeklyGrossSales;
	}
	
	
	//methods
	
	//set the commission rate
	public void setCommRate(double commRate)
	{
		this.commRate = commRate;
	}
	
	//set weeklyGrossSales
	public void setWeeklyGrossSales(double weeklyGrossSales)
	{
		this.weeklyGrossSales = weeklyGrossSales;
	}
	
	//calculate how much the employee gets paid
	public double calcPay()
	{
		return weeklyGrossSales * commRate;	//commission employees get a portion of the weekly gross sales, so commRate is mult. by weeklyGrossSales
	}
	
	public String toString()	//return all of its information
	{
		return "Name: " + super.getFirstName() + " " + super.getLastName() + "\nSocial Security Number: " + super.getSSN() + "\nPay: $" + calcPay() + "\n";
	}
}//end of CommisionEmp

class BasePlusCommissionEmp extends CommissionEmp
{
	protected double weeklyBaseSalary;
	
	//constructors
	
	//default constructor
	public BasePlusCommissionEmp()
	{
		super();
	}
	
	//constructor that accepts the variables as parameters
	public BasePlusCommissionEmp(String firstName, String lastName, int SSN, double commRate, double weeklyGrossSales, double weeklyBaseSalary)
	{
		super(firstName, lastName, SSN, commRate, weeklyGrossSales);	//need to be sent up to CommissionEmp and Employee classes
		this.weeklyBaseSalary = weeklyBaseSalary;
	}
	
	
	//methods
	
	//set weeklyBaseSalary
	public void setWeeklyBaseSalary(double weeklyBaseSalary)
	{
		this.weeklyBaseSalary = weeklyBaseSalary;
	}
	
	//calculate how much the employee gets paid
	public double calcPay()
	{
		return weeklyBaseSalary + (weeklyGrossSales * commRate);	//the employee's base salary plus commission pay
	}
}//end of BasePlusCommisionEmp




public class EmployeeTest
{
	public static void main(String [] args)
	{
		Employee salEmp1, salEmp2, hourEmp1, hourEmp2, commEmp1, commEmp2;
		CommissionEmp commPlusBaseEmp1, commPlusBaseEmp2;
		
		//salaried employees
		
		salEmp1 = new SalariedEmp();	//using the default constructor
		salEmp2 = new SalariedEmp("Joe", "Joe", 111111111, 30.0);	//using constructor with parameters
		
		salEmp1.setFirstName("Billy");
		salEmp1.setLastName("Bob");
		((SalariedEmp)salEmp1).setSSN(123456789);
		((SalariedEmp)salEmp1).setWeeklySalary(23.0);
		
		System.out.print("\n\nSalaried Employees:\n\n" + salEmp1.toString());
		System.out.print("\n" + salEmp2.toString());
		
		
		//hourly employees
		
		hourEmp1 = new HourlyEmp();	//using the default constructor
		hourEmp2 = new HourlyEmp("Mr. Gravy", "Train", 121212123, 17, 2000);	//using constructor with parameters
		
		hourEmp1.setFirstName("Janice");
		hourEmp1.setLastName("Smith");
		((HourlyEmp)hourEmp1).setSSN(112358132);
		((HourlyEmp)hourEmp1).setHourlyWage(10.0);
		((HourlyEmp)hourEmp1).setHoursPerWeek(30);
		
		System.out.print("\n\n\nHourly Employees:\n\n" + hourEmp1.toString());
		System.out.print("\n" + hourEmp2.toString());
		
		
		//commission employees
		
		commEmp1 = new CommissionEmp();	//using the default constructor
		commEmp2 = new CommissionEmp("John", "Watson", 132333435, .25, 240.75);	//using constructor with parameters
		
		commEmp1.setFirstName("Erik");
		commEmp1.setLastName("Satie");
		((CommissionEmp)commEmp1).setSSN(186619250);
		((CommissionEmp)commEmp1).setCommRate(7.50);
		((CommissionEmp)commEmp1).setWeeklyGrossSales(20);
		
		System.out.print("\n\n\nCommission Employees:\n\n" + commEmp1.toString());
		System.out.print("\n" + commEmp2.toString());
		
		//base plus commission employees
		
		commPlusBaseEmp1 = new BasePlusCommissionEmp();	//using the default constructor
		commPlusBaseEmp2 = new BasePlusCommissionEmp("Queen", "Elizabeth", 311748314, 50, 20.5, 100.75);	//using constructor with parameters
		
		commPlusBaseEmp1.setFirstName("Mary");
		commPlusBaseEmp1.setLastName("Watson");
		((CommissionEmp)commPlusBaseEmp1).setSSN(171714874);
		((CommissionEmp)commPlusBaseEmp1).setCommRate(.15);
		((CommissionEmp)commPlusBaseEmp1).setWeeklyGrossSales(435.25);
		((BasePlusCommissionEmp)commPlusBaseEmp1).setWeeklyBaseSalary(50.5);
		
		System.out.print("\n\n\nCommission Plus Base Employees:\n\n" + commPlusBaseEmp1.toString());
		System.out.print("\n" + commPlusBaseEmp2.toString());
	}
}
