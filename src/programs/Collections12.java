package programs;
import java.util.*;
public class Collections12 extends Vector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		Enumeration e=v.elements();
		int i=0;
		while(e.hasMoreElements())
		{
			Object p=e.nextElement();
			System.out.println("no value"+""+p);
		}
	}

}
