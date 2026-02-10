package payroll;

/**
 * 
 */
public class HourlyEmployee extends Employee
{

	public HourlyEmployee(String name, double hourlyRate)
	{
		super(name, hourlyRate);
	}

	@Override
	public double payrollCalculation()
	{
		 if(hours > 40) {
			double overtimePay = hourlyRate * 1.5;
			double overtimeHours = hours - 40;
			return (40 * hourlyRate) + (overtimeHours*overtimePay);
		 }else {
			 return hours * hourlyRate;
		 }
	}

}
