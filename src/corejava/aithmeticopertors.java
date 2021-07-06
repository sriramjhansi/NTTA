package corejava;

public class aithmeticopertors
{
	int a=10;
	int b=12;
	public void addition()
	{
		int c=a+b;
		System.out.println(c);
		
	}
	public void subtraction()
	{
		int c=a-b;
		System.out.println(c);
		
	}
	public void mul()
	{
		int c=a*b;
		System.out.println(c);
		
	}
	public void division()
	{
		int c=a/b;
		System.out.println(c);
		
	}
	public void modulodivision()
	{
		int c=a%b;
		System.out.println(c);
		
	}
	public static void main(String[] args)
	{
		aithmeticopertors aa=new aithmeticopertors();
		aa.addition();
		aa.division();
		aa.mul();
		aa.modulodivision();
		aa.subtraction();
		
	}

}
