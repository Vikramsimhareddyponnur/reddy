package programs;
public class Wraperclass {
	public static void main(String[] args) {
		int a=33;  double b=332.5d; char c='h'; float  d=30.5f; short e=4; long h=5254; boolean g=true; byte i=3;
		Integer oo=new Integer(a);
		Double  oo1=new Double(b);
		Character ll=new Character(c);
		Float uu=new Float(d);
		Short  s=new Short(e);
		Long v=new Long(h);
		Boolean y=new Boolean(g);
		Byte t=new Byte(i);
		System.out.println(oo+"\t"+oo1+"\t"+ll+"\t"+uu+"\t"+s+"\t"+v+"\t"+y+"\t"+t);
		int a1; double b1; char c1;  float d1; short  e1; long h1; boolean g1; byte i1;
		a1=oo; b1=oo1; c1=ll; d1=uu; e1=s; h1=v; g1=y; i1=t;
		System.out.println(a1+"\t"+b1+"\t"+c1+"\t"+d1+"\t"+e1+"\t"+h1+"\t"+g1+"\t"+i1);
	}

}
