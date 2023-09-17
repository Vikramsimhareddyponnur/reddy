package programs;
class sao implements Runnable
{
public void run()
{
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
	}
}
}
public class Multi2 {

	

	public static void main(String[] args) {
		sao oo=new sao();
		Thread tt=new Thread(oo);
		tt.start();
		sao oo1=new sao();
		Thread tt1=new Thread(oo1);
				tt1.start();
				
	}

}
