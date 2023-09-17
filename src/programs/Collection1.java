package programs;

import java.util.ArrayList;

public class Collection1 {

	

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		ArrayList b=new ArrayList();
		b.add("royal");
		b.add("batch");
		b.add("kings");
		System.out.println(b);
		a.add(20165);
		a.add(36536);
		a.add(2016);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.get(1);
		System.out.println(a);
		b.remove(2);
		System.out.println(b);
		b.get(0);
		System.out.println(b);

	}

}
