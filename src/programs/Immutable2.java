package programs;

public class Immutable2 {

	public static void main(String arg[])
	{
		String a=new String("vikram");
		String b=new String("REDDY");
		System.out.println(a.concat(b));
		System.out.println(a);
		System.out.println(b.length());
		System.out.println(a.charAt(2));
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(a.substring(1,5));
		
	}

}
