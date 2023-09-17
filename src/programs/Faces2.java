package programs;
interface haa
{
	int a=66; int b=33;
	public void go();
}
interface  umm
{
	String c="reddy"; 
			
}
class don implements haa,umm

{
	public void haa()
	{
		
		System.out.println("execute haa");
	}
	public void umm()
	{
		System.out.println("execute umm");
	}
	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}
}
public class Faces2 {

	
	public static void main(String[] args) {
		don jj=new don();
		jj.haa();
		jj.umm();
		System.out.println(haa.a);
		System.out.println(umm.c);
		
	}

}
