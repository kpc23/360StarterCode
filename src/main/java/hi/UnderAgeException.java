package hi;

public class UnderAgeException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public UnderAgeException()
	{
		super("Parent is too Young");
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message)
	{
		super(message);
	}

	
	
}
