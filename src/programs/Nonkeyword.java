package programs;
class h1
{
	static int a=30; static  int b=33;
	static public void oo()
	{
		System.out.println("execute oo");
		
	}
	static public void ss()
	{
		System.out.println("execute  ss");
	}
}
public class Nonkeyword {
	static
	{
		System.out.println("execute static block");
	}
	
	public static void main(String[] args) {
		System.out.println(h1.a);
		System.out.println(h1.b);
		h1.oo();
		h1.ss();
	}

}
