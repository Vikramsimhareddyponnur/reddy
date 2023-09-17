package programs;
class go
{
	int p=33;
	void args(go ss1)
	{
	ss1.p++;
}
	
}
public class Refernce {

	
	public static void main(String[] args) {
		go ss= new go();
		System.out.println("before change"+ss.p);
		ss.args(ss);
		System.out.println("after change"+ss.p);
		

	}

}
