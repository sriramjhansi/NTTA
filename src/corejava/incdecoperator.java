package corejava;

public class incdecoperator 
{
	public void display(int a)
	{
		a++;//11
		System.out.println(a);//12
		a--;//12
		System.out.println(a);//11
		--a;
		System.out.println(a);//10
		
	}
	public incdecoperator(int b)
	{
		b++;
		System.out.println(b);
		
		
	}
	public static void main(String[] args) 
	{
		incdecoperator aa=new incdecoperator(10);
		aa.display(11);
		
	}
	

}
