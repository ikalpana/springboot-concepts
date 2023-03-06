package ExceptionHandling;

public class ArithmeticExceptionss {
	public static void main(String[] args) {
		
		int i=8;
		int j=0;
		int k=0;
		
		try {
			k=i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("User,you dont divide by zero");
		}
		
		catch(Exception e)
		{
			System.out.println("you dont divide by zero");
		}
		System.out.println(k);
		System.out.println("");
	}
}
