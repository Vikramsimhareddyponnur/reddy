package programs;
class three
{
	int b;
	public three()
	{
		b=86;
	}
	public void he()
	{
		b++;
		System.out.println("the updated value"+b);
	}
}
public class defaultconstructor {

	public static void main(String arg[])  
	{
		three tt=new three();
		tt.he();
	}

}
