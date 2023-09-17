package programs;
import java.util.*;
public class Collections11 {
	public static void main(String[] args) {
		 Vector <String>i=new Vector<String>();
		 i.add("captian");
		 i.add("marvel");
		 i.add("is");
		 i.add("more  strong");
		 System.out.println(i);
		 ListIterator <String>iterator=i.listIterator();
		 System.out.println("forward direction");
		 while(iterator.hasNext())
		 {
			 String o=iterator.next();
			 System.out.println(o);
		 }
		 System.out.println("backward directions");
		 while(iterator.hasPrevious())
		 {
			 String o1=iterator.previous();	 
			System.out.println(o1);
		 }
	}

}
