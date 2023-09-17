package programs;
interface plays
{
	
	public void roes();
}
interface play

{
	
	public void  roes();
}
class trow implements plays,play
{
	String a="avangers"; String b="games";
	public void roes  ()
	{
		System.out.println("print roes"+a+""+b);
	}	
}   
public class Multiple {
	public static void main(String[] args) {
		trow qq=new trow();
		qq.roes(); 
	}
}
