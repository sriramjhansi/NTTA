package corejava;

public class abstract2 extends abstraction1
{

	@Override
	public void show1() 
	{
		System.out.println("rakhi");
		
	}
	public void display2()
	{
		System.out.println("jhan");
	}
	
	public static void main(String[] args)
	{
		abstract2 aa=new abstract2();
		aa.display2();
		aa.show1();
		aa.display();
		aa.show();
		
	}

}
