package programs;
class you
{
	int val; 
	public void hello(int a)
	{
		val=a;
		System.out.println(val);
	}
}
	class b3 extends you
	{
	int m; 
	public void hello(int b)
	{
		val=b;  
		System.out.println(val);
	}
}
public class overiding {

	public static void main(String arg[])
	{
		b3 yy=new b3();
		yy.hello(63);
	}

}
