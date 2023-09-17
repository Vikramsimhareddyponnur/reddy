package programs;

public class Mutable {

	public static  void main(String arg[])
	{
		StringBuffer a=new StringBuffer("pawvan");
		StringBuffer b=new StringBuffer("kalayan");
		System.out.println(a.append(b));
		System.out.println(a);
		System.out.println(a.reverse());
		System.out.println(a.insert(3,"power"));
	}

}
