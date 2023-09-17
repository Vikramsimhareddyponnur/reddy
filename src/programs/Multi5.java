package programs;
class non implements Runnable

{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			System.out.println(Thread.currentThread());
		}
	}
}
public class Multi5 {

	
	public static void main(String[] args) {
		non nn=new non();
		Thread tt=new  Thread(nn);
		tt.start();
		non nn1=new non();
		Thread tt1=new  Thread(nn1);
		tt1.start();

	}

}
