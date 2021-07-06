package corejava;

public class cj1 

{
	static int b=10;
	int a=10;
	public void method1()
	{
		System.out.println("jhansi");
		cj1 bb=new cj1();
		bb.method2();
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c);//we cant acess local varoiables here
	}
	public void method2()
	{
		int c=10;
		System.out.println("jyoshna");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		cj1 aa=new cj1();
		aa.method1();
		System.out.println(b);
	}
	//java is a case sensitive
}
