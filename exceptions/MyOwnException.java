package exceptions;

public class MyOwnException extends IllegalArgumentException
{
	public MyOwnException()
	{
		System.out.println("\n!! Illegal Argument Exception !!\n");
		System.out.println("(Default Constructor of MyOwnException).");
	}
	
	public MyOwnException(String s)
	{
		System.out.println( "\n" + s + " \n" );
		System.out.println("\n!! Illegal Argument Exception !!\n");
	}
}
