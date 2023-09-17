package programs;
class a1
{
	
	int unit=500;
	double a=2.6;
	double b=6.9;
	double c=8.5;
	double d=9.95;
	int month=3;
	int date=6;
	int year=23;

	
	public void helo()
	{
		System.out.println("bill for month of "+date+" "+month+" "+year);
	}
}
class b2  extends a1
{
	public void hron() 
	{
		if(unit<=75)
		{
	System.out.println("units consumed"+unit*a);
	}

else if(unit>225&& unit<=500)
{
	System.out.println("E bill amounnt"+unit*c);
	
}
else
{
	System.out.println("units consumed"+unit*d);
}
	}
}
public class electric {

	public static void main (String arg[])
	{
		b2 hh=new b2();
		hh.hron();
		hh.helo();
	
			}

}

