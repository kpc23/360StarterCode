package payroll;

public abstract class Employee
{
	String name;
	double hourlyRate;
	double hours;
	
	/**
	 * Constructor
	 * @param name
	 * @param hourlyRate
	 * @param hours
	 */
	public Employee(String name, double hourlyRate)
	{
		super();
		this.name = name;
		this.hourlyRate = hourlyRate;
		this.hours = 0;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}



	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate()
	{
		return hourlyRate;
	}



	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate)
	{
		this.hourlyRate = hourlyRate;
	}



	/**
	 * @return the hours
	 */
	public double getHours()
	{
		return hours;
	}



	/**
	 * @param hours the hours to set
	 */
	public void setHours(double hours)
	{
		this.hours = hours;
	}

	/**
	 * Method updates as depending on employee type,
	 * calculation changes. 
	 * @return payment amount as double
	 */
	public abstract double payrollCalculation();

}