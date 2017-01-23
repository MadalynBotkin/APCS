//EmployeeTest.java
//
//

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
	public String getFirstName(String firstName)
	{
		return firstName;
	}
	
	//get lastName
	public String getLastName(String lastName)
	{
		return lastName;
	}
	
	//get SSN
	public int getSSN(int SSN)
	{
		return SSN;
	}
	
	
	//abstracts
	
	abstract public double calcPay();
		
	abstract public String toString();
		
}

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
	public SalariedEmp(String firstName, String lastName, int SSN)
	{
		super();
	}
	
	
	//methods
	
	public double calcPay()
	{
		return weeklySalary;
	}
		
	/*public String toString()
	{
		return "";
	}*/
}

class HourlyEmp extends Employee
{
	protected double hourlyWage;
	protected int hoursPerWeek;	//the number of hours worked per week
}

class CommissionEmp extends Employee
{
	protected double commRate;	//the commission rate
	protected double weeklyGrossSales;
}

class BasePlusCommissionEmp extends CommissionEmp
{
	protected double weeklyBaseSalary;
}
