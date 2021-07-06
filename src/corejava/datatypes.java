package corejava;

public class datatypes 
{
	static int s;
	int a;
	long b;
	float c;
	boolean d;//for instance variable jvm will provide default values
	
	public void display()
	{
		int cc;
		short dd = 0;
		System.out.println(a);
		System.out.println(dd);//for local variables jvm wont provide default values
		System.out.println(s);//for static variables also jvm will provide default values
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) 
	{
		datatypes aa=new datatypes();
		aa.display();
		
	}

}
