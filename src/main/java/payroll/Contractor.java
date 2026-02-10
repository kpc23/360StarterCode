package payroll;
public class Contractor extends Employee
{

	public Contractor(String name, double hourlyRate)
	{
		super(name, hourlyRate);
	}

	@Override
	public double payrollCalculation()
	{
		return hourlyRate * hours;
	}

}