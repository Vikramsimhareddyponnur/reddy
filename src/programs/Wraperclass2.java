package programs;
public class Wraperclass2 {
	public static void main(String[] args) {
		String a="63";  
		int a1=Integer.parseInt(a);
		float a2=Float.parseFloat(a);
		double a3=Double.parseDouble(a);a3++;
		long a4=Long.parseLong(a);
		short a5=Short.parseShort(a);a5--;
		byte a6=Byte.parseByte(a);
		System.out.println(a1+"\t"+a2+"\t"+a3+"\t"+a4+"\t"+a5+"\t"+a6);
	}

}
