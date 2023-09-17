package programs;
import java.io.*;
public class Strream {
	public static void main(String[] args) throws IOException 
	{
		FileInputStream f=new FileInputStream("\\D:\\java examples\\call.java\\");
				
				FileInputStream e=new FileInputStream("\\D:\\java examples\\logical.java\\");
				
				SequenceInputStream si=new SequenceInputStream(f,e);
				int ii=si.read();
		while(ii!=-1)
		{
			System.out.print((char)ii);
			ii=si.read();
		}
		
		si.close();
	}

}
