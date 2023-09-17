package programs;

public class Arraylargest3 {

	
	public static void main(String[] args) {
		int a[]= {6,20,30,66};
		int c=a.length;//
		int d;
		for(int b=0;b<c;b++)//
		{
			for(int j=b+1;j<c;j++)
			{
				if(a[b]>a[j])
				{
					d=a[b];
				a[b]=a[j];
				a[j]=d;
			}
		}
	}
		System.out.println(a[c-1]);  
		System.out.println(a[c-2]);
		System.out.println(a[0]);
		
	}

}
