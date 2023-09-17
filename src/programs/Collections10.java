package programs;
import java.util.*;
public class Collections10 {
	public static void main(String[] args) {
		LinkedList <Integer>oo=new  LinkedList<Integer>();
		oo.add(1);
		oo.add(2);
		oo.add(3);
		oo.add(4);
		System.out.println(oo);
		Iterator o=oo.iterator();
int oo1=0;
while(o.hasNext())
{
	Object a=o.next();
	if(oo1==2)
	{
	o.remove();	
	System.out.println("removed");
	
	}
oo1++;
}
System.out.println(oo);
	}

}
