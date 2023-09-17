package programs;
import java.io.*;
public class Streams1 {

	public static void main(String[] args)throws IOException
	{
		RandomAccessFile r=new RandomAccessFile("\\C:\\Users\\User\\Desktop\\jav.txt","rw");
		//r.seek(r.length()-1);
		String o="java class data";
		r.writeUTF(o);
		System.out.println("written");
		r.close();

	}

}
