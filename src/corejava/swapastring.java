package corejava;

public class swapastring 
{
	public void display()
	{
		String a="good";
		String b="morning";
		System.out.println("before swap: "+a+""+b);
		a=a+b;//goodmorning
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("after:"+a+""+b);
		
	}
	public static void main(String[] args) 
	{
		swapastring aa=new swapastring();
		aa.display();
		
	}

}
