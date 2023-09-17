package programs;
class joi
{
	String s;char c;
	public joi(String s1,char c1)
	{
		s=s1;c=c1;
		System.out.println(s+"\t"+c);
	}
	public joi(char c2,String s2)
	{
		c=c2;s=s2;
		System.out.println(c+"\t"+s);
	}
}
public class constructor3 {

	public static void main(String arg[])
	{
		joi rr=new joi("reddy",'a');
	}

}
