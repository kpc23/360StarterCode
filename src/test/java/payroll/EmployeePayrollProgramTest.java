package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeePayrollProgramTest
{
	Employee ContractorIris;
	Employee SalaryBeyonce;
	Employee HourlyHorace;
	EmployeePayrollProgram payroll;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception
	{
		payroll = new EmployeePayrollProgram();

		ContractorIris = new Contractor("Iris", 11);
		SalaryBeyonce = new SalaryEmployee("Beyonce", 100);
		HourlyHorace = new HourlyEmployee("Horace", 10);

	}

	/**
	 * Test method for {@link payroll.EmployeePayrollProgram#newEmployee(payroll.Employee)}.
	 */
	@Test
	void testaddNewEmployee()
	{
		payroll.addNewEmployee(ContractorIris);
		assertEquals("Iris", payroll.getEmployees().get(0).getName());

		payroll.addNewEmployee(SalaryBeyonce);
		assertEquals("Beyonce", payroll.getEmployees().get(1).getName());

		payroll.addNewEmployee(HourlyHorace);
		assertEquals("Horace", payroll.getEmployees().get(2).getName());

		assertEquals(3, payroll.getEmployees().size());
	}

	/**
	 * Test method for {@link payroll.EmployeePayrollProgram#setHours(payroll.Employee, int)}.
	 */
	@Test
	void testSetHours()
	{
		payroll.setHours(ContractorIris, 39);
		assertEquals(39, ContractorIris.getHours());

		payroll.setHours(HourlyHorace, 45);
		assertEquals(45, HourlyHorace.getHours());

		assertEquals(40, SalaryBeyonce.getHours());

	}

	/**
	 * Test method for {@link payroll.EmployeePayrollProgram#setPayroll()}.
	 */
	@Test
	void testSetPayroll()
	{
		payroll.addNewEmployee(HourlyHorace); //45 hrs, 10 rate = 475
		payroll.addNewEmployee(ContractorIris); //39, 11 = 429
		payroll.addNewEmployee(SalaryBeyonce);// 40, 100 = 400

		payroll.setHours(HourlyHorace, 45);
		payroll.setHours(ContractorIris, 39);


		double[] payAmts = payroll.calcPayroll();
		
		assertEquals(475.0, payAmts[0]);
		assertEquals(429.0, payAmts[1]);
		assertEquals(4000.0, payAmts[2]);
	}

}
