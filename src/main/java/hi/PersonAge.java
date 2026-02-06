package hi;

public class PersonAge
{
	String firstName;
	String lastName;
	int age;

	/**
	 * @param firstName - First Name
	 * @param lastName - Last Name
	 * @param age - age of person in years
	 */
	public PersonAge(String firstName, String lastName, int age)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	public PersonAge makePerson(PersonAge that) throws UnderAgeException
	{
		if(age < 18 || that.age<18)
		{
			throw new UnderAgeException();
		}
		PersonAge child = new PersonAge(this.firstName, that.lastName, 0);
		
		return child;
	}
	
	@Override
	public String toString()
	{
		return "Person: " + firstName + " " + lastName + ", " + age;
	}

	
	public static void main(String[] args)
	{
		PersonAge r = new PersonAge ("Romeo", "Mon", 15);
		System.out.println("R " + r);
	}

}
