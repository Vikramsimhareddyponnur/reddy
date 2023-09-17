package programs;
import java.util.*;
public class Scanm2 {
public static void main(String[] args) {
	String c="admin";
		System.out.println("enter your name");
		Scanner ss=new Scanner(System.in);
		String a=ss.nextLine();
		System.out.println("enter your password");
		Scanner ss1=new Scanner(System.in);
		String b=ss1.nextLine();
		
		if(a.equals(b)&&(a.equals(c)))
		{
			System.out.println("welcom vikram");	
		}
		
		else
		{
			System.out.println("your not welcom");
		}
	}

}
