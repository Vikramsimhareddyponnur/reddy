package programs;
import java.util.*;

public class Collection2 {
	public static void main(String[] args) {
	Vector <Integer>r=new Vector<Integer>();
	r.addElement(123);
	r.addElement(363);
	r.addElement(6365);
	System.out.println(r); 
	r.removeElement(0);
	System.out.println(363);
	r.get(0);
	System.out.println(r);
	}

}
