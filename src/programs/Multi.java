package programs;
class door extends Thread
{
	public void run()
	{
	for(int a=0;a<=10;a++)
	{
		System.out.println(a);
	}
	}
}
public class Multi {

	 
	
	public static void main(String[] args) {
		door yy=new door();
		yy.start();
		door  rr=new door();
		rr.start();
		door uu=new door();
		uu.start();
		
	}

}
