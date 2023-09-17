package programs;

public class Arraysmallestnumber {

	
	public static void main(String[] args) {
		int a[]= {10,30,9,60,70};
		int l=a.length;
		int min=a[0];
		for(int i=1;i<l;i++)
		{
			if(min<a[i])
			{
				min=a[i];
				a[0]=min;
			}
		}
		System.out.println(a[0]);
	}

}
