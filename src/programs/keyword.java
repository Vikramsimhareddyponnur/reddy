package programs;
class one
{
	int a=58;
	public void go()
	{
		System.out.println("execute parent class");
	}
}
	class two extends  one
	{
		public void going()
		{
			System.out.println(super.a);
			
			super.go();
		}
	}
 
public class keyword {

	public static void main(String arg[])
	{
		two ee=new two();
		ee.going();
	}

}
