package payroll;

/**
 * 
 */
public class SalaryEmployee extends Employee
{


	public SalaryEmployee(String name, double hourlyRate)
	{
		super(name, hourlyRate);
		this.hours = 40;
	}

	@Override
	public double payrollCalculation()
	{
		return 40 * hourlyRate;
	}

}
