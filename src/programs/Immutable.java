package programs;

public class Immutable {

	public static void main(String arg[])
	{
		String a=new String("vikram");
		String b=new String("vikram");
		if(a.equals(b))
		{
			System.out.println("string are equal");
		}
		if(a==b)
		{
			}
		else
		{
		System.out.println("string is not equal");
	}
	}
}
