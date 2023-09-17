package programs;
class i
{
	String a; char b;
	
		public void duplic(String c,char d)
		{
			  a=c; b=d;
			System.out.println(a+" "+b);
	}
		public void duplic(char f,String s)
		{
		 b=f; a=s;
		System.out.println(a+" "+b);
		}
}
public class sequence {

	public static void main(String  arg[]) {
		i oo=new i();
		oo.duplic('H',"reddy");
	}

}
