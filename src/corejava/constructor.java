package corejava;

public class constructor 
{
	public void display()
	{
		System.out.println("jhansi");
	}
	
	public void show()
	{
		System.out.println("divya");
	}
	public constructor()//this is default constructor
	{
		System.out.println("jyoshna");
	}
	public constructor(int a,int b)//parameterised constructor ..we have to pass values in constructor
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		constructor aa=new constructor(10,15);
		aa.display();
		
		
	}

}
