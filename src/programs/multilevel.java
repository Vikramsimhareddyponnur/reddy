package programs;

class a
{
	int a=33;
	public void demo()
	{
		System.out.println("execute demo");
	}
}
class b extends a
{
	public void show()
	{
		System.out.println("execute show");
	}
}
class c extends a
{
	public void dummy()
	{
		System.out.println("execute dummy");
	}
}
public class multilevel {

	public static void main(String arg[]) {
		// TODO Auto-generated constructor 
		c ee=new c();
		ee.dummy();
		ee.demo();
		b tt=new b();
		tt.show();
		tt.demo();
		a rr=new a();
		rr.demo();
	}

}
