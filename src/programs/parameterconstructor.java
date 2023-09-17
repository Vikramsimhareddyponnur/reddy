package programs;
class four
{
	int a; double b;  char c; String  d; float e; boolean f;
	public four(int a1,double b1,char c1,String d1,float e1,boolean f1)
	{
		a=a1; b=b1; c=c1; d=d1; e=e1; f=f1;
	}
	public void you()
	{
		a++; b++;
		System.out.println("the updated value");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f);
	}
}

public class parameterconstructor {

	public static void main(String arg[])
	{
		four pp=new four(30,23.5,'h',"vikram",23.4f,true);
		pp.you();
	}

}
