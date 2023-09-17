package programs;

import java.util.*;

public class Collections3 extends LinkedList {

	

	public static void main(String[] args) {
		LinkedList i=new LinkedList();
		i.addFirst("kabbadi");
		i.addFirst("is ");
		System.out.println(i);
		i.addLast("your");
		i.addLast("national");
		System.out.println(i);
		i.getFirst();
		i.getLast();
		System.out.println(i);
		i.removeFirst();
		i.removeLast();
		System.out.println(i);
		
	}

}
