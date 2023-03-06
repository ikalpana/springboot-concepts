package ExceptionHandling;

public class Finallyy {
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
		//it will execute even if we get output or not
		finally
		{
			System.out.println("hello");
		}
		
		
	}
}
