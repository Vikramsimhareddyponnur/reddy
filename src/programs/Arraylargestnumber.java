package programs;

public class Arraylargestnumber {

	
	public static void main(String[] args) {
		int c[]= {10,5,6,30,70};
		int o=c.length;
		for(int i=0;i<o;i++)
		{
		int m=c[o-1];
		if(m<c[i])
		{
			m=c[i];
		c[o-1]=m;
		}
		}
		System.out.println(c[o-1]);
	}

}
