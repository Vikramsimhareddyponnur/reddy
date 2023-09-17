package programs;

public class Exceptions2 {

	

	public static void main(String[] args) {
		
		int a[]= {30,66,33};
		try
		{
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("give the correct index of arry");
		}

	}

}
