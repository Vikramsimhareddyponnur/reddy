package programs;

public class Arrayeven {

	public static void main(String arg[])
	{
		int a[]= {8,1,3,5,7,9,2,6};
		System.out.println("odd numbers");
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2!=0)
		{
			System.out.println(a[i]);
		}
	}
	System.out.println("even numbers");
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{
			System.out.println(a[i]);
		}
		}
	}

}
