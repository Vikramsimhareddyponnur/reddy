package programs;
class some  extends Thread
{
public void run()
{
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
		try
		{
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
	}
}
}

public class Multi3 {

	
	public static void main(String[] args) {
		some uu=new some();
		uu.start();
		some uu1=new some();
		uu1.start();
		some uu2=new some();
		uu2.start();

	}

}
