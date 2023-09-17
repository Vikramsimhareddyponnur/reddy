package programs;

public class Exceptions {

	

	public static void main(String[] args) {
		int c=66; int d;
		try
		{
		d=c/0;
		System.out.println(d);
		}
		catch(ArithmeticException e)
		{
			System.out.println("provide proper information");
		}

	}

}
