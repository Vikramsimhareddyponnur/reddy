package programs;
class  five
{
	int a; int b; int c;
	public five(int a1,int b1)
	{
		a=a1;b=b1;
		System.out.println(a+"\t"+b);
	}
	public five(int a2,int b2,int c2)
	{
		a=a2;b=b2;c=c2;
		System.out.println(a+""+b+""+c);
	}
}
public class constructoroverloading {

	public static void main(String arg[])
	{
		five f=new five(30,23);
		
	}

}
