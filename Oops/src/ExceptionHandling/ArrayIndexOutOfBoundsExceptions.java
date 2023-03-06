package ExceptionHandling;

public class ArrayIndexOutOfBoundsExceptions {
public static void main(String[] args) {
		
		int i=9;
		int j=3;
		int k=0;
		int nums[]= {1,2,3,4};
		try {
			k=i/j;
			System.out.println(nums[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("User stay in limit of the size"+e);
		}
		catch(Exception e)
		{
			System.out.println("you dont divide by zero"+e);
		}
		System.out.println(k);
		System.out.println("");
	}
}
