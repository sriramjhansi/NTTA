package corejava;

public class inheritance2 extends inhertance1
{
	public void display2()
	{
		System.out.println("jhan");
	}
	public static void main(String[] args) 
	{
		inheritance2 aa=new inheritance2();//is a relationship
		aa.display2();
		aa.display();
		inhertance1 bb=new inhertance1();//has a relation ship
		aa.display();
		aa.show();
		
		
	}

}
