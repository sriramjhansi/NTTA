package corejava;

public class swapastring1
{
	public void display()
	{
		int a=10;
		int b=20;
		System.out.println("before swapping");
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		System.out.println("afterv swapping");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		
		
	}
	public static void main(String[] args) 
	{
		swapastring1 aa=new swapastring1();
		aa.display();
		
	}

}
