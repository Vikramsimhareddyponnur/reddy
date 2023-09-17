package programs;
class  l
{
	static int a=22; int b=33;
	static public void tt()
	{
		System.out.println("execute tt"+a);
	}
	public void rr()
	{
		System.out.println("execute  rr"+a+"  "+b);
	}
}
public class Nonmethod {

	

	public static void main(String[] args) {
		l.tt();
		l oo=new l();
		oo.rr();

	}

}
