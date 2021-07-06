package corejava;

public class typecasting 
{
	public void display()
	{
		byte a=10;
		int b=a;
		System.out.println("implicit type casting" +a);
		System.out.println("implicit type casting" +b);
		
	}
	
	public void show()
	{
		int a=10;
		byte b=(byte)a;
		System.out.println("explicit type casting " +a);
		System.out.println("explicit type casting" +b);
	}
	public static void main(String[] args) 
	{
		
		typecasting aa=new typecasting();
		aa.display();
		aa.show();
	}

}
