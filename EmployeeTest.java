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
	
	abstract public double calcPay();
		
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
		super(firstName, lastName, SSN);
		this.weeklySalary = weeklySalary;
	}
	
	
	//methods
	
	public void setWeeklySalary(double weeklySalary)
	{
		this.weeklySalary = weeklySalary;
	}
	
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
		super(firstName, lastName, SSN);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	
	
	//methods
	
	public double calcPay()
	{
		return hourlyWage * hoursPerWeek;
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
	public CommissionEmp(String firstName, String lastName, int SSN)
	{
		super();
	}
	
	
	//methods
	
	public double calcPay()
	{
		return weeklyGrossSales * commRate;
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
	public BasePlusCommissionEmp(String firstName, String lastName, int SSN)
	{
		super();
	}
	
	
	//methods
	
	public double calcPay()
	{
		return weeklyBaseSalary + (weeklyGrossSales * commRate);
	}
}//end of BasePlusCommisionEmp




public class EmployeeTest
{
	public static void main(String [] args)
	{
		Employee salEmp1, salEmp2, hourEmp1, hourEmp2;
		
		//salaried employees
		
		salEmp1 = new SalariedEmp();	//using the default constructor
		salEmp2 = new SalariedEmp("Joe", "Joe", 111111111, 30.0);	//using constructor with parameters
		
		salEmp1.setFirstName("Billy");
		salEmp1.setLastName("Bob");
		((SalariedEmp)salEmp1).setSSN(123456789);
		((SalariedEmp)salEmp1).setWeeklySalary(23.0);
		
		System.out.print("Salaried Employees:\n\n" + salEmp1.toString());
		System.out.print("\n" + salEmp2.toString());
		
		//hourly employees
		
		hourEmp1 = new HourlyEmp();	//using the default constructor
		hourEmp2 = new HourlyEmp("Gravy", "Train", 121212123, 15, 200);	//using constructor with parameters
		
		salEmp1.setFirstName("Janice");
		salEmp1.setLastName("Smith");
		((SalariedEmp)salEmp1).setSSN(112358132);
		((SalariedEmp)salEmp1).setWeeklySalary(23.0);
		
		System.out.print("Salaried Employees:\n\n" + salEmp1.toString());
		System.out.print("\n" + salEmp2.toString());
	}
}
