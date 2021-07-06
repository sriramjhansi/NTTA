package corejava;

public class statickeyword 
{
	static int a=10;//static variable --if we want to access static variable we can acess directly or we can acess with classname .variable name
	int d=11;
	void display()
	{
		int b=20;
		int c=b+statickeyword.a;
		System.out.println(c);
		System.out.println(statickeyword.a);
		System.out.println(a);
		//static int b=20;--static variable can never be a local variable
	}
	void show()
	{
		int a=20;
		System.out.println(a);
		System.out.println(a);
	}
	static void method1()
	{
		System.out.println(a);
		//System.out.println(d);//we cant access non stATic variables inside a static  method
		statickeyword bb=new statickeyword();
		System.out.println(bb.d);//we can acess non static variables inside static methods by using obj ref
		}
	static
	{
		System.out.println("jyoshna");
	}
	static
	{
		System.out.println("divakar");
	}
	public static void main(String[] args) 
	{
		statickeyword aa=new statickeyword();
		aa.show();
		aa.display();
		method1();//static methods we can call directly,with obj ref,with class 
		statickeyword.method1();
		aa.method1();
		
	}
	static
	{
	 System.out.println("jhansi");//in one class we can create more that one static block
	
	//static blocks will execute first from above main method only 
	
	
	}
	

}


//if there is no static blocks in class, execution starts from main method.
//if there is a static block in class,execution will starts from static block only.
//if final static variables jvm wont provide default values,for static vriabales jvm will provide default values.