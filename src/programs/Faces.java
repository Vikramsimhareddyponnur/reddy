package programs;
interface po
{
	int a=33;  int b=66;
	public void any();

	public void many();
}
class sory implements po
{
public void any()
{
	System.out.println("execuute any"+a);
}
public void many()
{
	System.out.println("execute many"+b);
}
}
public class Faces {

	
	public static void main(String[] args) {
		sory uu=new sory();
		uu.any();
		uu.many();
	}

}
