package programs;

class sai
{
float d=63.3f;
public void hai()
{
System.out.println("executing the float");
}
}
class hello extends sai
{
}
public class single
{
public static void main(String arg[])
{
hello rr=new hello();
System.out.println(rr.d);
rr.hai();
}
}
 
