package programs;

public class Exceptions3 {

	

	public static void main(String[] args) {
		String a="121"; String b="54"; 
		try

		{
			a=null;
				System.out.println(a.toUpperCase());	
			
		}
		catch(NullPointerException g)
		{
			System.out.println("enter correctr name");
		}
	}

}
