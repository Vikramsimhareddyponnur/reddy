package programs;
class sorry extends Thread
{
	public void run()
	{
		for(int p=0;p<=10;p++)
		{
			System.out.println(p);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception g)
			{
				
			}
		}
	}
}
public class Multi4 {

	
	public static void main(String[] args) {
		sorry ss=new sorry();
		ss.start();
		try
		{
		ss.join();
		}
		catch(Exception f)
		{
			
		}
		sorry ss1=new sorry();
		ss1.start();
	}

}
