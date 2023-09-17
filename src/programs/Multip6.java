package programs;
class say implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				System.out.println(Thread.currentThread());
			}
			catch(Exception  r)
			{
			}
			}
		}

}
public class Multip6 {
	public static void main(String[] args) {
		
		say xx= new say();
		Thread t=new Thread(xx);
		 t.start();
		 t.setPriority(8);
		 System.out.println(t);
		 say  x=new say();
		 Thread t1=new Thread(x);
		 t1.start();
		 t1.setPriority(2);
	}

}
