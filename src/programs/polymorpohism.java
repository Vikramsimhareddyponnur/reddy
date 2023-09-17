package programs;

class a2
{
	int i; int n; int m;
	
		public void dummy(int bb,int cc)
		{
			i=bb; n=cc;
			System.out.println(i+""+n);
	}
		public void dummy(int ee,int ff,int gg)
		{
			i=ee; n=ff; m=gg;
			System.out.println(i+""+n+""+m);
		}
}
public class polymorpohism {

	public static void main(String arg[]) 
	{
		a2 ss=new a2();
		ss.dummy(30, 50,67);
		
	}

}
