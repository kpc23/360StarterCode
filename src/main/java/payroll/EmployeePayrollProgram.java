/**
 * 
 */
package payroll;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class EmployeePayrollProgram
{
	private List<Employee> employees = new ArrayList<>();

	public void addNewEmployee(Employee newEmployee)
	{
		employees.add(newEmployee);
	}

	public void setHours(Employee employee, double hours)
	{
		employee.setHours(hours);
	}

	public double[] calcPayroll()
	{
		double[] employeePayroll = new double[employees.size()];

		for (int i = 0; i < employees.size(); i++)
		{
			employeePayroll[i] = employees.get(i).payrollCalculation();
		}

		return employeePayroll;
	}
	
	

	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees()
	{
		return employees;
	}


	/**
	 * @param args Employee name, hourlyRate, hours (worked)
	 */
	public static void main(String[] args)
	{
		EmployeePayrollProgram payroll = new EmployeePayrollProgram();
		Employee horace = new HourlyEmployee("Horace", 10);
		Employee iris = new Contractor("Iris", 11);
		Employee beyonce = new SalaryEmployee("Beyonce", 100);

		payroll.addNewEmployee(horace);
		payroll.addNewEmployee(iris);
		payroll.addNewEmployee(beyonce);

		payroll.setHours(horace, 45);
		payroll.setHours(iris, 39);

		double[] employeesPay = payroll.calcPayroll();

		for (int i = 0; i < employeesPay.length; i++)
		{
				System.out.println("Employee: " + payroll.getEmployees().get(i).getName() + ", Paid: $" + employeesPay[i]
						+ ", Rate: $" + payroll.getEmployees().get(i).getHourlyRate() + " for "
						+ payroll.getEmployees().get(i).getHours() + " hours.");
		}
	}

}
