package programs;

public class Exception4 {

	

	public static void main(String[] args) {
		int a[]= {30,33,36};
		try
		{
			System.out.println(a[2]);
		}
		catch(ArrayIndexOutOfBoundsException k)
		{
			System.out.println("execute catch block");
		}
		finally
		{
			System.out.println("execute finally block");
		}

	}

}
